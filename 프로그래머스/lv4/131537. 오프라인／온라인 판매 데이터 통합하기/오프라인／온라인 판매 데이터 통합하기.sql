-- 코드를 입력하세요
SELECT DATE_FORMAT(sales_date, '%Y-%m-%d') AS sales_date
     , product_id
     , user_id
     , sales_amount
FROM online_sale
WHERE MONTH(sales_date) = '03'
AND YEAR(sales_date) = '2022'

UNION ALL

SELECT DATE_FORMAT(sales_date, '%Y-%m-%d') AS sales_date
     , product_id
     , NULL AS user_id
     , sales_amount
FROM offline_sale
WHERE MONTH(sales_date) = '03'
AND YEAR(sales_date) = '2022'
ORDER BY sales_date
       , product_id
       , user_id
