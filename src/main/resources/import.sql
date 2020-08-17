-- Marcas :
INSERT INTO Marca(nome) VALUES ('EISENBAHN');
INSERT INTO Marca(nome) VALUES ('HEINEKEN');
INSERT INTO Marca(nome) VALUES ('BUDWEISER');
INSERT INTO Marca(nome) VALUES ('BRAHMA');
INSERT INTO Marca(nome) VALUES ('SKOL');


-- Usuários :
INSERT INTO Usuario(email, nome, senha) VALUES ('robert@nasa.com', 'Robert Santos', 'Abqlh345');
INSERT INTO Usuario(email, nome, senha) VALUES ('gabo@spacex.com', 'Gabo Dorian', 'Emlq002Qa');
INSERT INTO Usuario(email, nome, senha) VALUES ('alvaro@cia.com', 'Alvaro da Silva', 'Zebra1234');


-- Patrimonios :
INSERT INTO Patrimonio(nome, marca, descricao) VALUES ('Robert Santos',   '1', '2 caixas de EISENBAHN');
INSERT INTO Patrimonio(nome, marca, descricao) VALUES ('Robert Santos',   '2', '5 caixas de BUDWEISER');
INSERT INTO Patrimonio(nome, marca, descricao) VALUES ('Gabo Dorian',     '3', '1 caixas de HEINEKEN');
INSERT INTO Patrimonio(nome, marca, descricao) VALUES ('Gabo Dorian',     '1', '2 caixas de BRAHMA');
INSERT INTO Patrimonio(nome, marca, descricao) VALUES ('Gabo Dorian',     '5', '3 caixas de BUDWEISER');
INSERT INTO Patrimonio(nome, marca, descricao) VALUES ('Alvaro da Silva', '4', '4 caixas de SKOL');

