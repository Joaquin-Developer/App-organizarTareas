
/*TODO - tabla con todas las tareas de todos los usuarios */
CREATE TABLE Tareas (
  id int unsigned not null AUTO_INCREMENT,
  nombre varchar(80) not null,
  descripcion varchar(200) not null default 'Sin descripcion',
  fechaInicio DATE not null,
  fechaFin DATE not null,
  prioridad enum('Alta', 'Baja', 'Normal') not null,
  PRIMARY KEY(id)
);


