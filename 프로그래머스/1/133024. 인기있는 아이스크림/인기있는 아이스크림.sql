-- 코드를 입력하세요
SELECT FLAVOR
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC -- 총 주문량 내림차순
    , SHIPMENT_ID -- 같다면 출하 번호 오름차순