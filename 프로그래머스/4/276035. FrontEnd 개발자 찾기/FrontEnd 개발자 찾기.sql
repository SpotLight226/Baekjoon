SELECT ID,
       EMAIL,
       FIRST_NAME,
       LAST_NAME
FROM DEVELOPERS
/* 조건 절에 서브쿼리로
   SKILLCODE 에 GATEGORY가 FRONT END 인 것들의 합과 비트 &(AND) 연산을 했을 때,
   TRUE가 나오는 것들만
   GROUP BY 하는 이유는 서브 쿼리는 1 행의 결과만 가능하다
   비트 연산을 수행할 때, 1, 1 일 때만 TRUE이므로 
   FRONT END인 CODE만 합쳐서 서브쿼리 값을 만든다
*/
WHERE SKILL_CODE & (SELECT SUM(CODE) 
                    FROM SKILLCODES 
                    WHERE CATEGORY = 'Front End'
                    GROUP BY CATEGORY)
ORDER BY ID