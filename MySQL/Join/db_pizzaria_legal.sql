CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
    id INT NOT NULL auto_increment,
    categoria VARCHAR (255),
    tamanho VARCHAR (255),
    PRIMARY KEY (id)
);

CREATE TABLE tb_pizza (
id INT NOT NULL AUTO_INCREMENT,
sabores VARCHAR (255) NOT NULL,
categoria INT,
valor INT NOT NULL,
Adicionais VARCHAR (255),
PRIMARY KEY (id),
FOREIGN KEY (categoria) REFERENCES tb_categoria (id)
);

INSERT INTO tb_categoria (nome_da_categoria, descricao_categoria) VALUE 
	("Salgada pequena","Pizza de 25 centímetro de diâmetro com recheio salgado."),
    ("Doce pequena","Pizza de 25 centímetro de diâmetro com recheio doce."),
    ("Salgada média","Pizza de 35 centímetro de diâmetro com recheio salgado."),
    ("Doce média", "Pizza de 35 centímetro de diâmetro com recheio doce."),
    ("Salgada grande", "Pizza de 45 cm de diâmetro com recheio salgado.");
    
INSERT INTO tb_pizza (nome_da_pizza, preco, ingredientes, fk_categoria) VALUE
	("Atum", 40 , "Atum sólido temperado e cebola",3),
    ("Baiana",52,"Calabresa curada moída. cebola e pimenta vermelha.",3),
    ("Beijinho", 35, "Beijinho e coco ralado.", 2),
    ("Banana",43, "Banana e doce de leite.",4),
    ("Escarola", 28,"Escarola, mussarela e bacon.",1),
    ("Marguerita", 28, "Mussarela, manjerição natural e parmesão.", 1),
    ("Napolitana", 65,"Mussarela, fatias de tomate e parmesão.", 5),
    ("Palmito", 61, "Palmito e mussarela.", 5);
    
SELECT * FROM tb_pizza WHERE preco > 45;
SELECT * FROM tb_pizza WHERE preco BETWEEN 29 AND 60;
SELECT * FROM tb_pizza WHERE nome_da_pizza LIKE "%c%";

SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria;
    
SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria
		WHERE fk_categoria = 5;