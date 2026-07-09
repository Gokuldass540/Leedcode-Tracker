-- Last updated: 7/9/2026, 3:06:59 PM
# Write your MySQL query statement below
SELECT id,

    CASE 
        WHEN p_id IS NULL THEN 'Root'
        WHEN id IN (SELECT p_id FROM Tree)THEN 'Inner'
        ELSE 'Leaf'
        END AS type
 FROM Tree
		