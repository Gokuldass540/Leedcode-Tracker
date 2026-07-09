-- Last updated: 7/9/2026, 3:08:22 PM
SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2
ON e1.managerId=e2.id
Where e1.salary>e2.salary