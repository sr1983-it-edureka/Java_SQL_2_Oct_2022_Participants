select * from employee 
	LEFT JOIN /* left outer join */
DEPARTMENT
ON
employee.deptno = department.deptno;
