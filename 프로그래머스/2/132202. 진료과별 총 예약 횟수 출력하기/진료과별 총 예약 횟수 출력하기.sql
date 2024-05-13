SELECT MCDP_CD AS 진료과코드,
       COUNT(*) AS 5월예약건수 -- 각 그룹들의 COUNT 
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%' -- 예약 날짜가 2022-05 로 시작하는 것만
GROUP BY MCDP_CD -- 진료과 코드로 그룹화
ORDER BY 5월예약건수,
         진료과코드
