-- 코드를 입력하세요
SELECT DR_NAME,
       DR_ID,
       MCDP_CD,
       DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD = 'CS'
OR MCDP_CD = 'GS' -- 확인 조건이 또는 => OR
ORDER BY HIRE_YMD DESC -- 내림차순 정렬 => DESC
        ,DR_NAME -- 고용일자 같다면 이름으로 오름차순 정렬