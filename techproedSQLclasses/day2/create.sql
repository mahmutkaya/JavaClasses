--How to create a table in SQL
CREATE TABLE students
(
    students_id char(9),
    students_name varchar2(50),
    students_grade number(3),
    last_modification_date date
);

--Create a table whose name is products and it will have p_id, p_name, p_price, p_exp_date
CREATE TABLE products
(
    p_id char(5),
    p_name varchar2(50),
    p_price number(7,2),
    p_exp_date date
);

--How to create a table by using existing table
CREATE TABLE students_name_grade AS SELECT students_name  students_grade FROM students;

--Create a new table by using products table, it should have 3 fields
CREATE TABLE products_new_table
AS
SELECT p_id, p_name, p_price
FROM products;