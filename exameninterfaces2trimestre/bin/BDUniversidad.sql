DROP DATABASE IF EXISTS universidad;
CREATE DATABASE universidad;
USE universidad;

CREATE TABLE estudiante(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    correo_electronico VARCHAR(100) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    curso VARCHAR(50) NOT NULL,
    fecha_inscripcion VARCHAR(10) NOT NULL
);