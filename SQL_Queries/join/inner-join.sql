select * from employee;
select * from department;

select * from employee 
	INNER JOIN
DEPARTMENT;

select * from employee 
	INNER JOIN
DEPARTMENT
ON
employee.deptno = department.deptno;

select empno, ename, job, dname from employee 
	INNER JOIN
DEPARTMENT
ON
employee.deptno = department.deptno;
