create table temp1 (id integer) ENGINE = InnoDB;

create table temp2 (id integer) ENGINE = MyISAM;

show create table temp1;

show create table temp2;

ALTER TABLE temp1 ENGINE = MyISAM;
ALTER TABLE temp2 ENGINE = InnoDB;


