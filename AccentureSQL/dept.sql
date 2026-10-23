SELECT 
    d.department_name,
    COUNT(DISTINCT e.emp_id) AS total_employees,
    SUM(s.base_salary + COALESCE(s.bonus, 0)) AS total_salary_paid,
    COUNT(DISTINCT ep.project_id) AS total_projects_handled
FROM Departments d
INNER JOIN Employees e          ON d.dept_id = e.dept_id
INNER JOIN Salaries s           ON e.emp_id = s.emp_id
LEFT JOIN Employee_Projects ep  ON e.emp_id = ep.emp_id
GROUP BY 
    d.dept_id, 
    d.department_name
HAVING 
    COUNT(DISTINCT e.emp_id) > 2
ORDER BY 
    total_salary_paid DESC;