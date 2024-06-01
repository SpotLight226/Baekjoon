SELECT P.ID, -- P의 ID
       -- P에서 퍼센트 순위로 계산한 것을 각 기준에 따라 나타낼 문자를 정의
       CASE WHEN P.PER <= 0.25 THEN 'CRITICAL'
            WHEN P.PER <= 0.5 THEN 'HIGH'
            WHEN P.PER <= 0.75 THEN 'MEDIUM'
            ELSE 'LOW' END AS COLONY_NAME
FROM (SELECT ID,
             /*
                PERCENT_RANK() OVER
                -> 특정 값이 전체 데이터에서 차지하는 상대적인 위치를 계산하는 함수(퍼센트)
                * 비슷한 함수
                  ROW_NUMBER() OVER => 각 행에 대해서 고유한 번호 할당
                  RANK() OVER => 순위를 매기되, 동일한 값에는 동일한 순위 할당하고 그 다음 순위는 건너 뜀
                  DENSE_RANK() OVER => 동일한 값에는 동일한 순위 할당하지만, 다음 순위 건너 뛰기 X
                
                OVER 뒤의 () 의 기준에 대한 설정
                PARTITION BY: 데이터 집합을 특정 컬럼 기준으로 파티션으로 나누기 (각 그룹 별로 순위 매기기)
                ORDER BY: 데이터 집합을 특정 기준에 따라 정렬 (정렬하여 순위 매기기)
                ROWS 또는 RANGE: 윈도우 프레임을 정의하여 특정 범위의 행에 대해 계산을 수행
             */
             PERCENT_RANK() OVER 
                            -- SIZE_OF_COLONY 행 집합 내에서 SIZE 기준으로 내림차순 정렬
                            (ORDER BY SIZE_OF_COLONY DESC) AS PER -- 퍼센트 순위 계산한 것을 PER 이라 정의
      FROM ECOLI_DATA) AS P -- ID 와 퍼센트 순위 계산한 서브 쿼리를 P 라 정의
ORDER BY P.ID
