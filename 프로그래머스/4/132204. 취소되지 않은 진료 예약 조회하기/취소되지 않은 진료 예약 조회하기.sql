SELECT A.APNT_NO, -- 예약 번호
       P.PT_NAME, -- 환자이름
       P.PT_NO, -- 환자번호
       D.MCDP_CD, -- 진료과 코드
       D.DR_NAME, -- 의사 이름
       A.APNT_YMD -- 예약 일시
FROM APPOINTMENT AS A
JOIN PATIENT AS P
    ON A.PT_NO = P.PT_NO
JOIN DOCTOR AS D
    ON A.MDDR_ID = D.DR_ID
WHERE APNT_YMD LIKE '2022-04-13%'
    AND APNT_CNCL_YN = 'N'
ORDER BY APNT_YMD 