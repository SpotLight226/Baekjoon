SELECT (price-price%10000) PRICE_GROUP
     , COUNT(*)
FROM product
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP