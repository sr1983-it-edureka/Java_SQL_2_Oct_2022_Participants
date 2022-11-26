select deptno, mgr, count(*), sum(sal), avg(sal) from employee group by deptno, mgr order by deptno;

select deptno, mgr, count(*) as TotalEmployees, sum(sal) TotalSalary, avg(sal) AverageSalary from employee group by deptno, mgr
having TotalEmployees IN (3, 1) ;

select deptno, mgr, count(*) as TotalEmployees, sum(sal) TotalSalary, avg(sal) AverageSalary from employee group by deptno,mgr
having AverageSalary > 90000;


