CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE produtos (
	nome VARCHAR (255) NOT NULL, 
    id INT NOT NULL AUTO_INCREMENT, 
    valor FLOAT (10,2) NOT NULL,
    categoria_produto VARCHAR (255),
    quantidade INT NOT NULL,
    PRIMARY KEY (id)
); 

INSERT INTO produtos (nome, valor, categoria_produto, quantidade) VALUE 
	("Cleansing oil", 70.00, "Skincare",30),
    ("Corretivo", 35.00, "Maquiagem", 10),
    ("Bruma", 33.90, "Skincare", 5),
    ("Kit pincéis naturais", 700.00, "Artes", 23),
    ("Acrilicas", 10.00, "Artes",32);
    
SELECT * FROM produtos 
	WHERE valor > 500; 

SELECT * FROM produtos
	WHERE valor < 500;

SET SQL_SAFE_UPDATES = 0;
UPDATE produtos SET quantidade = 40 WHERE nome = "Kit pincéis naturais";