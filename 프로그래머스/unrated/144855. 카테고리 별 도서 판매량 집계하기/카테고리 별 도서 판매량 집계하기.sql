-- 코드를 입력하세요
SELECT category
     , SUM(sales) AS total_sales
FROM book
    JOIN (SELECT book_id
               , SUM(sales) AS sales
          FROM book_sales
          WHERE MONTH(sales_date) = '01'
          GROUP BY book_id) AS sale
    ON book.book_id = sale.book_id
GROUP BY category
ORDER BY category

