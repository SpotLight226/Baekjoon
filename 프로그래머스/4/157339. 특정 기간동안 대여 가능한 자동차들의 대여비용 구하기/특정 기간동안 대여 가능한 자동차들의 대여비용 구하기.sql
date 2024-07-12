WITH ABLES AS (
               SELECT CAR_ID
               FROM CAR_RENTAL_COMPANY_CAR AS CARS
               WHERE CAR_TYPE IN ('SUV', '세단')
                 -- NOT EXISTS 조건을 만족하는 행이 존재하지 않을 때 참
                 -- 대여된 시작일이 2022년 11월 30일 이전
                 -- 대여된 종료일이 2022년 11월 1일 이후
                 -- 이 조건에 맞는 차는 11월에 대여가 되는 차들을 의미
                 -- 그래서 둘 다 없어야만 11월 에 대여 가능
                 AND NOT EXISTS (SELECT CAR_ID
                                 FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS HIS
                                 WHERE HIS.CAR_ID = CARS.CAR_ID
                                   AND HIS.START_DATE <= '2022-11-30'
                                   AND HIS.END_DATE >= '2022-11-01')
              ),

DIS AS (
        SELECT CAR_TYPE, DISCOUNT_RATE
        FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
        WHERE DURATION_TYPE = '30일 이상'
       )

SELECT 
    AB.CAR_ID,
    CARS.CAR_TYPE,
    ROUND(CARS.DAILY_FEE * (1 - DIS.DISCOUNT_RATE * 0.01) * 30, 0) AS FEE
FROM ABLES AS AB
JOIN CAR_RENTAL_COMPANY_CAR AS CARS
  ON AB.CAR_ID = CARS.CAR_ID
JOIN DIS
  ON CARS.CAR_TYPE = DIS.CAR_TYPE
WHERE CARS.DAILY_FEE * (1 - DIS.DISCOUNT_RATE * 0.01) * 30 >= 500000
  AND CARS.DAILY_FEE * (1 - DIS.DISCOUNT_RATE * 0.01) * 30 < 2000000
ORDER BY CARS.DAILY_FEE * (1 - DIS.DISCOUNT_RATE * 0.01) * 30 DESC,
         CARS.CAR_TYPE,
         AB.CAR_ID DESC;