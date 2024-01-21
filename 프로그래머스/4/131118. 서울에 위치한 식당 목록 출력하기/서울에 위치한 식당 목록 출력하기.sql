select ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES, ri.ADDRESS, ROUND(AVG(rr.REVIEW_SCORE), 2) as SCORE
from REST_INFO ri
join REST_REVIEW rr
on ri.REST_ID = rr.REST_ID
where ri.ADDRESS like '서울%'
group by ri.REST_ID
order by SCORE DESC, ri.FAVORITES DESC