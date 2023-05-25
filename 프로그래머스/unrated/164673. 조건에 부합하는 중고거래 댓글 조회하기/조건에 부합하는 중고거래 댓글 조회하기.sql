-- 코드를 입력하세요
SELECT board.title
     , board.board_id
     , reply.reply_id
     , reply.writer_id
     , reply.contents
     , DATE_FORMAT(reply.created_date, '%Y-%m-%d')
FROM used_goods_board AS board
    INNER JOIN used_goods_reply AS reply
    ON board.board_id = reply.board_id
WHERE MONTH(board.created_date) = '10'
ORDER BY reply.created_date, board.title 