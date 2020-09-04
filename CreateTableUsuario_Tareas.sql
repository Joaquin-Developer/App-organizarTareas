
/* tabla relacion entre Usuarios y Tareas */
CREATE TABLE Usuario_Tareas (
  nombreUsuario varchar(255) not null,
  idTarea int unsigned not null AUTO_INCREMENT,
  PRIMARY KEY(nombreUsuario, idTarea),
  FOREIGN KEY(nombreUsuario) REFERENCES usuarios(nombre),
  FOREIGN KEY(idTarea) REFERENCES Tareas(id)
);


