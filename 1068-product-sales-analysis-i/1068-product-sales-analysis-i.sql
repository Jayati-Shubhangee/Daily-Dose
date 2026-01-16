# Write your MySQL query statement below
select p.product_name, s.price, s.year from Sales s Left Join Product p ON s.product_id=p.product_id;