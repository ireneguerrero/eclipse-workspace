DROP DATABASE IF EXISTS actividad;
CREATE DATABASE actividad;
USE actividad;

CREATE TABLE profesores (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellidos VARCHAR(35),
    direccion VARCHAR(55),
    cp VARCHAR(10),
    ciudad VARCHAR(50),
    provincia VARCHAR(50),
    telefono VARCHAR(55)
);