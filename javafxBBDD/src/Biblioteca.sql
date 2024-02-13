DROP DATABASE IF EXISTS biblioteca;
CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE libros(
	id INT AUTO_INCREMENT NOT NULL,
    titulo VARCHAR(100),
    editorial VARCHAR(100),
    autor VARCHAR(100),
    paginas INT
);