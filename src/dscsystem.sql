-- 数据库的设计是  根据 dsc表里的 userid字段 建立  每个userid 一张表 
--表名字  默认加上 tb_  ;因为数字不能被mysql认为是表名字
create database dscsystem;

use dscsystem;

create table dsc (userid varchar(50) primary key);


--以下表的执行 根据  dsc中的字段 userid  表名为tb_+(dsc.userid)
--create table tb_(dsc.userid)(id int auto_increment primary key auto_increment,time datetime not null,content varchar(50))


--从最后一个开始增长
