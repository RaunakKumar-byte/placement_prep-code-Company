SELECT
    t.thief_name,
    a.animal_name,
    a.category,
    t.bounty_value
        from animal a 
        JOIN 
        thief t 
        on a.animal_id=t.animal_id

        where t.bounty_value>15;