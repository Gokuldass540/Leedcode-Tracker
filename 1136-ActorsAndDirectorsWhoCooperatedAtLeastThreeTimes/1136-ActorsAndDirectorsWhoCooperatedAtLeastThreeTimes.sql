-- Last updated: 7/9/2026, 3:06:26 PM
# Write your MySQL query statement below
select actor_id, director_id 
from(
select actor_id,director_id, 
count(timestamp) as cooperated 
from ActorDirector 
group by actor_id,director_id) 
table1
where cooperated>=3;