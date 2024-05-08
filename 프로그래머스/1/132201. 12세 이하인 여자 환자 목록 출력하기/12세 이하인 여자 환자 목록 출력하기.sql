-- 코드를 입력하세요
SELECT PT_NAME, 
       PT_NO, 
       GEND_CD,
       AGE, 
       IFNULL(TLNO, 'NONE') AS TLNO -- IFNULL => IFNULL(컬럼명, 값이 없다면 해당 값(문장)으로 표기)
FROM PATIENT
WHERE AGE <= 12 -- 나이가 12세 이하
AND GEND_CD = 'W' -- 여자
ORDER BY AGE DESC, PT_NAME -- AGE 기준 내림차순(DESC), 다음 정렬 기준 PT_NAME
