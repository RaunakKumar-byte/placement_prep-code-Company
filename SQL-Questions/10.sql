SELECT
    m.movie_name,
    m.genre,
    u.user_name,
    r.rating
FROM movies AS m
JOIN watch_history AS w
    ON m.movie_id = w.movie_id
JOIN users AS u
    ON w.user_id = u.user_id
JOIN ratings AS r
    ON r.movie_id = m.movie_id
    AND r.user_id = u.user_id
WHERE m.genre = 'Action'
  AND u.age > 25
  AND r.rating >= 4.0
  AND w.watch_minutes > 60;