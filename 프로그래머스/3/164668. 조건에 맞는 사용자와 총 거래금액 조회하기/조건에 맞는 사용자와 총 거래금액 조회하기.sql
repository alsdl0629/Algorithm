select u.USER_ID, u.NICKNAME, sum(b.PRICE) as TOTAL_SALES 
from USED_GOODS_USER u
join USED_GOODS_BOARD b
on u.USER_ID = b.WRITER_ID
where b.STATUS = 'DONE'
group by u.USER_ID
having sum(b.PRICE) >= 700000
order by TOTAL_SALES