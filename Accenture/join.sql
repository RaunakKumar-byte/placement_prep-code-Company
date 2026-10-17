SELECT
co.course_title,
ca.category_name,
co.price
from 
categories as ca 
join 
courses as co  
on ca.category_id=co.category_id
where co.price>(select avg(c2.price) from courses as c2
where c2.category_id=ca.category_id);