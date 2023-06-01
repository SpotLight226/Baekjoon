-- 코드를 입력하세요
SELECT ins.name
     , ins.datetime
FROM animal_ins AS ins
    LEFT JOIN animal_outs as outs
    on ins.animal_id = outs.animal_id
WHERE outs.animal_id IS NULL
ORDER BY ins.datetime
LIMIT 3