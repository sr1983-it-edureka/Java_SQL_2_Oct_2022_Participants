-- tablespace

-- tablespace [default] file-per-table

-- tablespace - general

create tablespace ts_food_management ADD datafile 'ts_food_management.ibd' Engine = InnoDB;

create table food_order (id integer) TABLESPACE ts_food_management;
create table payment (id integer) TABLESPACE ts_food_management;

create tablespace bank_loan_processing add datafile 'loan_processing.ibd' Engine = InnoDB;

create tablespace bank_insurance add datafile 'insurance.ibd' Engine = InnoDB;

ALTER table food_order tablespace = bank_loan_processing;

select * from information_schema.innodb_tablespaces;






