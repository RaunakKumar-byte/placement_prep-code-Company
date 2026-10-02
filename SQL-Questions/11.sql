select m.movie_name,
    m.genre,
    count(w.movie_id) as total_watches,
    sum(w.watch_minutes) as total_watch_minutes
    FROM movies as m
    join 
    watch_history as w
    ON
    m.movie_id=w.movie_id
    WHERE
    m.genre='Action' or m.genre='Thriller'
    group by m.movie_name, m.genre
    HAVING count(w.movie_id)>5
    and sum(w.watch_minutes)>500;

