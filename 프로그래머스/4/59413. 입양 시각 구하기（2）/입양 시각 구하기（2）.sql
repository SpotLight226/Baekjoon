SELECT HOUR,
       COUNT(ANIMAL_ID) AS COUNT
FROM (SELECT (ROW_NUMBER() OVER() -1) AS HOUR
      FROM ANIMAL_OUTS
      LIMIT 24) AS 24HOURS
LEFT JOIN ANIMAL_OUTS
ON 24HOURS.HOUR = HOUR(DATETIME)
GROUP BY HOUR
ORDER BY HOUR