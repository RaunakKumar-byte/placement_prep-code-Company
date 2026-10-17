SELECT
distinct
 i.first_name as instructor_first_name,
i.last_name as instructor_last_name,
st.starttime as start_time
from instructor_table as i 
join section_table as s 
on i.instructor_id=s.instructor_id
JOIN
schedule_table as st 
on s.schedule_id=st.schedule_id  
where st.start_time>'10:00:00';
