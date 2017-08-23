
DROP EXTERNAL TABLE if exists ohammer.finance;
CREATE EXTERNAL TABLE ohammer.finance
(
	recordkey text,
	"quote:20170707" text
)
 LOCATION (
    'pxf://nn/finance?profile=hbase'
)
FORMAT 'CUSTOM' (formatter='pxfwritable_import')
ENCODING 'UTF8';

select *
from ohammer.finance limit 10;


select
	max(start) as max_start,
	max(high) as max_high,
	max(low) as max_low,
	max(finish) as max_finish,
	max(quantity) as max_quantity
from (
	select
		(string_to_array(recordkey, '^'))[1] as dist_key, (string_to_array(recordkey, '^'))[2] as code,
		(string_to_array("quote:20170707", '^'))[1]::numeric as start,
		(string_to_array("quote:20170707", '^'))[2]::numeric as high,
		(string_to_array("quote:20170707", '^'))[3]::numeric as low,
		(string_to_array("quote:20170707", '^'))[4]::numeric as finish,
		(string_to_array("quote:20170707", '^'))[5]::numeric as quantity
	from ohammer.finance
) a
-- 579500^596800^579200^595000^31692747
;

select *
from (
	select
		(string_to_array(recordkey, '^'))[1] as dist_key, (string_to_array(recordkey, '^'))[2] as code,
		(string_to_array("quote:20170707", '^'))[1]::numeric as start,
		(string_to_array("quote:20170707", '^'))[2]::numeric as high,
		(string_to_array("quote:20170707", '^'))[3]::numeric as low,
		(string_to_array("quote:20170707", '^'))[4]::numeric as finish,
		(string_to_array("quote:20170707", '^'))[5]::numeric as quantity
	from ohammer.finance
) a
where 1=1
and start = 579500;

select *
from (
	select
		(string_to_array(recordkey, '^'))[1] as dist_key, (string_to_array(recordkey, '^'))[2] as code,
		(string_to_array("quote:20170707", '^'))[1]::numeric as start,
		(string_to_array("quote:20170707", '^'))[2]::numeric as high,
		(string_to_array("quote:20170707", '^'))[3]::numeric as low,
		(string_to_array("quote:20170707", '^'))[4]::numeric as finish,
		(string_to_array("quote:20170707", '^'))[5]::numeric as quantity
	from ohammer.finance
) a
where 1=1
and code = '205100';
