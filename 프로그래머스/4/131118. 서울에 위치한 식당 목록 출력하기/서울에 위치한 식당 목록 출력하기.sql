-- 코드를 입력하세요
SELECT INFO.REST_ID,
       INFO.REST_NAME,
       INFO.FOOD_TYPE,
       INFO.FAVORITES,
       INFO.ADDRESS,
       -- REVIEW 테이블의 REVIEW_SCORE의 평균을 소수점 세번째 자리에서 반올림
       ROUND(AVG(REVIEW.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO AS INFO
INNER JOIN REST_REVIEW AS REVIEW -- 식당 정보 테이블과 리뷰 테이블을 REST_ID를 키로 INNER_JOIN
    ON INFO.REST_ID = REVIEW.REST_ID
    GROUP BY REVIEW.REST_ID -- REVIEW 테이블의 REST_ID 로 그룹을 만든다
HAVING INFO.ADDRESS LIKE '서울%' -- 그룹화된 데이터에서 정보 테이블에서 address가 서울 로 시작하는 데이터
ORDER BY SCORE DESC
    ,INFO.FAVORITES DESC
