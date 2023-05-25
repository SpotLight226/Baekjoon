-- 코드를 입력하세요
SELECT half.flavor
FROM first_half AS half
    INNER JOIN icecream_info AS info
    ON half.flavor = info.flavor
WHERE info.ingredient_type = 'fruit_based'
AND half.total_order > 3000
ORDER BY half.total_order DESC