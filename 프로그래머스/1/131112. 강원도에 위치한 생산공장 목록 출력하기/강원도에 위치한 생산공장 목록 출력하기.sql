SELECT FACTORY_ID, -- 공장 ID
       FACTORY_NAME, -- 공장 이름
       ADDRESS -- 주소
FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%' -- 주소가 강원도 로 시작되는 것들만
ORDER BY FACTORY_ID