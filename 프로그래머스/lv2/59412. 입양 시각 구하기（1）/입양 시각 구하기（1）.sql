-- 코드를 입력하세요
SELECT DATE_FORMAT(datetime, '%H') AS HOUR
     , COUNT(DATE_FORMAT(datetime, '%H'))
FROM animal_outs
WHERE DATE_FORMAT(datetime, '%H') BETWEEN '09' AND '20'
GROUP BY HOUR
ORDER BY HOUR
