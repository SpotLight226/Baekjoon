-- 코드를 입력하세요
SELECT b.author_id
     , author_name
     , category
     , SUM(price * sales) AS TOTAL_SALES
FROM book b
    INNER JOIN author a
    ON b.author_id = a.author_id
    INNER JOIN book_sales s
    ON b.book_id = s.book_id
WHERE DATE_FORMAT(sales_date, '%Y-%m') = '2022-01'

GROUP BY b.author_id, category
ORDER BY b.author_id
       , category DESC
       