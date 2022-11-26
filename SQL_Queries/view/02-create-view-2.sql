select * from employee;

create view dept_salary_analysis_view
	as
	select ename, deptno, sal from employee;

desc dept_salary_analysis_view;

