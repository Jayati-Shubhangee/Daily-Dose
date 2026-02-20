# Write your MySQL query statement below
select Employee.name , Bonus.bonus from Employee LEFT JOIN Bonus ON Employee.empID=Bonus.empId WHERE Bonus.bonus<1000 OR Bonus.bonus IS NULL ;