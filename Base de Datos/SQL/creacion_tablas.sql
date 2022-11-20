CREATE USER 'brisa'@'localhost' IDENTIFIED BY 'Admin1234*';
GRANT ALL PRIVILEGES ON *.* TO 'brisa'@'localhost' WITH GRANT OPTION;

FLUSH PRIVILEGES;

CREATE USER 'brisa'@'%' IDENTIFIED BY 'Admin1234*';
GRANT ALL PRIVILEGES ON *.* TO 'brisa'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;

-- crear tablas 
/*CREATE TABLE nombre_tabla(
 * nombre_columna1 tipo dato restricciones);
 */
-- modificando tablas
ALTER TABLE generationc2.tecnicos MODIFY COLUMN id INT primary key auto_increment NOT NULL;

CREATE TABLE generationc2.administrativos (
	id INT NOT NULL auto_increment,
	nombre varchar(100) NOT NULL,
	apellido varchar(100) NOT NULL,
	primary key (id)
);

-- describir tabla
describe estudiante;
-- consultar datos dentro de la tabla
select * from administrativos;

-- modificar la data
-- drop databse generationc2; (eliminar base de datos)
-- eliminar tabla, tambien contenidon inrecuperable
drop table directivos ;

-- eliminar contenido de una tabla
truncate table administrativos; 

-- modificar una data en una columna especifica
update nombre_tabla set nombre_columna= el_nuevo_dato where CONDICION;
update administrativos set nombre = "Laura" where id=4;

-- mostrar columnas especificas
select id, apellido
from administrativos ;

select nombre as first_name, id as rut from administrativos ;

select d.nombre as gato, d.id as rut
from administrativos d;

-- filtrar
INSERT INTO administrativos (nombre, apellido)
values ("omar","Palma");
select d.id,d.nombre,d.apellido 
from administrativos d
where d.nombre= "Andre"
and d.apellido="Montesinos";

-- filtrar por parte de palabra/numero LIKE->coincidencias
select d.id,d.nombre,d.apellido 
from administrativos d
where d.nombre like 'an%' ; 

select d.id,d.nombre,d.apellido 
from administrativos d
where d.nombre like '%el' ; 

select d.id,d.nombre,d.apellido 
from administrativos d
where d.nombre like '%r%' ; 

CREATE TABLE generationc2.cursos (
	id INT NOT NULL auto_increment,
	nombre varchar(100) NOT NULL,
	cant_alumnos varchar(100) NOT NULL,
	especialidad varchar(100),
	primary key (id)
);




