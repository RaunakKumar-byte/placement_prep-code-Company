SELECT
m.title as "Movie Name",
c.name as "channel Name"
from   
movie as m 
JOIN
airing as a 
on m.movie_id=a.movie_id
JOIN
channel as c 
on a.ChannelId=c.channelId
where m.language='English';