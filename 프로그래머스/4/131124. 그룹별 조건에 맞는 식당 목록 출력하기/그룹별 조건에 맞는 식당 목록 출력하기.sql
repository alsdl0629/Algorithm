select member.MEMBER_NAME, review.REVIEW_TEXT, 
date_format(review.REVIEW_DATE, '%Y-%m-%d') as REVIEW_DATE
from MEMBER_PROFILE member
join REST_REVIEW review
on member.MEMBER_ID = review.MEMBER_ID
where member.MEMBER_ID = 
(
    select MEMBER_ID
    from REST_REVIEW
    group by MEMBER_ID
    order by count(MEMBER_ID) DESC limit 1
)
order by review.REVIEW_DATE, review.REVIEW_TEXT