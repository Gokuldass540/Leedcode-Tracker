-- Last updated: 7/9/2026, 3:07:21 PM
# Write your MySQL query statement below
SELECT Employee.name,Bonus.bonus From Employee
LEFT JOIN Bonus ON Employee.empId=Bonus.empId
WHERE bonus < 1000 OR Bonus IS NULL;