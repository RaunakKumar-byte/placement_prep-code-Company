select p.first_name as first_name,p.last_name as last_name
count(r.sport_id) as total_no_of_sports_register
from
player_table as P 
JOIN
registration_table as r 
on p.player_id=r.player_id
where r.payement_status="paid" and  year(r.reg_date)=2024
group by 
p.player_id,
p.first_name,
p.last_name;
