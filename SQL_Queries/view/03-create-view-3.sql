select * from employee;

create view dept_salary_analysis_view2 (emp_name, dept_no, salary)
	as
	select ename, deptno, sal from employee;

desc dept_salary_analysis_view2;