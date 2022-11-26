select * from employee;

create view emp_mgr_view 
	as
    select ename, mgr from employee;
    
desc emp_mgr_view;

select * from emp_mgr_view;

