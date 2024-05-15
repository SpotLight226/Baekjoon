SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA
WHERE GENOTYPE & 5 -- 1, 3 형질 => 0101(2진수) == 5(10진수) -> 즉 AND 연산을 수행했을 때, TRUE가 나와야 하고
    AND NOT GENOTYPE & 2 -- 2 형질 없어야 => 0010(2진수) == 2(10진수) --> AND 연산을 수행했을 때, FALSE가 나와야 함
