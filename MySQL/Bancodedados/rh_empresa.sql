CREATE DATABASE rh_empresa;

USE rh_empresa;
   
CREATE TABLE funcionaries (
	nome_funcionarie VARCHAR (100) NOT NULL,
	id_funcionarie INT NOT NULL AUTO_INCREMENT,
    salario FLOAT (10,2) NOT NULL,
    idade INT NOT NULL,
    cargo VARCHAR (100) NOT NULL,
    PRIMARY KEY (id_funcionarie)
);

INSERT INTO funcionaries (nome_funcionarie, salario, idade, cargo) VALUE 
	("Giullia", 2000.00, 20, "Desenvolvedora"),
    ("Agda", 5000.00, 56, "Pedagoga"),
    ("Agata", 6000.00,32, "Diretora de escola"),
    ("José", 4500.00,43, "Operador de máquinas"),
    ("Gustavo", 3000.00, 20, " Técnico em audiovisual");
    
SELECT * FROM funcionaries 
	WHERE salario > 2000; 
    
SELECT * FROM funcionaries 
	WHERE salario < 2000; 

SET SQL_SAFE_UPDATES=0;
UPDATE funcionaries SET salario = salario + 12000.00 WHERE nome_funcionarie = "Gustavo";
    
