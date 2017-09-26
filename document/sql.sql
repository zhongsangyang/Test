
drop table t_admin;
create table t_admin(
  id int PRIMARY KEY  AUTO_INCREMENT,
  gender int ,
  address varchar(40),
  password VARCHAR(10),
  phone varchar(11)

)ENGINE =InnODB DEFAULT CHARSET utf8;
insert into t_admin(gender, address, password, phone) VALUES
  (0,'江西赣州',12345678,15779720313);
