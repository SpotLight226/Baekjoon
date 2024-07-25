-- 개발자와 스킬코드를 JOIN해서 PYTHON, C#, FRONTEND의 기술을 각 사람마다 표기
WITH SKILLS AS (SELECT D.ID,
                       D.EMAIL,
                       -- 각 개발자에 대해 하나의 행으로 결과를 그룹화하기 위해서 각 행을 MAX로
                       MAX(CASE WHEN S.NAME = 'Python' THEN 1 ELSE 0 END) AS PYTHON_YN,
                       MAX(CASE WHEN S.NAME = 'C#' THEN 1 ELSE 0 END) AS CSHAP_YN,
                       MAX(CASE WHEN S.CATEGORY = 'Front End' THEN 1 ELSE 0 END) AS FRONT_YN
                FROM DEVELOPERS AS D
                JOIN SKILLCODES AS S
                  ON (D.SKILL_CODE & S.CODE > 0)
                GROUP BY D.ID,
                         D.EMAIL)

SELECT CASE
            WHEN PYTHON_YN = 1 AND FRONT_YN = 1 THEN 'A' -- 파이썬, 프론트 엔드 가 1일때 A
            WHEN CSHAP_YN = 1 THEN 'B' -- C# 1일 때 B
            WHEN FRONT_YN = 1 THEN 'C' -- 프론트엔드 가 1 일 때 C
            ELSE NULL -- 아무것도 없다면 NULL
       END AS GRADE,
       ID,
       EMAIL
FROM SKILLS
HAVING GRADE IS NOT NULL -- GRADE가 NULL이 아닌 것만
ORDER BY GRADE,
         ID