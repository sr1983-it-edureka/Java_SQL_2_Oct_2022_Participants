select * from employee 
	LEFT JOIN /* left outer join */
DEPARTMENT
ON
employee.deptno = department.deptno
	UNION
select * from employee 
	RIGHT JOIN /* right outer join */
DEPARTMENT
ON
employee.deptno = department.deptno;
