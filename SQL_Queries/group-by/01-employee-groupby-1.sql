select * from employee;

select deptno, sal, empno, ename, job, mgr from employee;


select deptno, count(*), sum(sal) from employee group by deptno;

select deptno, count(*), sum(sal), avg(sal), sal from employee group by deptno;


