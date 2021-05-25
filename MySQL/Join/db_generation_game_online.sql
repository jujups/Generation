CREATE DATABASE db_generation_game_online; 

USE db_generation_game_online;

CREATE TABLE  tb_classe (
	id_classe BIGINT NOT NULL AUTO_INCREMENT,
	nome_da_classe VARCHAR (255) NOT NULL,
    descricao_classe VARCHAR (255) NOT NULL,
    PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagem (
	id_personagem BIGINT NOT NULL AUTO_INCREMENT,
	nome_personagem VARCHAR (255) NOT NULL,
    poder_ataque INT NOT NULL,
    poder_defesa INT NOT NULL,
    fk_classe BIGINT,
    
	PRIMARY KEY (id_personagem),
    FOREIGN KEY (fk_classe) REFERENCES tb_classe(id_classe)
);

INSERT INTO tb_classe (nome_da_classe, descricao_classe) VALUE 
	("Guerreiro","Causa um alto dano em Tarefas. Defesa moderada contra danos."),
    ("Mago","Causa dano moderado em tarefas. Ganha muita experiencia."),
    ("Curandeiro", "Alta defesa contra danos. Podem se curar e curar membro da equipe."),
    ("Gatuno", "Encontra mais itens e ouro. Maior chance de causar golpe critico, que garante bônus de ouro & EXP."),
    ("Cavaleiros", "Alta resistência,combate corporal com espadas, lanças, machados, maças e escudos, vestimentas e armaduras pesadas");
    
INSERT INTO tb_personagem (nome_personagem, poder_ataque, poder_defesa, fk_classe) VALUE
	("Clementine", 9900, 7367, 3),
    ("Lara",2819, 3483, 5),
    ("Lee", 5889, 5800, 2),
    ("Sonya", 1454, 1569, 2),
    ("Lady", 1286, 4180, 3),
    ("Karen", 1890, 1257, 4),
    ("Link", 7895, 5455, 3),
    ("Amy", 3928, 1659, 5);
    
SELECT * FROM tb_personagem WHERE poder_ataque > 2000;
SELECT * FROM tb_personagem WHERE poder_defesa BETWEEN 1000 AND 2000;
SELECT nome_personagem, poder_ataque, poder_defesa FROM tb_personagem WHERE nome_personagem LIKE "%c%";

SELECT * FROM tb_personagem 
	INNER JOIN tb_classe ON fk_classe = tb_classe.id_classe;
    
SELECT nome_personagem, poder_ataque, poder_defesa FROM tb_personagem
	INNER JOIN tb_classe ON fk_classe = tb_classe.id_classe
		WHERE fk_classe = 2;