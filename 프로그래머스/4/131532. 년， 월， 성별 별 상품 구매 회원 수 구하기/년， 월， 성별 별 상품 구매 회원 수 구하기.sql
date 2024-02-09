select year(os.SALES_DATE) as YEAR, month(os.SALES_DATE) as MONTH, ui.GENDER, count(distinct ui.USER_ID) as USERS
from USER_INFO ui
join ONLINE_SALE os
on ui.USER_ID = os.USER_ID
where ui.GENDER is not null
group by year(os.SALES_DATE), month(os.SALES_DATE), ui.GENDER
order by YEAR, MONTH, ui.GENDER