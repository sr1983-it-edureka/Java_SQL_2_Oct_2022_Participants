select empno as EmployeeNumber, 
ename as 'Employee Name', job as 'Job Title', 
dname as 'Department Name', 
E.deptno as 'Employee-> Department No',
D.deptno
from employee as E
	INNER JOIN
DEPARTMENT as D
ON
E.deptno = D.deptno;
