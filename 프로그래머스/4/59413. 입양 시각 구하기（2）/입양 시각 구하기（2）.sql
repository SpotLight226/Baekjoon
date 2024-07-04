/*
SELECT HOUR,
       COUNT(ANIMAL_ID) AS COUNT
       -- ROW_NUMVER() OVER(행 번호를 매길 기준 => 비어두면 테이블 순서에 따라 1부터 숫자를 붙인다)
       -- 그래서 ROW_NUMBER() OVER() - 1 을 하여 0부터 붙이게한다
       -- LIMIT으로 24을 설정하여 23까지만 나오게 설정함
FROM (SELECT (ROW_NUMBER() OVER() -1) AS HOUR
      FROM ANIMAL_OUTS
      LIMIT 24) AS 24HOURS -- 24HOURS라는 서브테이블을 만든다
LEFT JOIN ANIMAL_OUTS -- 조인 사항이 없는 것도 나와야 하므로 LEFJOIN
ON 24HOURS.HOUR = HOUR(DATETIME) -- 24HOURS의 테이블과 DATETIME의 시를 외래키로 조인
GROUP BY HOUR
ORDER BY HOUR
*/

-- RECURSIVE 반복문 사용
WITH RECURSIVE HOURS AS (SELECT 0 AS HOUR -- INITIAL_QUERY => HOUR의 값을 0으로 설정하여 시작
                         UNION ALL -- 재귀 쿼리를 계속해서 결합
                         SELECT HOUR + 1 -- RECURSIVE_QUERY => 재귀적으로 호출되어 조건을 만족할 때까지 쿼리 실행
                         FROM HOURS
                         WHERE HOUR < 23) -- 조건 HOUR이 23 보다 작을 때까지 즉 HOUR이 23이 되면 끝
                         
SELECT HOURS.HOUR AS HOUR,
       COUNT(ANIMAL_ID) AS COUNT
FROM ANIMAL_OUTS AS OUTS
RIGHT JOIN HOURS -- HOUR은 오른쪽에 붙어야 하므로 RIGHT JOIN
ON HOURS.HOUR = HOUR(DATETIME) -- HOURS의 HOUR 과 ANIMAL_OUTS의 HOUR을 외래키로 조인
GROUP BY HOURS.HOUR
ORDER BY HOURS.HOUR