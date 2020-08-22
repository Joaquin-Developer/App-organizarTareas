# App - Organizar Tareas - v1.0
Aplicación que me permite organizar mis tareas del día a día. Desarrollo principal con Java.

## Pasos para ejecutar proyecto:
- En caso de no tener java 8 instalado, instalarlo :)
- Clonar todo el repositorio

#### con respecto a la DB:
- En caso de no tener un gestor de DB como MariaDB o MySQL, instalar :)
- Dentro del gestor, ejecutar: `mysql -u root -p coronavirusUY < /ruta/donde/esta/descargado/el/repositorio/Dump-db.sql`
- En caso que el puerto remoto de MySQL sea distinto a 3306, modificarlo a dicho puerto.
- Mantener iniciado el servicio de mysql. (Con XAMPP: ejecutar `xampp startmysql`, en algunas distros de linux, en particular las derivadas de RedHat: `systemctl start mysqld`)

#### con respacto a la aplicación de ecritorio:
- Luego de tener java instalado, dirigirse al repositorio y Ejecutar: `/organizarTareas/dist/organizarTareas.java`. (De momento solo se puede ejecutar desde un .java, proximanente tendré que generar un ejecutable .exe para Windows)

##### proximamente:

- Voy a extender las posibilidades de la aplicación agregando una app web aparte de la desktop, que tendrá la misma funcionalidad (con ANgular para el frontend y Nodejs en backend)
- ...
