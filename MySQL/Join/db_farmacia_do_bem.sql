CREATE DATABASE db_farmacia_do_bem;
 
 USE db_farmacia_do_bem;
 
 CREATE TABLE  tb_categoria (
	id_categoria BIGINT NOT NULL AUTO_INCREMENT,
	nome_da_categoria VARCHAR (255) NOT NULL,
    descricao_categoria VARCHAR (255) NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
	id_produto BIGINT NOT NULL AUTO_INCREMENT,
	nome_do_produto VARCHAR (255) NOT NULL,
    preco INT NOT NULL,
    possui_desconto BOOLEAN NOT NULL,
    fk_categoria BIGINT,
    
	PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria (nome_da_categoria, descricao_categoria) VALUE 
	("Genéricos","Medicamentos diversos"),
    ("Higiêne pessoal","Produtos de higiêne pessoal"),
    ("Cuidado sexual","Produtos para cuidado sexual"),
    ("Maquiagem", "Produtos de maquiagens em geral"),
    ("Skincare facial", "Dermocosméticos para cuidados faciais");
    
INSERT INTO tb_produto (nome_do_produto, preco, possui_desconto, fk_categoria) VALUE
	("Histamin", 10 ,FALSE,1),
    ("Camisisnha",14,TRUE,3),
    ("Loratadina", 7, FALSE, 1),
    ("Batom",17, FALSE,4),
    ("Ácido hialuronico", 66,TRUE,5),
    ("Bucha vegetal", 10, FALSE, 2),
    ("Lubrificante", 38,FALSE, 3),
    ("Hidratante", 99, FALSE, 5);
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome_do_produto LIKE "%B%";

SELECT * FROM tb_produto
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria;
    
SELECT * FROM tb_produto
	INNER JOIN tb_categoria ON fk_categoria = tb_categoria.id_categoria
		WHERE fk_categoria = 4;