-- 코드를 입력하세요
SELECT product_code
     , price * total_sales AS sales
FROM product AS p
    INNER JOIN (SELECT product_id
                     , SUM(sales_amount) AS total_sales
                FROM offline_sale
                GROUP BY product_id) AS sale
    ON p.product_id = sale.product_id
ORDER BY sales DESC, product_code
