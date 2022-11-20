-- relaciones 
CREATE TABLE proveedores (
id INT PRIMARY KEY NOT NULL auto_increment,
nombre varchar (100) not null,
rut varchar (100) not null
);
create table direccion (
id int PRIMARY KEY NOT NULL auto_increment,
calle varchar (100) not null,
numero int not null,
sector varchar(100) not null,
ciudad varchar (100) not null,
codigo_postal int,
proveedores_id int not null
);
-- agregar fk en un paso / references tabla (id)
alter table direccion
ADD CONSTRAINT fk_proveedores_id
foreign key (proveedores_id) REFERENCES proveedores (id);
insert into proveedores (nombre, rut)
values ('Pepito', '1241'), ('Perry', '1244');
insert into proveedores (nombre, rut)
values ('Uma', '423535'), ('Flera', '112442');
insert into direccion  (calle, numero, sector, ciudad, codigo_postal, proveedores_id)
values ('Juanin', 1241, 'RM', 'Santiago', 1231, 1), ('iggsy', 1221, 'RM', 'Santiago', 1231, 2) ;
insert into direccion  (calle, numero, sector, ciudad, codigo_postal, proveedores_id)
values ('prip', 54757, 'RM', 'Santiago', 325, 3), ('lit', 3523, 'RM', 'Santiago', 54764, 4) ;
insert into direccion  (calle, numero, sector, ciudad, codigo_postal, proveedores_id)
values ('elle',46543, 'RM', 'Renca', 1231, 1), ('ephra', 345, 'RM', 'Santiago', 234, 1) ;
insert into proveedores (nombre, rut)
values ('Poi', '198765-2');
-- insert 
insert into proveedores 
(nombre,rut)values("micro","987654"),("mac","754635241"),("linux","213546643");

alter table direccion
add column region varchar(100);
insert into direccion
(calle,numero,sector,ciudad,region,codigo_postal,proveedores_id)
values("dire1",54321,"sector1","ciudad1","region1",532413,1),
("dire2",1245,"sector2","ciudad2","region2",7652345,1),
("dire3",54325,"sector3","ciudad3","region1",512345,3),
("dire4",75465,"sector4","ciudad4","region2",1346713,2);

select * from proveedores;
select * from direccion;

-- SQL JOINs
SELECT * from proveedores p 
	INNER JOIN direccion d
ON p.id = d.proveedores_id
;

SELECT * from proveedores p 
	INNER JOIN direccion d
ON p.id = d.proveedores_id
where p.id = 1 -- filtro o condicion
;

SELECT d.* from proveedores p 
	INNER JOIN direccion d
ON p.id = d.proveedores_id
where p.id = 1 -- filtro o condicion
;


SELECT d.id,d.calle,d.numero
from proveedores p 
	INNER JOIN direccion d -- encontrar registros en comun entre dos o mas tablas
ON p.id = d.proveedores_id
where p.id = 1 -- filtro o condicion
;

SELECT d.id,d.calle,d.numero, p.nombre
from proveedores p 
	INNER JOIN direccion d
ON p.id = d.proveedores_id
where d.id = 1 -- filtro o condicion
;

-- left join
SELECT *
from proveedores p 
	left JOIN direccion d
ON p.id = d.proveedores_id
;

-- right join
SELECT *
from proveedores p 
	right JOIN direccion d
ON p.id = d.proveedores_id
;