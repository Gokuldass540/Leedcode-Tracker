-- Last updated: 7/9/2026, 3:07:12 PM
# Write your MySQL query statement below
select class
FROM Courses
GROUP BY class
HAVING COUNT(student)>=5;