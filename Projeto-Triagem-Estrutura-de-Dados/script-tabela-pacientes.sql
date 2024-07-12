CREATE DATABASE triagem;
USE triagem;
CREATE TABLE pacientes (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    idade VARCHAR(10) NOT NULL,
    sexo VARCHAR(20) NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    email VARCHAR(50) NOT NULL,
    cpf VARCHAR(30) NOT NULL,
    telefone VARCHAR(20) NOT NULL
);

CREATE TABLE fila_de_espera (
	id INT PRIMARY KEY AUTO_INCREMENT,
    id_paciente INT,
    pontuacao INT,
    FOREIGN KEY (id_paciente) REFERENCES pacientes (id)
);
