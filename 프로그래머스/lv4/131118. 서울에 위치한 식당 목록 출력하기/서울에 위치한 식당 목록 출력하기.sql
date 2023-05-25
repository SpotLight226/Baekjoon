-- 코드를 입력하세요
SELECT info.rest_id
     , info.rest_name
     , info.food_type
     , info.favorites
     , info.address
     , ROUND(AVG(review.review_score), 2) AS SCORE
FROM rest_info AS info
    INNER JOIN rest_review AS review
    ON info.rest_id = review.rest_id
    GROUP BY review.rest_id
HAVING address LIKE '서울%'    
ORDER BY SCORE DESC
       , info.favorites DESC

