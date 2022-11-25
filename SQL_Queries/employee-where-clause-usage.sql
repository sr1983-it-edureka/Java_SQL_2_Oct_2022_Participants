select * from employee;

select * from employee where job = 'MANAGER';

select * from employee where sal > 100000;

select * from employee where deptno != 10;
select * from employee where deptno <> 10;

select * from employee where sal > 100000 && job <> 'MANAGER';

select * from employee where sal > 80000 && (
JOB = 'MANAGER' || deptno = 10)


