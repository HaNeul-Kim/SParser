
select number::numeric, count::numeric
from (
	select rank() over (order by count(*) desc, number) as rank, number, count(*) as count
	from (
		select unnest(array[number1, number2, number3, number4, number5, number6]) as number
		from lotto
	) as number_count
	group by number
) a
where 1=1
and rank < 7
and rank > 0
order by rank::numeric;

select number, count(*) as count
from (
	select unnest(array[number1, number2, number3, number4, number5, number6]) as number
	from lotto
) as number_count
group by number
order by number, count(*);

select *
from lotto
order by round desc limit 10;


select min(number6)
from lotto;

select *
from lotto
where round between 1 and 10
order by round;


drop table if exists game.kof;
create table game.kof
(
  date date,
  color text,
  combo1 text,
  combo2 text,
  combo3 text,
  combo4 text,
  combo5 text
);

insert into game.kof values('2017-08-02', 'red', 'G', 'P', 'G', 'G', 'P');

select *
from game.kof
order by date desc limit 20;


select number::numeric, count::numeric from (select rank() over (order by count(*) desc, number) as rank, number, count(*) as count from (select unnest(array[number1, number2, number3, number4, number5, number6]) as number from lotto) as number_count group by number) a where 1=1 and rank < 7 and rank > 0 order by rank::numeric;

SELECT number::numeric,
       COUNT::numeric
FROM
  (SELECT rank() over (
                       ORDER BY count(*) DESC, number) AS rank, number, count(*) AS COUNT
   FROM
     (SELECT unnest(array[number1, number2, number3, number4, number5, number6]) AS number
      FROM lotto) AS number_count
   GROUP BY number) a
WHERE 1=1
  AND rank < 7
  AND rank > 0
ORDER BY rank::numeric;