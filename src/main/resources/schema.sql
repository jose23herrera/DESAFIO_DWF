--
-- Tablas de la base de datos: `DESAFIO_DWF`
--

-- ----------------------------------------------------------------
--  TABLE POST
-- ----------------------------------------------------------------
DROP TABLE IF EXISTS alumno;
DROP TABLE IF EXISTS materia;

CREATE TABLE materia (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(100) NOT NULL
);

CREATE TABLE alumno (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        nombre VARCHAR(100) NOT NULL,
                        apellido VARCHAR(100) NOT NULL,
                        id_materia BIGINT,
                        FOREIGN KEY (id_materia) REFERENCES materia(id)
);
