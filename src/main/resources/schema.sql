--
-- Tablas de la base de datos: `DESAFIO_DWF`
--
CREATE TABLE materia (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(255) NOT NULL
);

CREATE TABLE alumno (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        nombre VARCHAR(255) NOT NULL,
                        apellido VARCHAR(255) NOT NULL,
                        id_materia INT,
                        FOREIGN KEY (id_materia) REFERENCES materia(id) ON DELETE SET NULL
);
