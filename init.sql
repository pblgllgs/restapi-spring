create table user_details (id integer not null, birth_date date, name varchar(255), primary key (id));
create table user_details_seq (next_val bigint);
insert into user_details_seq values ( 1 );

INSERT INTO user_details (id, birth_date, name) VALUES (10001, current_date(),'pblgllgs');
INSERT INTO user_details (id, birth_date, name) VALUES (10002, current_date(),'pbl');
INSERT INTO user_details (id, birth_date, name) VALUES (10003, current_date(),'gllgs');

create table post (id integer not null, description varchar(255), user_id integer, primary key (id));
alter table post add constraint FK_user foreign key (user_id) references user_details (id);
create table post_seq (next_val bigint);
insert into post_seq values ( 1 );

INSERT INTO post (id, description, user_id) VALUES (20001, 'AWS',10001);
INSERT INTO post (id, description, user_id) VALUES (20002, 'DOCKER',10001);
INSERT INTO post (id, description, user_id) VALUES (20003, 'AZURE',10003);
INSERT INTO post (id, description, user_id) VALUES (20004, 'AWS',10002);