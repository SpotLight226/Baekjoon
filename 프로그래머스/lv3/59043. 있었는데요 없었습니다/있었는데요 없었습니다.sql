-- 코드를 입력하세요
SELECT ins.animal_id
     , ins.name
FROM animal_ins AS ins
    INNER JOIN animal_outs AS outs
    ON ins.animal_id = outs.animal_id
WHERE outs.datetime < ins.datetime
ORDER BY ins.datetime