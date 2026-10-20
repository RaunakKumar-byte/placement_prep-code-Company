SELECT
    co.course_title,
    ca.category_name,
    co.price
    FROM
    categories as ca 
    JOIN
    courses as co 
    on ca.category_id=co.category_id
    where co.price > (select AVG(co2.price) from courses as co2 where co2.category_id=ca.category_id);
