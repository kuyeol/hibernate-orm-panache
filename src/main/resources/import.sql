INSERT INTO fruitEntity(id, name,passwor) VALUES (1, 'Cherry','pass');
INSERT INTO fruitEntity(id, name,password) VALUES (2, 'Apple','pass');
INSERT INTO fruitEntity(id, name,password) VALUES (3, 'Banana','pass');
ALTER SEQUENCE fruitEntity_seq RESTART WITH 4;

-- force using the same if for entity and repository to facilitate testing
INSERT INTO fruit(id, name,password) VALUES (1, 'Cherry','pass');
INSERT INTO fruit(id, name,password) VALUES (2, 'Apple','pass');
INSERT INTO fruit(id, name,password) VALUES (3, 'Banana','pass');
ALTER SEQUENCE fruit_seq RESTART WITH 4;
