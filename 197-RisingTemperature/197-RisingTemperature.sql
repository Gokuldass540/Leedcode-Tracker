-- Last updated: 7/9/2026, 3:08:09 PM
# Write your MySQL query statement below
SELECT today.id
From Weather yesterday
CROSS JOIN Weather today
Where DATEDIFF(today.recordDate,yesterday.recordDate)=1 AND today.temperature>yesterday.temperature;