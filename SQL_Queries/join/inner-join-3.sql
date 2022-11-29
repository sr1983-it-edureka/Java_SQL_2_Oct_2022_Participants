select empno, ename, job, dname, E.deptno,
D.deptno
from employee as E
	INNER JOIN
DEPARTMENT as D
ON
E.deptno = D.deptno;
