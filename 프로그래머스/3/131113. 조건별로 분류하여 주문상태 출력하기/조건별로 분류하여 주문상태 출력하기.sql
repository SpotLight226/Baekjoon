SELECT ORDER_ID,
       PRODUCT_ID,
       DATE_FORMAT(OUT_DATE, '%Y-%m-%d') AS OUT_DATE,
       CASE -- 아웃 데이트에 따라 출고완료, 대기, 미정을 표기하게 CASE WHEN  
       WHEN DATE_FORMAT(OUT_DATE,'%Y-%m-%d') <= '2022-05-01' THEN '출고완료' -- 2022-05-01 이하라면 완료
       WHEN DATE_FORMAT(OUT_DATE,'%Y-%m-%d') > '2022-05-01' THEN '출고대기' -- 2022-05-01 위라면 대기
       ELSE '출고미정' END 출고여부 -- NULL 이라면 출고 미정
FROM FOOD_ORDER
ORDER BY ORDER_ID