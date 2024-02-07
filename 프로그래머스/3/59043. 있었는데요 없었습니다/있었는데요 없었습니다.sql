select ai.ANIMAL_ID, ai.NAME
from ANIMAL_INS ai
join ANIMAL_OUTS ao
on ai.ANIMAL_ID = ao.ANIMAL_ID
where ai.DATETIME > ao.DATETIME	
order by ai.DATETIME