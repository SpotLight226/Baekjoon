SELECT YEAR(YM) AS YEAR, -- 년
       -- 소수 셋째 자리 반올림 ROUND(반올림할 값, 최종 소수 자리)
       -- 평균 AVG(컬럼)
       ROUND(AVG(PM_VAL1),2) AS 'PM10', -- 미세먼지 평균
       ROUND(AVG(PM_VAL2),2) AS 'PM2.5' -- 초미세먼지 평균
FROM AIR_POLLUTION
WHERE LOCATION2 = '수원'
GROUP BY YEAR(YM)
ORDER BY YEAR