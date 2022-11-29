select * from employee 
	RIGHT JOIN /* right outer join */
DEPARTMENT
ON
employee.deptno = department.deptno;
