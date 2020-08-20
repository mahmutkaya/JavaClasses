CREATE TABLE people (
    ssn char(9),
    name varchar2(50),
    address varchar2(50)
);
​
INSERT INTO people
VALUES(123456789, 'Mark Star', 'Florida');
INSERT INTO people
VALUES(234567890, 'Angie Way', 'Virginia');
INSERT INTO people
VALUES(345678901, 'Maryy Tien', 'New Jersey');
INSERT INTO people(ssn, address)
VALUES(456789012, 'Michigan');
INSERT INTO people(ssn, address)
VALUES(567890123, 'California');
​ --IS NULL command : It can be used as a filter
--Get the SSN of the people who have no name
SELECT ssn
FROM people
WHERE name IS NULL;
​ --Update the null names to 'Name is not inserted yet'
UPDATE people
SET name = 'Name is not inserted yet'
WHERE name IS NULL;
​ --How to delete data from a table
DELETE FROM people
WHERE name = 'Mark Star';
​ --Delete the record whose name is Angie Way and address is California 
​ --If SQL cannot find a record to delete it does not give error, it gives "0 row(s) deleted." message
DELETE FROM people
WHERE name = 'Angie Way'
    AND address = 'California';
​
DELETE FROM people
WHERE name = 'Angie Way'
    OR address = 'California';
​ --How to delete all records
DELETE FROM people;
​
SELECT *
FROM people;
​ --Second way to delete all records from a table
TRUNCATE TABLE people;
​ --What is the difference between DELETE and TRUNCATE?
--If I use DELETE command to delete all records I can roll back the deleted records
--If I use TRUNCATE command to delete all records I cannot roll back the deleted records
--By using DELETE I can delete some specific records from the table but by using TRUNCATE you can delete all records everytime.
​ --How to drop a table from Schema?
DROP TABLE product_details;
​ --What is the difference between DELETE and DROP?
--If I use DELETE I can delete records but the table exists in Schema
--If I use DROP, it means I deleted all records and I destroyed the table. After using DROP table will be reomoved from Schema
--After using DROP, you can roll back the table. But if you want the table not to roll back you need to use PURGE after the name of the table
​ DROP TABLE customers_products PURGE;