
-- 'A.B'
-- A - Schema / Database
-- B - Tables
-- Examples  - '*.*'

GRANT SELECT ON *.* TO joy@localhost;

GRANT SELECT ON javasql2_index.* TO joy@localhost;

GRANT UPDATE, DELETE ON javasql2_index.player TO 
joy@localhost;

GRANT SELECT (player_id, age, country, total_matches)
ON javasql2_index.player TO joy@localhost;

-- GRANT SELECT (player_id, age, country, total_matches)
-- ON javasql2_index.player TO joy@localhost;

SHOW grants for joy@localhost;

