-- insertar datos en tablas
-- definicio   INSERT INTO NOMBRE_TABLA (NOMBRE_COLUMNA1,NOMBRE_COLUMNA2...) VALUES (VALOR1, VALOR2...);
INSERT INTO administrativos  (nombre, apellido)
values ("Rafael","Guerrero");
INSERT INTO administrativos (nombre, apellido)
values ("Maggi","Fernandez");
-- consultar
SELECT * 
FROM administrativos ;

INSERT INTO administrativos (nombre, apellido)
values ("Andre","Montesinos"), ("Israel","Palma");

insert into cursos (nombre,cant_alumnos,especialidad)
value ("Cohorte 1",30,"Java"),
("Cohorte 1",34,"Java"),
("Cohorte 1",35,"Java");

select * from cursos;

-- agregar la fk a estudiantes

-- creacion columna
ALTER TABLE estudiantes 
ADD curso_id int;

-- relacionar tablas
ALTER TABLE estudiantes 
ADD FOREIGN KEY (curso_id) REFERENCES cursos(id);

INSERT INTO estudiantes (nombre,apellido,curso_id)
values("Jane","Doe",4);
