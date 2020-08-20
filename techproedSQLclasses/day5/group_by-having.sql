-- group by
CREATE TABLE workers (
    id number(9),
    name varchar2(50),
    state varchar2(50),
    salary number(20),
    company varchar2(20)
);
INSERT INTO workers
VALUES(123456789, 'John Walker', 'Florida', 2500, 'IBM');
INSERT INTO workers
VALUES(234567890, 'Brad Pitt', 'Florida', 1500, 'APPLE');
INSERT INTO workers
VALUES(345678901, 'Eddie Murphy', 'Texas', 3000, 'IBM');
INSERT INTO workers
VALUES(
        456789012,
        'Eddie Murphy',
        'Virginia',
        1000,
        'GOOGLE'
    );
INSERT INTO workers
VALUES(
        567890123,
        'Eddie Murphy',
        'Texas',
        7000,
        'MICROSOFT'
    );
INSERT INTO workers
VALUES(456789012, 'Brad Pitt', 'Texas', 1500, 'GOOGLE');
INSERT INTO workers
VALUES(
        123456710,
        'Mark Stone',
        'Pennsylvania',
        2500,
        'IBM'
    );
SELECT *
FROM workers;
-- find the total salary of every employees
SELECT name,
    SUM(salary) AS total_income
FROM workers
GROUP BY name;
-- find the number of employees per state
SELECT state,
    COUNT(name) AS number_of_state
FROM workers
GROUP BY state;
-- find the number of workers whose salaries are grater than 2000 per company
SELECT company,
    COUNT(name) AS num_of_workers
FROM workers
WHERE salary > 2000
GROUP BY company;
-- find the max and min salary for every company
SELECT company,
    MAX(salary),
    MIN(salary)
FROM workers
GROUP BY company;
-- Aggregate functions: SUM(), COUNT(), AVG(), MAX(), MIN()
-- ** after WHERE keyword you can not use Aggregate functions.
-- ** for Aggregate functions to use filter we use HAVING, but use HAVING after GROUP BY.
-- find the total salary if it is grater than 2500 for every worker
SELECT name,
    SUM(salary) AS total_income
FROM workers
GROUP BY name
HAVING SUM(salary) > 2500;
-- *** interview question: can you use WHERE to filter for Aggregate functions?
-- *** answer: no, for aggregate functions to filter records we need to use HAVING.
-- *** interview question: what is the difference between WHERE and HAVING?
-- *** answer: for aggregate functions to filter records we need to use HAVING.

-- find the number of workers if it is more than 1 per state
SELECT state,
    COUNT(name)
FROM workers
GROUP BY state
HAVING COUNT(name) > 1;

-- find the min salaryif it is more than 2000 per company
SELECT company,
    MIN(salary)
FROM workers
GROUP BY company
HAVING MIN(salary) > 2000;
-- find the max salaryif it is between 2500 and 8000 per state
SELECT state,
    MAX(salary)
FROM workers
WHERE salary BETWEEN 2500 AND 8000
GROUP BY state;