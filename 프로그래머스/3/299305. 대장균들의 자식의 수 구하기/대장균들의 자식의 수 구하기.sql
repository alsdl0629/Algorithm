SELECT A.ID, IFNULL(
    (
        SELECT COUNT(*)
        FROM ECOLI_DATA B
        GROUP BY B.PARENT_ID
        HAVING B.PARENT_ID = A.ID
    ), 0
) as CHILD_COUNT
FROM ECOLI_DATA A
ORDER BY A.ID