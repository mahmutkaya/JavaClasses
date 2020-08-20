--Get the first name and last name from employees table, and get the city from addresses table
--Change the column names to first_name, last_name, and city_name
--1. Way by using subquery
SELECT employee_first_name AS first_name,
    employee_last_name AS last_name,
    (
        SELECT city
        FROM addresses
        WHERE employees.employee_id = addresses.employee_id
    ) city_name
FROM employees;
--2. Way
SELECT employees.employee_first_name AS first_name,
    employees.employee_last_name AS last_name,
    addresses.city AS city_name
FROM employees,
    addresses
WHERE employees.employee_id = addresses.employee_id;
--To make your code short you can rename(temporary) your tables by initials 
SELECT e.employee_first_name AS first_name,
    e.employee_last_name AS last_name,
    a.city AS city_name
FROM employees e,
    addresses a
WHERE e.employee_id = a.employee_id
ORDER BY first_name,
    last_name ASC;