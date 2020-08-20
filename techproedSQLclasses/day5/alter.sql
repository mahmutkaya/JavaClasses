-- ALTER: to make permanent updates on a table 

--1) we can add new columns to a table by using ALTER
ALTER TABLE workers
ADD phone char(13);

-- if you use DEFAULT, you will have default data instead of '-' 
ALTER TABLE workers
ADD country varchar2(20) DEFAULT 'The USA';

UPDATE workers
SET phone='000'
WHERE phone IS NULL;

SELECT * FROM workers;

--2) we can have multiple columns in one code
ALTER TABLE workers
ADD (gender varchar2(20), security_check varchar2(10) DEFAULT 'done');

--3) we can drop column from a table
ALTER TABLE workers
DROP COLUMN phone;