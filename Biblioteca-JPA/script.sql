DROP DATABASE IF EXISTS biblioteca_jpa;

CREATE DATABASE biblioteca_jpa;
USE biblioteca_jpa;

CREATE TABLE livro (
	id int PRIMARY KEY AUTO_INCREMENT,
    titulo varchar(100),
    autor varchar(100),
    dataLancamento varchar(100)
);

CREATE TABLE usuario (
	id int PRIMARY KEY AUTO_INCREMENT,
    login varchar(100),
    senha varchar(100),
    tipo varchar(100)
);

INSERT INTO usuario (login, senha, tipo) VALUES ("Lucas", "123", "Administrador");
INSERT INTO usuario (login, senha, tipo) VALUES ("Arthur", "1234", "Aluno");
INSERT INTO usuario (login, senha, tipo) VALUES ("Bryan", "1234", "");


SELECT * FROM biblioteca_jpa.livro;
SELECT * FROM biblioteca_jpa.usuario;

