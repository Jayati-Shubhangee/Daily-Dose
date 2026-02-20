# Write your MySQL query statement below
select Customers.name AS Customers from Customers LEFT JOIN  Orders ON Customers.id=Orders.customerId where Orders.id IS NULL;