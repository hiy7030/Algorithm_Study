-- 코드를 입력하세요
# 입양 X -> 입양 정보 X INS에는 있고 OUTS에는 없는 것을 찾아야 함
SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS I LEFT JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE O.ANIMAL_ID IS NULL
ORDER BY I.DATETIME
LIMIT 3