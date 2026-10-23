select u.user
from users as u 
left JOIN
support as s 
on u.userid=s.userid
where s.userid is null;
