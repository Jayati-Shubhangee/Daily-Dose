# Write your MySQL query statement below
select s.user_id ,round(ifnull(sum(c.action='confirmed')/count(c.action),0),2) as confirmation_rate
from Signups s 
LEFT JOIN Confirmations c 
ON s.user_id=c.user_id
GROUP BY s.user_id;