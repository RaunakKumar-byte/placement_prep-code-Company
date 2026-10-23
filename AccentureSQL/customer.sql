SELECT
p.category,
sum((oi.unit_price)*(oi.quantity)) as total_revenue
from 
customer as c 
JOIN
orders as O
on c.customer_id=o.customer_id
join
orderitems as oi
on o.order_id=oi.order_id
join
products as p 
on oi.product_id=p.product_id

where c.city="delhi" or c.city="bengaluer"or c.city="Mumbai"
group by p.category
order by 
    total_revenue DESC
    p.category asc;



