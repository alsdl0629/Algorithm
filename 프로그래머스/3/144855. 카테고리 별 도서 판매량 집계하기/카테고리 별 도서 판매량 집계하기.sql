select b.CATEGORY, sum(bs.SALES) as TOTAL_SALES
from BOOK b
join BOOK_SALES bs on b.BOOK_ID = bs.BOOK_ID
where bs.SALES_DATE between '2022-01-01' and '2022-01-31'
group by b.CATEGORY
order by b.CATEGORY