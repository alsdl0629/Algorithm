select info.CAR_ID, info.CAR_TYPE, 
ROUND((info.DAILY_FEE * ((100 - discount.DISCOUNT_RATE) / 100) * 30)) as FEE
from CAR_RENTAL_COMPANY_CAR info
join CAR_RENTAL_COMPANY_RENTAL_HISTORY history
on info.CAR_ID = history.CAR_ID
join CAR_RENTAL_COMPANY_DISCOUNT_PLAN discount
on info.CAR_TYPE = discount.CAR_TYPE
where info.CAR_TYPE in ('세단', 'SUV')
and info.CAR_ID not in 
(
    select CAR_ID
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where START_DATE between '2022-11-01' and '2022-11-30'
    or END_DATE between '2022-11-01' and '2022-11-30'
    or START_DATE <= '2022-11-01' and END_DATE >= '2022-11-30'
)
and discount.DURATION_TYPE = '30일 이상'
group by info.car_id
having FEE >= 500000
and FEE < 2000000
order by FEE DESC, info.CAR_TYPE, info.CAR_ID DESC