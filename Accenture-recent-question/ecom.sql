SELECT
p.category,
SUM(oi.quantity * oi.unit_price) as total_revenue
from
    customers as c
    JOIN
    orders as o
    on c.customer_id=o.customer_id
    JOIN
    orderItems as oi
    on o.order_id=oi.order_id
    JOIN
    product as p 
    on oi.product_id=p.product_id

        where c.city='Mumbai' OR
            c.city='Bengaluru' OR
            c.city='Delhi'
    group by p.category
    order by total_revenue DESC,
                category ASC;
