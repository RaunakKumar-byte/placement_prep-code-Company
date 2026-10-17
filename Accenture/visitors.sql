SELECT
 v.name as "VISITOR_NAME",
 v.ticket_type,
 e.name as "ENCLOSURE_NAME",
 e.type
 from visitor as v 
 join enclosure_visit_log as el 

 on v.visitor_id=el.visitor_id
 join 
 enclosure as e 
 on el.enclosure_id=e.enclosure_id
 where v.ticket_type <> 'Child' and e.type <> 'Arctic';