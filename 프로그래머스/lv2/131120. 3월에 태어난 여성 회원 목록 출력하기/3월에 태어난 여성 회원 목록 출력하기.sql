-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD')
FROM MEMBER_PROFILE
WHERE TLNO IS NOT NULL AND TO_CHAR(DATE_OF_BIRTH, 'MM') LIKE '03' AND GENDER = 'W'
ORDER BY MEMBER_ID;