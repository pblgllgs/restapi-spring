INSERT INTO user_details (id, birth_date, name) VALUES (10001, current_date(),'pblgllgs');
INSERT INTO user_details (id, birth_date, name) VALUES (10002, current_date(),'pbl');
INSERT INTO user_details (id, birth_date, name) VALUES (10003, current_date(),'gllgs');

INSERT INTO post (id, description, user_id) VALUES (20001, 'AWS',10001);
INSERT INTO post (id, description, user_id) VALUES (20002, 'DOCKER',10001);

INSERT INTO post (id, description, user_id) VALUES (20003, 'AZURE',10003);
INSERT INTO post (id, description, user_id) VALUES (20004, 'AWS',10002);