
/* tabla de los usuarios en bd */
CREATE TABLE usuarios(
  nombre varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  PRIMARY KEY(nombre)
);

/* datos de prueba para la conexion a mysql desde Java */

insert into usuarios values(
  'jparrilla',
  'joaquin10'
);
insert into usuarios values(
  'pedroalfonso12',
  'alfonsoxd777'
);

