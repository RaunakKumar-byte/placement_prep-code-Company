select 
    m.movie_name,
    m.genre,
    u.user_name,
    r.rating
        from movies as m 
        join
        watch_history as wh 
        ON
        m.movie_id=wh.movie_id
        join
        users as u 
        on wh.user_id=u.user_id
        join 
        ratings as r
        ON
        r.user_id=u.user_id

        where m.genre="Action" AND
              u.age > 25 AND
              r.rating>=4.0 AND
              wh.watch_minutes>60

        