SELECT * FROM player where country = 'South Africa';

explain SELECT * FROM player where country = 'South Africa';

--
-- '1', 'SIMPLE', 'player', NULL, 'ALL', NULL, NULL, NULL, NULL, -- '250', '10.00', 'Using where'
