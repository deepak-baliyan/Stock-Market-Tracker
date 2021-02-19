
drop database if exists jack;
create database jack;
use  jack;   

create table stock (
  name VARCHAR(20),
  high DOUBLE(40,5),
  low DOUBLE(40,5),
  open DOUBLE(40,5),
  close DOUBLE(40,5),
  PRIMARY KEY (name)
);


INSERT INTO stock VALUES(23.443,43.43,232.2,24.2);
INSERT INTO stock VALUES(23.443,43.43,232.2,24.2);

commit;

select * from stock;

