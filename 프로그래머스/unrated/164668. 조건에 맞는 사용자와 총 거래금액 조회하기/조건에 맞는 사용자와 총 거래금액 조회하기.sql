-- 코드를 입력하세요
SELECT user_id
     , nickname
     , board.total_sales
FROM used_goods_user AS user
    INNER JOIN (SELECT writer_id
                    , SUM(price) AS total_sales
               FROM used_goods_board
               GROUP BY writer_id, status
               HAVING status = 'DONE') AS board
    ON user.user_id = board.writer_id
WHERE total_sales >= 700000    
ORDER BY total_sales 