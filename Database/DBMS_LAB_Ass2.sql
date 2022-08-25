use sayanndb;
create table emp1 (
ID numeric(2),
Name varchar(10),
Basic numeric(6,2),
Designation Varchar(10),
Age numeric(2)
);
describe emp1;
alter table emp1 modify Basic int;
alter table emp1 modify Name varchar(15);
create table emp_trainee select * from emp1;
describe emp_trainee;
alter table emp_trainee rename column ID to Emp_id;
insert into emp1(ID, Name, Basic, Designation, Age) values (1, 'Rohit', 6700, 'Manager', 24);
insert into emp1(ID, Name, Basic, Designation, Age) values (2, 'Sunil', 6200, 'Engineer', 27);
insert into emp1(ID, Name, Basic, Designation, Age) values (3, 'Payal', 6300, 'Engineer', 25);
insert into emp1(ID, Name, Basic, Designation, Age) values (4, 'Kunal', 6700, 'Trainee', 28);
insert into emp1(ID, Name, Basic, Designation, Age) values (5, 'Sunita', 6230, 'Trainee', 26);
insert into emp1(ID, Name, Basic, Designation, Age) values (6, 'Bimal', 7000, 'Trainee', 25);
select * from emp1;
select * from emp_trainee;
insert into emp_trainee select * from emp1;
alter table emp1 add Skills varchar(10);
alter table emp1 add DOJ Date;
describe emp1;
update emp1 set Skills = 'Java' where ID = '1';
update emp1 set DOJ = '2022-08-02' where ID = '1';
update emp1 set Skills = 'Spring' where ID = '2';
update emp1 set DOJ = '2022-08-02' where ID = '2';
update emp1 set Skills = 'MySQL' where ID = '3';
update emp1 set DOJ = '2022-08-02' where ID = '3';
update emp1 set Skills = 'Python' where ID = '4';
update emp1 set DOJ = '2022-08-02' where ID = '4';
update emp1 set Skills = 'Junit' where ID = '5';
update emp1 set DOJ = '2022-08-02' where ID = '5';
update emp1 set Skills = 'Java' where ID = '6';
update emp1 set DOJ = '2022-08-02' where ID = '6';
alter table emp_trainee modify Designation varchar(20);
update emp_trainee set Designation = 'Programmer_trainee';
 
alter table emp1 modify ID varchar(5);
select * from emp1;
select * from emp_trainee;

alter table emp1 rename column Age to Age_in_Years;
delete from emp1;
alter table emp_trainee drop column basic, drop column Designation;
alter table emp1 rename column Emp to Emp_Mgr_Engr;
drop table emp_trainee;
truncate Emp_Mgr_Engr;
