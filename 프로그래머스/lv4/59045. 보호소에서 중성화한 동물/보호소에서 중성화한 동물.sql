-- 코드를 입력하세요
# ins에선 중성화 X, outs에선 중성화 o
# 중성화 O : Spayed, Neutered  , 중성화 X : Intact


SELECT I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
FROM ANIMAL_INS I JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE I.SEX_UPON_INTAKE LIKE "Intact%"
AND (O.SEX_UPON_OUTCOME LIKE "Spayed%" OR O.SEX_UPON_OUTCOME LIKE "Neutered%")