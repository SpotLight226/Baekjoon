SELECT ID,
       LENGTH
FROM FISH_INFO
ORDER BY LENGTH DESC, -- 길이로 내림차순 정렬
         ID -- 길이 같을 시, 다른 정렬 기준 ID로 오름차순
LIMIT 10 -- 10마리로 제한

