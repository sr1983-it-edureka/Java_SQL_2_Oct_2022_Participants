select * from player;
alter table player add column total_matches integer;

-- 'Legend' (>= 400)
-- 'Champion (>=200 & <400)
-- 'Good Player' (>=100 & <200
-- 'Player' ( <100 )
select player_id, first_name, total_matches,
CASE
	WHEN total_matches >= 400 THEN 'Legend'
    WHEN total_matches between 200 and 400 THEN 'Champion'
    WHEN total_matches between 100 and 200 THEN 'Good Player'
    ELSE 'Player'
END 
as PlayerType
FROM player;

