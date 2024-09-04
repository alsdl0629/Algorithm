SELECT P.PRODUCT_CODE, P.PRICE * SUM(OS.SALES_AMOUNT) AS SALES
FROM PRODUCT P
JOIN OFFLINE_SALE OS
ON P.PRODUCT_ID = OS.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY SALES DESC, P.PRODUCT_CODE