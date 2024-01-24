select MCDP_CD as 진료과코드, count(PT_NO) as 5월예약건수
from APPOINTMENT
where APNT_YMD between '2022-05-01' and '2022-05-31'
group by MCDP_CD
order by 5월예약건수, 진료과코드