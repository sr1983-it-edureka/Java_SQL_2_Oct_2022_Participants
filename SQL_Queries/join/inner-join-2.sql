select * from employee 
	INNER JOIN
DEPARTMENT
ON
employee.deptno = department.deptno;

select empno, ename, job, dname, employee.deptno,
department.deptno
from employee 
	INNER JOIN
DEPARTMENT
ON
employee.deptno = department.deptno;
