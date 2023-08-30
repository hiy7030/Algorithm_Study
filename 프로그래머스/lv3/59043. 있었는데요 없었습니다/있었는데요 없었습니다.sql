-- 코드를 입력하세요
# ANIMAL_INS.DATETIME > ANIMAL_OUTS.DATETIME 인 경우만 
SELECT I.ANIMAL_ID, I.NAME
FROM ANIMAL_INS I, ANIMAL_OUTS O
WHERE O.DATETIME < I.DATETIME AND I.ANIMAL_ID = O.ANIMAL_ID 
ORDER BY I.DATETIME