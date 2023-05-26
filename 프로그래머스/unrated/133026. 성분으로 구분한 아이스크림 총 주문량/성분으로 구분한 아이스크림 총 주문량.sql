-- 코드를 입력하세요
SELECT info.ingredient_type
     , SUM(total_order) AS TOTAL_ORDER
FROM first_half AS first
     INNER JOIN icecream_info AS info
     ON first.flavor = info.flavor
GROUP BY info.ingredient_type
ORDER BY total_order 