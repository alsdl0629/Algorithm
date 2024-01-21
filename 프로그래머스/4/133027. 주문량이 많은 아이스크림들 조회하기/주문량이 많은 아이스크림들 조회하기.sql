# select sum(fh.FLAVOR) as FLAVOR
# from FIRST_HALF fh
# join JULY j
# on fh.FLAVOR = j.FLAVOR
# group by fh.FLAVOR
# order by FLAVOR DESC
# limit 3

select fh.FLAVOR
from FIRST_HALF fh
join JULY j
on fh.FLAVOR = j.FLAVOR
group by fh.FLAVOR
order by sum(fh.TOTAL_ORDER) DESC
limit 3