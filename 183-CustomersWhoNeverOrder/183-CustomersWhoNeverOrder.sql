-- Last updated: 09/07/2026, 10:07:11
# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers
WHERE id NOT IN(
    SELECT customerId
    FROM Orders
)