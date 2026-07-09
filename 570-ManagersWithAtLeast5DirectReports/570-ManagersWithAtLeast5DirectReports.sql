-- Last updated: 7/9/2026, 3:07:23 PM
# Write your MySQL query statement below
SELECT e.name
FROM Employee AS E
INNER JOIN Employee AS m ON e.id=m.managerId
GROUP BY m.managerId
HAVING COUNT(m.managerId)>=5