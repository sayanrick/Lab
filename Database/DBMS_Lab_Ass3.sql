use sayanndb;
# Creating table employee 
create table employee(
EMPLOYEE_ID numeric(10),
LAST_NAME varchar(25),
JOB_ID varchar(10),
SALARY numeric(8,2),
COMM_PCT numeric(4,2),
MGR_ID numeric(6),
DEPARTMENT numeric(4)
);
# Inserting data into the employee table
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (198, 'Connell', 'SH_CLERK', 2600, 2.5, 124, 50);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (199, 'Grant', 'SH_CLERK', 2600, 2.2, 124, 50);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (200, 'Whalen', 'AD_ASST', 4400, 1.3, 101, 10);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (201, 'Hartstein', 'IT_PROG', 6000, null, 100, 20);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (202, 'Fay', 'AC_MGR', 6500, null, 210, 20);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (203, 'Mavris', 'AD_VP', 7500, null, 101, 40);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (204, 'Baer', 'AD_PRES', 3500, 1.5, 101, 90);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (205, 'Higgins', 'AC_MGR', 2300, null, 101, 60);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (206, 'Gitz', 'IT_PROG', 5000, null, 103, 60);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (100, 'King', 'AD_ASST', 8956, 0.3, 108, 100);
insert into employee(EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY, COMM_PCT, MGR_ID, DEPARTMENT) values (101, 'Kochar', 'SH_CLERK', 3400, 1.3, 118, 30);

#  Displaying last_name, job_id, employee_id for each employee 
select EMPLOYEE_ID, LAST_NAME, JOB_ID from employee;
 # Displaying the details of all employees of department 60
select * from employee where DEPARTMENT_ID = 60;
#  Displaying unique job_id from EMPLOYEE table
select * from employee where LAST_NAME = 'King';
#  Displaying last_name, salary and salary increase of Rs300
select distinct JOB_ID as JOB_TITLE from employee; 

alter table employee add Increased_Salaary numeric(8,2);
update employee set Increased_Salaary = (salary + 300);
select * from employee;
#Employees who get commission
select COMM_PCT from employee where COMM_PCT is NOT NULL;
#Employees who do not get commission
select COMM_PCT from employee where COMM_PCT is NULL;
# Employees whose salary is greater than 5000
select EMPLOYEE_ID, DEPARTMENT_ID, SALARY from employee where salary>5000;
# Employees whose salary is inbetween 4000 & 7000
select LAST_NAME, SALARY from employee where SALARY>4000 and SALARY<7000;
# Employees whose salary is 6000,6500,7000
select * from employee where SALARY = 6000 or SALARY = 6500 or SALARY= 7000;
# Employees whose department_id is 10,20,30,50
select * from employee where DEPARTMENT_ID = 10 or DEPARTMENT_ID = 20 or DEPARTMENT_ID = 30 or DEPARTMENT_ID = 50;
# Employee whose salary is not 5000
select * from employee where SALARY != 5000;
# Employees who are working as clerk
select * from employee where JOB_ID = 'SH_CLERK';
# Employees who are Clerk, Programmer, Assistant
select * from employee where JOB_ID = 'SH_CLERK' or JOB_ID = 'IT_PROG' or JOB_ID = 'AD_ASST';
# Employees who are clerk and salary is 3000
select * from employee where JOB_ID = 'SH_CLERK' and SALARY<3000;
# Displaying employees' last_name & mgr_id whose  salary is greater than 3000 and mgr_id is 101
select LAST_NAME, MGR_ID from employee where SALARY>3000 and MGR_ID = 101;


