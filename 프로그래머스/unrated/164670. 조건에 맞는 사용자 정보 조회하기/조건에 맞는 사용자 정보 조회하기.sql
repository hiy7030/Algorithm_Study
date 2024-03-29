-- 코드를 입력하세요
# 중고거래 게시물 3건 이상 등록한 사용자 
# USED_GOODS_USER 의 USER_ID = USED_GOODS_BOARD의 WRITER_ID	
SELECT U.USER_ID, U.NICKNAME, 
    CONCAT(U.CITY, " ", U.STREET_ADDRESS1, " ",U.STREET_ADDRESS2) AS "전체주소", 
    INSERT(INSERT(U.TLNO, 4, 0, "-"), 9, 0, "-") AS "전화번호"
FROM (SELECT WRITER_ID
    FROM USED_GOODS_BOARD
    GROUP BY WRITER_ID
    HAVING COUNT(WRITER_ID) >= 3) W JOIN USED_GOODS_USER U ON W.WRITER_ID = U.USER_ID
ORDER BY U.USER_ID DESC