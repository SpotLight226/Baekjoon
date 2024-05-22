SELECT COUNT(*) -- 조건에 맞는 것을 카운트
FROM USER_INFO
WHERE AGE IS NULL -- 나이 정보가 없는 회원을 찾기 때문에 NULL 인 것만