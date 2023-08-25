-- 코드를 입력하세요
# 조회수가 가장 높은 중고거래 게시물 -> 파일 경로 
# USED_GOODS_BOARD에서 조회수가 가장 높은 ROW의 BOARD_ID와 FILE의 BOARD_ID가 같은 것을 찾으면 되는거 아녀
SELECT CONCAT("/home/grep/src/", F.BOARD_ID, "/", F.FILE_ID, F.FILE_NAME, F.FILE_EXT) AS FILE_PATH
FROM (SELECT *
    FROM (SELECT *
        FROM USED_GOODS_BOARD
        ORDER BY VIEWS DESC) A
     LIMIT 1) U JOIN USED_GOODS_FILE F ON U.BOARD_ID = F.BOARD_ID
ORDER BY F.FILE_ID DESC




