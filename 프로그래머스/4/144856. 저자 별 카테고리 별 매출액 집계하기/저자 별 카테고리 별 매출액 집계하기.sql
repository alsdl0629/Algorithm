select a.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY, sum(b.PRICE * bs.SALES) as TOTAL_SALES
from AUTHOR a
join BOOK b
on a.AUTHOR_ID = b.AUTHOR_ID
join BOOK_SALES bs
on b.BOOK_ID = bs.BOOK_ID
where bs.SALES_DATE between '2022-01-01' and '2022-01-31'
group by a.AUTHOR_ID, b.CATEGORY
order by a.AUTHOR_ID, b.CATEGORY DESC
# 3 = 51