SELECT ID,
       EMAIL,
       FIRST_NAME,
       LAST_NAME
FROM DEVELOPERS
/* SKILL_CODE 는 가지고 있는 스킬들의 2진수를 합친 것
   Python은 100000000(256) C# 은 10000000000(1024)
   그렇다면 각 SKILL_CODE 와 Python, C# 의 CODE 를 
   비트 연산자 & (AND => 비트가 둘 다 1, 1 일 때만 1)로 연산하면
   Python, C# 둘 중 하나라도 있을 때, 해당하는 2진수 값이 나오므로
   해당 2진수의 10진수 형태가 256 OR 1024 인 것만 검색한다
   EX) 110010000 (2진수)
       & (AND)
       100000000 (2진수)
       => 100000000 (2진수)
*/
WHERE SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python') 
    OR SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#') 
ORDER BY ID;