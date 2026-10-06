SELECT
    d.departent_name,
    count(distinct e.emp_id)as total_no_of_employees,
    sum(s.base_salary + COALESCE(s.bonus,0)) as  total_salary_paid,
    count(distinct ep.project_id) as total_project_hadled

    from deparetemnt d
    inner join employees e on d.dept_id=e.dept_id
    inner join salaries s on e.emp_id=s.emp_id
    left join Employee_projects ep on e.emp_id=ep.emp_id

    group by 
    d.dept_id,
    d.dept_name
    having 
      count(Distinct e.emp_id)>2

      order by
      totala_salary_paid desc;