DROP TABLE IF EXISTS TEST;
CREATE TABLE CONVIDADO(ID INT PRIMARY KEY, NAME VARCHAR(255), QTDEACOMPANHANTES INT);


insert into convidado (id, nome, quantidade_acompanhantes) values (1, 'Pedro', 2);
insert into convidado (id, nome, quantidade_acompanhantes) values (2, 'Maria', 3);
insert into convidado (id, nome, quantidade_acompanhantes) values (3, 'Ricardo', 1);