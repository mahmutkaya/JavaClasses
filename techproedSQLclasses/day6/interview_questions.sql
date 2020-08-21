-- Interview Questions
CREATE TABLE students
(
  id number(9),
  name varchar2(50),
  state varchar2(50),
  salary number(20),
  company varchar2(20)
);

INSERT INTO students VALUES(123456789, 'Johnny Walk', 'New Hampshire', 2500, 'IBM');
INSERT INTO students VALUES(234567891, 'Brian Pitt', 'Florida', 1500, 'LINUX');
INSERT INTO students VALUES(245678901, 'Eddie Murphy', 'Texas', 3000, 'WELLS FARGO');
INSERT INTO students VALUES(456789012, 'Teddy Murphy', 'Virginia', 1000, 'GOOGLE');
INSERT INTO students VALUES(567890124, 'Eddie Murphy', 'Massachuset', 7000, 'MICROSOFT');
INSERT INTO students VALUES(456789012, 'Brad Pitt', 'Texas', 1500, 'TD BANK');
INSERT INTO students VALUES(123456719, 'Adem Stone', 'New Jersey', 2500, 'IBM');

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

SELECT * FROM students;
/*
    ID	        NAME	        STATE	    SALARY	    COMPANY
123456789	Johnny Walk	    New Hampshire	2500	    IBM
234567891	Brian Pitt	    Florida	        1500	    LINUX
245678901	Eddie Murphy	Texas	        3000	    WELLS FARGO
456789012	Teddy Murphy	Virginia	    1000	    GOOGLE
567890124	Eddie Murphy	Massachuset	    7000	    MICROSOFT
456789012	Brad Pitt	    Texas	        1500	    TD BANK
123456719	Adem Stone	    New Jersey	    2500	    IBM
*/

SELECT * FROM employees;
/*
    ID	        NAME	    STATE	        SALARY	COMPANY
123456789	John Walker	    Florida	        2500	IBM
234567890	Brad Pitt	    Florida	        1500	APPLE
345678901	Eddie Murphy	Texas	        3000	IBM
456789012	Eddie Murphy	Virginia	    1000	GOOGLE
567890123	Eddie Murphy	Texas	        7000	MICROSOFT
456789012	Brad Pitt	    Texas	        1500	GOOGLE
123456710	Mark Stone	    Pennsylvania	2500	IBM
*/

--1) get common names from two tables
--1st way:
SELECT name FROM students
INTERSECT
SELECT name FROM employees;
--2nd way:
SELECT DISTINCT students.name
FROM students INNER JOIN employees
ON students.name = employees.name;
/*
    NAME
Brad Pitt
Eddie Murphy
*/
--2) get unique states from employees table
SELECT DISTINCT state FROM employees;
/*
    STATE
Florida
Pennsylvania
Virginia
Texas
*/
--3) get all data if the id is even from students table
SELECT * FROM students WHERE MOD(id,2)=0;
/*
    ID	        NAME	    STATE	    SALARY	COMPANY
456789012	Teddy Murphy	Virginia	1000	GOOGLE
567890124	Eddie Murphy	Massachuset	7000	MICROSOFT
456789012	Brad Pitt	    Texas	    1500	TD BANK
*/
--4) how to count all records in a table?
SELECT COUNT(*) FROM students;
/*
    COUNT(*)
      7
*/
--5) how many different companies are there in employees table?
SELECT COUNT(DISTINCT company) AS num_of_companies FROM employees;
/*
    NUM_OF_COMPANIES
            4
*/
--6) get all records of the employee whose salary is the highest
SELECT * FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees);
/*
    ID	        NAME	    STATE	SALARY	COMPANY
567890123	Eddie Murphy	Texas	7000	MICROSOFT
*/
--7) get all records of the employee whose salary is the lowest
SELECT * FROM employees
WHERE salary = (SELECT MIN(salary) FROM employees);
/*
    ID	        NAME	    STATE	    SALARY	COMPANY
456789012	Eddie Murphy	Virginia	1000	GOOGLE
*/
-- * SECOND WAY *
--max:
SELECT * FROM employees
ORDER BY salary DESC
FETCH NEXT 1 ROW ONLY;
/*
    ID	        NAME	    STATE	SALARY	COMPANY
567890123	Eddie Murphy	Texas	7000	MICROSOFT
*/
--min:
SELECT * FROM employees
ORDER BY salary ASC
FETCH NEXT 1 ROW ONLY;
/*
    ID	        NAME	      STATE	    SALARY	COMPANY
456789012	Eddie Murphy	Virginia	1000	GOOGLE
*/
--8) get the second highst salary from employees table
SELECT MAX(salary) FROM employees
WHERE salary < ( SELECT MAX(salary) FROM employees);
/*
    MAX(SALARY)
    3000
*/
--9) get all data of employee whose salary is the second highest
SELECT * FROM employees
WHERE salary < ( SELECT MAX(salary) FROM employees )
ORDER BY salary DESC
FETCH NEXT 1 ROW ONLY;
/*
    ID	        NAME	    STATE	SALARY	COMPANY
345678901	Eddie Murphy	Texas	3000	IBM
*/
--10) how to convert characters to uppercase, lowercase, initialcase?
SELECT UPPER(state), LOWER(company), INITCAP(name) FROM employees;
/*
    UPPER(STATE)	LOWER(COMPANY)	INITCAP(NAME)
    FLORIDA	        ibm	            John Walker
    FLORIDA	        apple	        Brad Pitt
    TEXAS	        ibm	            Eddie Murphy
    VIRGINIA	    google	        Eddie Murphy
    TEXAS	        microsoft	    Eddie Murphy
    TEXAS	        google	        Brad Pitt
    PENNSYLVANIA	ibm	            Mark Stone
*/









