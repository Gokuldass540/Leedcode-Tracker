-- Last updated: 7/9/2026, 3:08:31 PM
# Write your MySQL query statement below
SELECT Person.firstName,
       Person.lastName,
       Address.city,
       Address.state
FROM Person 
LEFT JOIN Address 
ON Person.PersonID=Address.PersonID