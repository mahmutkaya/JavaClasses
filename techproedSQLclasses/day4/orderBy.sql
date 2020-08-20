--ORDER BY: ORDER BY orders data in ascending order or descending order
--Put the records in ascending order by using salary field
SELECT *
FROM employees
ORDER BY salary ASC;
--ASC statnds for ASCENDING
--Put the records in descending order by using state
SELECT *
FROM employees
ORDER BY state DESC;
--DESC statnds for DESCENDING
--Put the records in asending order by using company name then in descending order by using salary
SELECT *
FROM employees
ORDER BY company ASC,
    salary DESC;
--Instead of column names you can use column numbers as well