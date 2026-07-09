-- Last updated: 7/9/2026, 3:08:21 PM
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY Email
HAVING COUNT(*)>1