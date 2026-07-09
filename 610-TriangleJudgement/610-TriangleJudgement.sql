-- Last updated: 7/9/2026, 3:06:58 PM
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle