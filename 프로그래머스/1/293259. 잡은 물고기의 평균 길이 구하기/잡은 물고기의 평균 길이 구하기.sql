-- ROUND(반올림할 값, 반올림해서 나올 소수점 위치)
-- AVG(선택할 컬럼) => 선택한 컬럼 값들의 평균
-- IFNULL(컬럼, NULL일 시 대체할 값)
-- 합쳐서 반올림(평균(NULL이면 10으로 대체))
SELECT ROUND(AVG(IFNULL(LENGTH, '10')), 2) AS AVERAGE_LENGTH
FROM FISH_INFO

