SELECT
    a.airingId as "AIRINGID",
    a.episodeId as "EPISODEID",
    c.Name as "CHANNEL_NAME"
FROM
    airing as a 
 join 
    channel as c 
    on a.channel_id=c.channel_id
    where a.episode_id is not null and TIME(a.StartTime)>'18:00:00';
