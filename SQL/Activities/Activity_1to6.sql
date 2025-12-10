-- ACTIVITY 1
CREATE TABLE SALESMAN(
    salesman_id int primary key,
    salesman_name varchar2(20),
    salesman_city varchar2(20),
    commission int
);

DESCRIBE SALESMAN;

--ACTIVITY 2
INSERT INTO salesman VALUES (5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES (5002, 'Nail Knite', 'Paris', 13);
INSERT INTO salesman VALUES (5005, 'Pit Alex', 'London', 11);
INSERT INTO salesman VALUES (5006, 'McLyon', 'Paris', 14);
INSERT INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13);
INSERT INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12);

SELECT * FROM SALESMAN;

--      ACTIVITY 3
--Show data from the salesman_id and salesman_city columns
--Show data of salesman from Paris
--Show salesman_id and commission of Paul Adam
SELECT SALESMAN_ID,SALESMAN_CITY FROM SALESMAN;

SELECT SALESMAN_ID FROM SALESMAN
WHERE SALESMAN_CITY='Paris';

SELECT SALESMAN_ID,COMMISSION FROM SALESMAN
WHERE SALESMAN_NAME = 'Paul Adam';

--aCTIVITY 4
--Add a new column - grade - to the salesman table. The grade will be integer values.
--Set the value in the grade column for everyone to 100.
--Use SELECT command to display the results.
ALTER TABLE SALESMAN ADD GRADE INT;

UPDATE SALESMAN SET GRADE = 100;

SELECT * FROM SALESMAN;

--ACTIVITY 5
--Update the grade score of salesmen from Rome to 200.
--Update the grade score of James Hoog to 300.
--Update the name McLyon to Pierre.

UPDATE SALESMAN SET GRADE = 200
WHERE SALESMAN_CITY = 'Rome';

UPDATE SALESMAN SET GRADE = 300
WHERE SALESMAN_NAME = 'James Hoog';

UPDATE SALESMAN SET SALESMAN_NAME = 'Pierre'
WHERE SALESMAN_NAME = 'McLyon';

SELECT * FROM SALESMAN;

--ACTIVITY 6
-- Create a table named orders
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;
--Get all salesman ids without any repeated values
--Display the order number ordered by date in ascending order
--Display the order number ordered by purchase amount in descending order
--Display the full data of orders that have purchase amount less than 500.
--Display the full data of orders that have purchase amount between 1000 and 2000.

SELECT  DISTINCT SALESMAN_ID from ORDERS;
SELECT ORDER_NO FROM ORDERS ORDER BY ORDER_DATE ASC;
SELECT ORDER_NO FROM ORDERS ORDER BY PURCHASE_AMOUNT DESC;
SELECT * FROM ORDERS WHERE PURCHASE_AMOUNT < 500;
SELECT * FROM ORDERS WHERE PURCHASE_AMOUNT BETWEEN 1000 AND 2000;