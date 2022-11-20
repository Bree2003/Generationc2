-- crear tabla clientes
CREATE TABLE clientes_almacen(
id int not null primary key auto_increment,
nombre varchar(50) not null,
apellido varchar(50) not null
);

-- insertar datos en clientes
INSERT INTO clientes_almacen (nombre,apellido)
VALUES ('Israel','Palma'),
('Alejandro', 'Heredia'),
('Andrea','Montecinos'),
('Magdalena','Fernández'),
('Brisa','Sandoval');

-- crear tabla proveedores
CREATE TABLE proveedores_almacen(
	id int not null primary key auto_increment,
	nombre varchar(50) not null,
	rut varchar(50) not null,
	telefono varchar(50) not null
);

-- insertar diferentes proveedores
INSERT INTO proveedores_almacen (nombre,rut,telefono)
VALUES ('clean.LTDA','2456123-8','923786514'),
('fruitvegetable.LTDA','6429842-7','912568945'),
('school.LTDA','4597612-3','942615784'),
('food.LTDA', '7489265-5','945781256');



CREATE TABLE productos_almacen(
id int not null primary key auto_increment,
nombre varchar (50) not null,
tipo varchar(50) not null,
descripcion varchar(50)
);


-- insertar diferentes articulos de aseo
-- con descripcion
INSERT INTO productos_almacen(nombre,tipo,descripcion)
VALUES ('Detergente','Artículos de Aseo','Cocina'),
 ('Jabón','Artículos de Aseo','Baño'),
 ('Shampoo','Artículos de Aseo','Baño'),
('Acondicionador','Artículos de Aseo','Baño'),
 ('Esponja','Artículos de Aseo','Cocina'),
 ('Paño','Artículos de Aseo','Cocina');
-- sin descripcion
INSERT INTO productos_almacen(nombre,tipo)
VALUES ('Limpia pisos','Artículos de Aseo'),
 ('Trapero','Artículos de Aseo'),
 ('Escoba','Artículos de Aseo'),
 ('Trapero','Artículos de Aseo');

-- insertar diferentes frutas y verduras
-- con descripcion
INSERT INTO productos_almacen(nombre,tipo,descripcion)
VALUES ('Manzana','Frutas y Verduras','Fruta'),
 ('Naranja','Frutas y Verduras','Fruta'),
 ('Zanahoria','Frutas y Verduras','Verdura'),
 ('Cebolla','Frutas y Verduras','Verdura'),
 ('Papa','Frutas y Verduras','Verdura'),
 ('Lechuga','Frutas y Verduras','Verdura'),
('Frutilla','Frutas y Verduras','Fruta');
-- sin descripcion
INSERT INTO productos_almacen(nombre,tipo)
VALUES ('Tomate','Frutas y Verduras');

-- insertar diferentes articulos escolares
-- sin descripcion
INSERT INTO productos_almacen(nombre,tipo)
VALUES ('Cuaderno','Artículos Escolares'),
 ('Lápiz','Artículos Escolares'),
('Regla','Artículos Escolares'),
 ('Goma','Artículos Escolares'),
('Destacador','Artículos Escolares'),
 ('Cartulina','Artículos Escolares'),
 ('Tijeras','Artículos Escolares');

-- insertar diferentes alimentos
-- con descripcion
INSERT INTO productos_almacen(nombre,tipo,descripcion)
VALUES ('Espirales','Alimentos','Fideos'),
 ('Nidos','Alimentos','Fideos'),
 ('Spaghetti','Alimentos','Fideos'),
 ('Lasagna','Alimentos','Fideos'),
('Raviolis','Alimentos','Fideos'),
 ('Leche','Alimentos','Lácteos'),
 ('Queso','Alimentos','Lácteos');
-- sin descripcion
INSERT INTO productos_almacen(nombre,tipo)
VALUES ('Queso rallado','Alimentos'),
 ('Orégano','Alimentos'),
('Comino','Alimentos');

-- crear tabla abastecimiento
CREATE TABLE abastecimiento_almacen(
id int not null primary key auto_increment,
fecha datetime not null,
proveedor_id int not null,
producto_id int not null,
cantidad int not null,
precio_unitario int not null,
foreign key (proveedor_id) references proveedores_almacen(id),
foreign key (producto_id) references productos_almacen(id)
);






-- ventas almacen
CREATE TABLE ventas_almacen(
id int not null primary key auto_increment,
fecha datetime not null,
cliente_id int not null,
producto_id int not null,
cantidad int not null,
precio_unitario int not null,
foreign key (cliente_id) references clientes_almacen(id),
foreign key (producto_id) references productos_almacen(id)
);


-- preguntas
-- pedidos del proveedor 4 del año 2022
select fecha, proveedor_id,producto_id, cantidad ,precio_unitario ,cantidad*precio_unitario as total
from abastecimiento_almacen aa 
where proveedor_id =4 and fecha >= '2022-1-1';

-- compras del cliente 2 el año 2021
select fecha, cliente_id,producto_id, cantidad, precio_unitario , (cantidad*precio_unitario) as total
from ventas_almacen va 
where cliente_id = 2 and fecha between '2021-1-1' and '2022-1-1';

-- sumar total producto adquiridos
select sum(cantidad) as productos_adquiridos
from abastecimiento_almacen aa ;


-- productos restantes
select sum(aa.cantidad) as productos_adquiridos, sum(va.cantidad) as productos_vendidos, (sum(aa.cantidad)-sum(va.cantidad)) as productos_restantes
from abastecimiento_almacen aa 
inner join ventas_almacen va 
on aa.id = va.id ;

-- total ventas año 2020
select fecha,cliente_id,producto_id ,cantidad ,precio_unitario ,(cantidad*precio_unitario) as total
from ventas_almacen va 
where fecha < '2021-1-1';

-- cantidad compras año 2022
select count(cantidad)
from ventas_almacen
where fecha >= '2022-1-1';

-- total gastado en compra de productos de los 3 años
select sum(cantidad*precio_unitario) as comprado
from abastecimiento_almacen aa ;

-- total ganancia en venta de productos de los 3 años
select sum(cantidad*precio_unitario) as vendido
from ventas_almacen va ;

-- total ganancia
select sum(va.cantidad*va.precio_unitario) as comprado,sum(aa.cantidad*aa.precio_unitario) as vendido, (sum(va.cantidad*va.precio_unitario)-sum(aa.cantidad*aa.precio_unitario)) as ganancia
from ventas_almacen va 
inner join abastecimiento_almacen aa 
on va.id = aa.id; ;

-- total comprado y total vendido
select aa.cantidad,aa.fecha ,(aa.cantidad*aa.precio_unitario) as comprado, va.fecha,va.cantidad, (va.cantidad*va.precio_unitario) as vendido
from abastecimiento_almacen aa 
inner join ventas_almacen va 
on aa.id =va.id 
;