-- 코드를 입력하세요

SELECT YEAR(O.SALES_DATE) AS YEAR, MONTH(O.SALES_DATE) AS MONTH, U.GENDER, COUNT(DISTINCT O.USER_ID) AS USERS 
FROM (SELECT *
    FROM USER_INFO
    WHERE GENDER IS NOT NULL) U 
    JOIN ONLINE_SALE O ON U.USER_ID = O.USER_ID
GROUP BY 1, 2, 3
ORDER BY 1, 2, 3