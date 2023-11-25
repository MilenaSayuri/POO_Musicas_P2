INTEGRANTES:

CAROLINA HIROMI HASHIMOTO   RA: 2040482222036 
LARISSA GALLOTA TRACINKAS   RA: 2040482222042
LUCIANA BRANCO SONODA       RA: 2040482122024
MILENA SAYURI HAYAKAWA      RA: 2040482222053  


[IMPORTANT NOTES TO RUN APPLICATION]

1 - [Require] Java sdk ( not sure about version url: https://www.oracle.com/java/technologies/downloads/#jdk21-windows)
  - Confirm that JAVA_HOME environment variable were created.

2 - [Require] Postgresql ( can be downloaded outside visual studio or in visual studio extensions )
  - Can be downloaded on ( https://www.postgresql.org/download/ )
  - Or visual studio extensions -> postgresql && mysql

3 - [Require] create table script
```Do not copy this line

CREATE TABLE tb_musica (
    codigo SERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    avaliacao INT NULL,
    ativo BOOLEAN
);

-- drop table tb_musica;
-- use db postgres
-- select * from tb_musica

``` Do not copy this line


Notes:
1. Issues regarding unused importants are appearing and making the application not running, just to fixing them make the form to apper ( work ).
2. Issues on register flow. ( nao rolou ).
3. "X" sign on top right not works.