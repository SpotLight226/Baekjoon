WITH RECURSIVE GEN AS (SELECT ID,
                              PARENT_ID,
                              1 AS GENERATION
                       FROM ECOLI_DATA
                       WHERE PARENT_ID IS NULL
                       UNION ALL
                       SELECT ECO.ID,
                              ECO.PARENT_ID,
                              GEN.GENERATION +1
                       FROM ECOLI_DATA AS ECO
                       JOIN GEN
                         ON ECO.PARENT_ID = GEN.ID)
                        
SELECT COUNT(*) AS COUNT,
       GENERATION
FROM GEN
WHERE ID NOT IN (SELECT PARENT_ID
                 FROM GEN
                 WHERE PARENT_ID IS NOT NULL)
GROUP BY GENERATION
ORDER BY GENERATION