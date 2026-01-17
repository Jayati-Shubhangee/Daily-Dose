# Write your MySQL query statement below
select w1.id from Weather w1 JOIN Weather w2 on w1.recordDate= DATE_ADD(w2.recordDate,INTERVAL 1 DAY)
where w1.temperature > w2.temperature;
/*we applied a self join and made a w1 table and w2 table then added 1 used DATE_ADD date function  */