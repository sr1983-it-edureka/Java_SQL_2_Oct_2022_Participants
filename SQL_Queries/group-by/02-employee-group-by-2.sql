select * from employee;

select deptno, mgr, count(*) from employee group by deptno, mgr order by deptno;

select deptno, mgr, count(*), sum(sal), avg(sal) from employee group by deptno, mgr order by deptno;





