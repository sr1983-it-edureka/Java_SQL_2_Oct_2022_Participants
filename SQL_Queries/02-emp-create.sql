create table employee(
	empno integer,
    ename varchar(30),
    job varchar(30),
    mgr integer,
    sal integer,
    deptno integer,
    primary key (empno),
    foreign key (deptno) references department(deptno)
);