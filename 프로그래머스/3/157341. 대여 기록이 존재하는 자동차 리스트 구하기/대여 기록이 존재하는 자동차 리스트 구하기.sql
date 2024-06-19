SELECT DISTINCT CAR_ID -- 중복 제거 distinct
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE MONTH(START_DATE) = 10  -- 10월 대여시작
    -- car id가 세단인 것들만 서브 쿼리로 뽑아서 조건으로
    AND CAR_ID IN (SELECT CAR_ID 
                   FROM CAR_RENTAL_COMPANY_CAR
                   WHERE CAR_TYPE = '세단')
ORDER BY CAR_ID DESC -- id기준 내림차순