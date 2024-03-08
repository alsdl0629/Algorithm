select ai.ANIMAL_ID, ai.ANIMAL_TYPE, ai.NAME
from ANIMAL_INS ai, ANIMAL_OUTS ao
where ai.ANIMAL_ID = ao.ANIMAL_ID
and ai.SEX_UPON_INTAKE like 'Intact%'
and (ao.SEX_UPON_OUTCOME like 'Spayed%' or ao.SEX_UPON_OUTCOME like 'Neutered%')