SELECT DISTINCT o1.user_id
              , o1.product_id
FROM online_sale o1
    INNER JOIN online_sale o2
    ON o1.product_id = o2.product_id
WHERE o1.user_id = o2.user_id
AND o1.sales_date <> o2.sales_date
ORDER BY o1.user_id, o1.product_id DESC
