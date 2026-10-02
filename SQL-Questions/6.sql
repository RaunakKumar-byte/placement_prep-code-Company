select ps.first_name, ps.last_name,p.province_name from patients as ps join province_names as p on ps.province_id=p.province_id;
