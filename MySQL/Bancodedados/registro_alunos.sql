CREATE DATABASE registro_alunos;

USE registro_alunos;

CREATE TABLE alunes (
	nome VARCHAR (255) NOT NULL,
    ra INT NOT NULL AUTO_INCREMENT,
    idade INT NOT NULL,
    nota FLOAT (10,1) DEFAULT 0,
    turma VARCHAR(255) NOT NULL,
    PRIMARY KEY (ra)
  );
  
INSERT INTO alunes (nome, idade,turma) VALUE 
   ("Mariana", 6.0, "21"),
   ("Marina", 8.0,"22"),
   ("Miriam", 9.0, "23"),
   ("Maria",12.0, "24"),
   ("Manuela",17.0, "25");
   
SET SQL_SAFE_UPDATES = 0;
UPDATE alunes SET nota = 9.0 WHERE nome = "Marina";

UPDATE alunes SET nota = 6.5 WHERE nome = "Mariana";

SELECT * FROM alunes WHERE
	nota > 7;
    
SELECT * FROM alunes WHERE
	nota < 7;