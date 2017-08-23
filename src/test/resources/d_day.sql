
create table game.d_day
(
	seq serial primary key,
	id text unique,
	date date
)
WITH (
  OIDS=FALSE
);

select *
from game.d_day
order by seq;

insert into game.d_day (id, date) values ('afreeca_songbom', '2017-05-01');

create view game.d_day_view as
select id, date, now()::date - date as d_day
from game.d_day;

select *
from game.d_day_view;

select number, count
from (
	select rank() over (order by count(*) desc, number) as rank, number, count(*) as count
	from (
		select unnest(array[number1, number2, number3, number4, number5, number6]) as number
		from game.lotto
	) as number_count
	group by number
) a
where rank < 7
order by rank;
/*
27^119
20^118
34^118
40^118
37^112
1^111
*/
