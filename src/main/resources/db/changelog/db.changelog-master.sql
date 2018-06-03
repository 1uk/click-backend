--liquibase formatted sql

--changeset lkitsche:1
create table sentence (
  sentence_id int not null primary key,
  sentence_key varchar(255),
  added_at date
);

create table word (
  word_id int not null primary key,
  sentence_id int,
  foreign key (sentence_id) references sentence(sentence_id),
  word varchar(255)
);
