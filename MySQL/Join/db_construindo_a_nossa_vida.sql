CREATE DATABASE db_construindo_a_nossa_vida;
 
 USE db_construindo_a_nossa_vida;
 
 CREATE TABLE  tb_categoria (
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
	nome_da_categoria VARCHAR (255) NOT NULL,
    descricao_categoria VARCHAR (255) NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
	id_produto BIGINT NOT NULL AUTO_INCREMENT,
	nome_do_produto VARCHAR (255) NOT NULL,
    preco FLOAT NOT NULL,
    disponibilidade_estoque BOOLEAN NOT NULL,
    fk_categoria BIGINT,
    
	PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome_da_categoria, descricao_categoria) VALUE 
	("Pisos e revestimentos","Departamento de pisos e revestimentos"),
    ("Pintura","Departamento de tintas e acessórios"),
    ("Elétrica","Departameto de materiais elétricos"),
    ("Jardim", "Departamento de móveis e decoração de jardim"),
    ("Lavanderia", "Departamento de acessórios de limpeza e decoração");
    
INSERT INTO tb_produto (nome_do_produto, preco, disponibilidade_estoque, fk_categoria) VALUE
	("Cesto de Roupa", 50.0 ,TRUE,5),
    ("Cimento queimado",374.0,TRUE,1),
    ("Tanque", 220.00, FALSE, 5),
    ("Vaso",110.90, FALSE,4),
    ("Resistência torneira", 32.89,TRUE,3),
    ("Granito", 254.6, FALSE, 1),
    ("Kit de pincéis", 49.54,TRUE, 2),
    ("Tinta acrílica rosa", 179.00, FALSE, 2);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome_do_produto LIKE "%C%";

SELECT * FROM tb_produto
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria;
    
SELECT * FROM tb_produto
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria
		WHERE fk_categoria = 2;