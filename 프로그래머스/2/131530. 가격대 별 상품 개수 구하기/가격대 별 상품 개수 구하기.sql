-- 코드를 입력하세요
SELECT FLOOR(PRICE / 10000) * 10000 as PRICE_GROUP, COUNT(*) as PRODUCTS 
FROM PRODUCT
GROUP BY FLOOR(PRICE / 10000)
ORDER BY PRICE_GROUP