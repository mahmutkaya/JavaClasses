CREATE TABLE employees
(
  id number(9),
  name varchar2(50),
  state varchar2(50),
  salary number(20),
  company varchar2(20)
);

INSERT INTO employees VALUES(123456789, 'John Walker', 'Florida', 2500, 'IBM');
INSERT INTO employees VALUES(234567890, 'Brad Pitt', 'Florida', 1500, 'APPLE');
INSERT INTO employees VALUES(345678901, 'Eddie Murphy', 'Texas', 3000, 'IBM');
INSERT INTO employees VALUES(456789012, 'Eddie Murphy', 'Virginia', 1000, 'GOOGLE');
INSERT INTO employees VALUES(567890123, 'Eddie Murphy', 'Texas', 7000, 'MICROSOFT');
INSERT INTO employees VALUES(456789012, 'Brad Pitt', 'Texas', 1500, 'GOOGLE');
INSERT INTO employees VALUES(123456710, 'Mark Stone', 'Pennsylvania', 2500, 'IBM');

SELECT * FROM employees;

--1) country column: should have default value as USA
--2) gender column: no default value
ALTER TABLE employees
ADD (country char(10) DEFAULT 'USA', gender char(10));

--3) remove the gender column
ALTER TABLE employees
DROP COLUMN gender;

--4) rename a column name
ALTER TABLE employees
RENAME COLUMN country TO country_name;

--5) rename the table name
ALTER TABLE employees
RENAME TO workers;

SELECT * FROM workers;

--6) modify column settings
ALTER TABLE workers
MODIFY state char(20) NOT NULL;
