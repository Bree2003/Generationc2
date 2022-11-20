-- relacion de muchos a muchos

CREATE TABLE productos( -- recuerda colocar parentesis
id int primary key not null auto_increment,
nombre varchar(100),
descripcion varchar(100));

alter table productos add valor_unitario int;


CREATE TABLE pedidos(
id int primary key not null auto_increment,
fecha date not null,
monto int not null,
cliente_id int);

alter table pedidos modify column fecha datetime not null;
-- tabla intermedia o relacional; orden alfabetico(pedidos_productos)
-- id, fk tabla1, fk tabla2
-- id, pedido_id, producto_id

CREATE TABLE pedidos_productos(
id int primary key not null auto_increment,
pedido_id int not null ,
producto_id int not null,
foreign key (producto_id) references productos(id),
foreign key (pedido_id) references pedidos(id));

alter table pedidos_productos add cantidad_productos,add subtotal int;



INSERT INTO productos (nombre,descripcion)
VALUES ('Manzana','Fruta'),
('Naranja','Fruta'),
('Pera','Fruta'),
('Cebolla','Verdura'),
('Ajo','Verdura'),
('Zapallo','Verdura');

INSERT INTO pedidos(fecha,monto) -- default año mes dia
VALUES ('2022-11-09 16:24:56',10000);

insert into pedidos_productos (pedido_id,producto_id)
values(1,1),(1,1);
