SELECT ANIMAL_TYPE, -- 생물 종
       IFNULL(NAME, 'No name') AS NAME, -- IFNULL(컬럼, NULL일 시 표시할 값)
       SEX_UPON_INTAKE -- 중성화 여부
FROM ANIMAL_INS
ORDER BY ANIMAL_ID -- 아이디 순으로 오름차순