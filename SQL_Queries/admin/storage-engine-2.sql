-- MyISAM

-- Table level locking

select * from employee;

-- MyISAM engine
-- LOCK --> TABLE (employee) 

-- process1 [10, 11]

-- process2 [70, 71]

--  create table address (id bigint not null auto_increment, address_info varchar(255), city varchar(255), country varchar(255), pincode integer, state varchar(255), primary key (id)) engine=InnoDB

-- create table address (id bigint not null auto_increment, address_info varchar(255), city varchar(255), country varchar(255), pincode integer, state varchar(255), primary key (id)) engine=MyISAM


