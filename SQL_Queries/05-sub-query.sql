select * from department where dname = 'SERVICES';
select * from employee;

select * from employee where deptno = 
(
	select deptno from department where dname = 'SERVICES'
)
