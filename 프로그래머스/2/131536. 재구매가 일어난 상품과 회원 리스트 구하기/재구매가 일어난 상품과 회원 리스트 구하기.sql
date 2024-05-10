SELECT USER_ID,
       PRODUCT_ID
FROM ONLINE_SALE
-- USER_ID, PRODUCT_ID 로 그룹화 한 후
GROUP BY USER_ID,
         PRODUCT_ID
HAVING COUNT(*) >= 2 -- 각 그룹에 속한 레코드 수가 2개 이상인 것만
ORDER BY USER_ID, -- USER_ID 로 오름차순
         PRODUCT_ID DESC -- PRODUCT_ID 로 내림차순
