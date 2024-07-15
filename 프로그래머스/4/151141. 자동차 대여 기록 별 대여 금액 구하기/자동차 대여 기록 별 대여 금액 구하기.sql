-- 대여 기록테이블과 자동차 정보 테이블을 조인하여 각 대여 기록에 대하여 대여 일수 임시 테이블 생성
WITH TRUCKS_HISTORY AS (SELECT HIS.HISTORY_ID, -- 대여 기록 ID
                               HIS.CAR_ID, -- 차 ID
                               CARS.DAILY_FEE, -- 일일 대여 요금
                               HIS.RENTAL, -- 대여 일수
                               CASE
                                    WHEN HIS.RENTAL >= 90 THEN '90일 이상'
                                    WHEN HIS.RENTAL >= 30 THEN '30일 이상'
                                    WHEN HIS.RENTAL >= 7 THEN '7일 이상'
                                    ELSE NULL 
                               END AS DURATION_TYPE -- 대여 기간 종류
                        FROM (SELECT HISTORY_ID,
                                     CAR_ID,
                                     DATEDIFF(END_DATE, START_DATE) + 1 AS RENTAL -- 첫 날도 포함하여 + 1
                              FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY) AS HIS
                              JOIN CAR_RENTAL_COMPANY_CAR AS CARS
                                ON HIS.CAR_ID = CARS.CAR_ID -- CAR_ID를 이용해 조인
                              WHERE CAR_TYPE = '트럭') -- CAR_TYPE이 트럭인 것만

SELECT TH.HISTORY_ID,
       -- CASE 구문은 단순한 형태에서는 뒤에 조건을 비교할 열이름이나 식을 적고 WHEN절에 해당 조건이 TRUE일때 실행 코드 작성
       -- 조건 형태에서는 각 WHEN 절에서 바로 조건을 비교하게 작성 가능
       -- IFNULL 이용시 CASE IFNULL(TH.DURATION_TYPE, 0)
       CASE -- 각 기간 종류에 따라 요금 계산
            WHEN TH.DURATION_TYPE IS NULL THEN TH.DAILY_FEE * TH.RENTAL -- NULL 이용시
            WHEN '7일 이상' THEN ROUND(TH.DAILY_FEE * TH.RENTAL * (1 - DIS.DISCOUNT_RATE * 0.01), 0)
            WHEN '30일 이상' THEN ROUND(TH.DAILY_FEE * TH.RENTAL * (1 - DIS.DISCOUNT_RATE * 0.01), 0)
            ELSE ROUND(TH.DAILY_FEE * TH.RENTAL * (1 - DIS.DISCOUNT_RATE * 0.01), 0) -- 90일 이상
        END AS FEE
FROM TRUCKS_HISTORY AS TH
LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS DIS
       -- 할인 정책의 자동차 종류가 트럭이며 트럭의 대여 기록 DURATION_TYPE 을 이용해 조인
       ON DIS.CAR_TYPE = '트럭' AND TH.DURATION_TYPE = DIS.DURATION_TYPE
ORDER BY FEE DESC, -- 요금에 따라 내림차순
         TH.HISTORY_ID DESC -- 요금 같으면 기록 ID로