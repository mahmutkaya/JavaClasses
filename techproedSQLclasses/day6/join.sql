--JOINS: it joins the records from at least 2 tables
--1) inner join, 2) left join, 3) right join, 4) full join, 5) self join

CREATE TABLE companies
(
  company_id number(9),
  company_name varchar2(20)
);

INSERT INTO companies VALUES(100, 'IBM');
INSERT INTO companies VALUES(101, 'GOOGLE');
INSERT INTO companies VALUES(102, 'MICROSOFT');
INSERT INTO companies VALUES(103, 'APPLE');

CREATE TABLE orders
(
  order_id number(9),
  company_id number(9),
  order_date date
);

INSERT INTO orders VALUES(11, 101, '17-Apr-2020');
INSERT INTO orders VALUES(22, 102, '18-Apr-2020');
INSERT INTO orders VALUES(33, 103, '19-Apr-2020');
INSERT INTO orders VALUES(44, 104, '20-Apr-2020');
INSERT INTO orders VALUES(55, 105, '21-Apr-2020');

SELECT * FROM companies;
SELECT * FROM orders;

--1)inner join (join): it will get the common data from two tables
SELECT c.company_name, o.order_id, o.order_date, o.company_id 
FROM companies c INNER JOIN orders o
ON c.company_id = o.company_id;

--2)left join: it will return all data from the 1st table
SELECT c.company_name, o.order_id, o.order_date
FROM companies c LEFT JOIN orders o
ON c.company_id = o.company_id;

--3)right join: it will return all data from the 2nd table
SELECT c.company_name, o.order_id, o.order_date
FROM companies c RIGHT JOIN orders o
ON c.company_id = o.company_id;

--4)full join: it will return all data from the both table
SELECT c.company_name, o.order_id, o.order_date
FROM companies c FULL JOIN orders o
ON c.company_id = o.company_id;

--5) SELF JOIN:
CREATE TABLE employees
(
  id number(2),
  name varchar2(20),
  title varchar2(60),
  manager_id number(2)
);

INSERT INTO employees VALUES(1, 'Ali Can', 'SDET', 2);
INSERT INTO employees VALUES(2, 'John Walker', 'QA', 3);
INSERT INTO employees VALUES(3, 'Angie Star', 'QA Lead', 4);
INSERT INTO employees VALUES(4, 'Amy Sky', 'CEO', 5);

SELECT * FROM employees;
/*
ID	NAME	      TITLE	      MANAGER_ID
1	  Ali Can	      SDET	      2
2	  John Walker	  QA	        3
3	  Angie Star	  QA Lead	    4
4	  Amy Sky	      CEO	        5
*/

SELECT e1.name AS employee_name, e2.name AS manager_name
FROM employees e1 INNER JOIN employees e2
ON e1.manager_id = e2.id;
/* 
    EMPLOYEE_NAME	 MANAGER_NAME
    Ali Can	        John Walker
    John Walker	    Angie Star
    Angie Star	    Amy Sky
*/