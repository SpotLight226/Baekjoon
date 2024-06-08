-- with 문을 사용해 일시적으로 사용할 수 있는 각 년도마다의 최대 대장균 크기 집합테이블을 만든다
WITH MAXS AS (SELECT MAX(SIZE_OF_COLONY) AS MAX_SIZE,
                     YEAR(DIFFERENTIATION_DATE) AS YEAR
              FROM ECOLI_DATA
              GROUP BY YEAR)
-- with 문을 사용해 만든 maxs 테이블과 본 ecoli_data 테이블을 조인하여 각 년도마다 최대 크기와의 편차를 구한다
SELECT M.YEAR,
       (M.MAX_SIZE - E.SIZE_OF_COLONY) AS YEAR_DEV,
       E.ID       
FROM MAXS AS M 
INNER JOIN ECOLI_DATA AS E
    ON M.YEAR = YEAR(E.DIFFERENTIATION_DATE)

ORDER BY M.YEAR, YEAR_DEV