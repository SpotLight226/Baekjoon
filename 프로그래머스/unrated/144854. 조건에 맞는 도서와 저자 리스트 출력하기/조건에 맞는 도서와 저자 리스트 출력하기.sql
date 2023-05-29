-- 코드를 입력하세요
SELECT book_id
     , a.author_name
     , DATE_FORMAT(b.published_date, '%Y-%m-%d')
FROM (SELECT *
      FROM book
      WHERE category = '경제') AS b
    INNER JOIN author AS a
    ON b.author_id = a.author_id
ORDER BY b.published_date 

