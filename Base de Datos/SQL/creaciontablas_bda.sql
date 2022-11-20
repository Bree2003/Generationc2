create table rol(
id_rol int not null auto_increment,
nombre varchar(50) not null,
primary key(id_rol)
);

create table dueno (
id_dueno int not null auto_increment,
contrasena varchar(50) not null,
rol_id int not null,
primary key(id_dueno),
foreign key (rol_id) references rol(id_rol)
);


create table administrador (
id_administrador int not null auto_increment,
contrasena varchar(50) not null,
rol_id int not null,
primary key (id_administrador),
foreign key (rol_id) references rol(id_rol)
);

create table cliente (
id_cliente int not null auto_increment,
rut varchar(50) not null,
empresa boolean not null,
primary key (id_cliente)
);


create table usuario(
id_usuario int not null auto_increment,
nombre varchar(50) not null,
apellido varchar(50) not null,
correo varchar(50) not null,
telefono varchar(50) not null,
direccion_id int not null,
primary key (id_usuario),
foreign key (direccion_id) references direccion(id_direccion)
);

create table direccion (
id_direccion int not null auto_increment,
calle varchar(50) not null,
numero int not null,
comuna varchar(50) not null,
region varchar(50) not null,
depto varchar(50),
codigopostal int,
primary key (id_direccion)
);

create table categorias (
id_categorias int not null primary key auto_increment,
nombre varchar (20) not null,
descripcion varchar (100)
);

create table diseno (
id_diseno INT PRIMARY KEY NOT NULL auto_increment,
serigafia varchar (100) not null
);

create table tallaje (
id_tallaje INT PRIMARY KEY NOT NULL auto_increment,
talla varchar (3) not null
);

create table producto (
id INT PRIMARY KEY NOT NULL auto_increment,
nombre varchar (50) not null,
precio int not null,
categoria_id int not null,
diseno_id int not null,
tallaje_id int,
foreign key (categoria_id) references categorias(id_categorias),
foreign key (diseno_id) references diseno(id_diseno),
foreign key (tallaje_id) references tallaje(id_tallaje)
);


create table medioPago (
id_medioPago int not null auto_increment,
nombre varchar(50) not null,
descripcion varchar(50) not null,
primary key (id_medioPago)
);

create table envio(
id_envio int not null auto_increment,
tipoEnvio varchar(50) not null,
costoEnvio int not null,
regionEnvio varchar(50) not null,
medioPago_id int not null,
cliente_id int not null,
total int,
primary key (id_envio),
foreign key (medioPago_id) references medioPago(id_medioPago),
foreign key (cliente_id) references cliente(id_cliente)
);

create table envio_producto(
id_envio_producto int not null auto_increment,
envio_id int not null,
producto_id int not null,
cant_producto int not null,
subtotal int not null,
iva int not null,
primary key (id_envio_producto),
foreign key (envio_id) references envio(id_envio),
foreign key (producto_id) references producto(id)
);

create table carrito(
id_carrito int not null auto_increment,
cantidad int not null,
producto_id int not null,
primary key (id_carrito),
foreign key (producto_id) references producto(id)
);

create table dte (
id_dte int not null auto_increment,
envio_id int not null,
observacion varchar(50) not null,
primary key (id_dte)
);
