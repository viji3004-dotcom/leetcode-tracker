-- Last updated: 09/07/2026, 10:07:19
SELECT S.Score, COUNT(S2.Score) as `Rank`
FROM Scores S,
(SELECT DISTINCT Score FROM Scores) S2
WHERE S.Score<=S2.Score
GROUP BY S.Id
ORDER BY S.Score DESC;