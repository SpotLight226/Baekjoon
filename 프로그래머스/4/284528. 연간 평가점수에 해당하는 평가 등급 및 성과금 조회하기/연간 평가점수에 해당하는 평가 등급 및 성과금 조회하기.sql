SELECT E.EMP_NO, -- 사원 번호
       E.EMP_NAME, -- 이름
       CASE
            WHEN AVG_SCORE >= 96
            THEN 'S'
            WHEN AVG_SCORE >= 90
            THEN 'A'
            WHEN AVG_SCORE >= 80
            THEN 'B'
            ELSE 'C'
       END AS GRADE,
       CASE
            WHEN AVG_SCORE >= 96 -- S는 연봉의 20%
            THEN E.SAL*0.2
            WHEN AVG_SCORE >= 90 -- A는 연봉의 15%
            THEN E.SAL*0.15
            WHEN AVG_SCORE >= 80 -- B는 연봉의 10%
            THEN E.SAL*0.1
            ELSE 0 -- 그외는 연봉의 0%이므로 0
       END AS BONUS
FROM HR_EMPLOYEES AS E
JOIN (SELECT EMP_NO,
             AVG(SCORE) AS AVG_SCORE
      FROM HR_GRADE
      GROUP BY EMP_NO) AS G
ON E.EMP_NO = G.EMP_NO
ORDER BY E.EMP_NO