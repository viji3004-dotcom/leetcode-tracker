-- Last updated: 09/07/2026, 10:07:22
SELECT MAX(salary) SecondHighestSalary FROM Employee 
WHERE salary < (SELECT MAX(salary) FROM Employee);