SELECT ROUTE,
       -- SUM = 총합
       -- AVG = 평균
       -- ROUND(반올림할 값, 반올림 완료할 소수점)
       -- CONCAT(문자와 합칠 거 1, 합칠 거 2)
       CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1), 'km') AS TOTAL_DISTANCE, -- 둘째자리 반올림
       CONCAT(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') AS AVERAGE_DISTANCE -- 셋째자리 반올림
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY SUM(D_BETWEEN_DIST) DESC  -- 내림 차순