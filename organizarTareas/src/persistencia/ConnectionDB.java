package persistencia;
import java.sql.*;
import logica.*;

/**
 * @author joaquin
 *
**/

public class ConnectionDB {
    
    private static ConnectionDB instance;
    private Connection con;
    private String driver;
    private String url;
    private String user;
    private String password;

    
    private ConnectionDB() {
        con = null;
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/coronavirusUY";
        user = "root"; 
        password = ""; 
    }
    
    public static ConnectionDB getInstance() {
        if (instance == null)
            instance = new ConnectionDB();
        return instance;
    }
    
    private Connection getConnection() throws Exception {
        Class.forName(driver); // Establecer y devolver la conexion
        con = DriverManager.getConnection(url, user, password);
        return con;
    }
    
    /* Specific methods... */
    
    public ListaUsuarios obtenerUsuarios() throws Exception {
        /* return all users in DB */
        
        ListaUsuarios lista = new ListaUsuarios();
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet result = st.executeQuery("select * from usuarios");
        while (result.next()) {
            Usuario usuario = new Usuario();
            // nombres segun los campos de la Bd:
            usuario.setNombreUsuario(result.getString("nombre")); 
            usuario.setPassword(result.getString("password"));
            if (result.getInt("tareasSuperpuestas") == 0)
                usuario.setTareasSuperpuestas(false);
            else 
                usuario.setTareasSuperpuestas(true);
            usuario.setNombrePersona(result.getString("nombrePersona"));
            usuario.setApellidoPersona(result.getString("apellidoPersona"));
            
            lista.add(usuario);
        }       
        con.close();
        return lista;
    }

    public Usuario obtenerUnUsuario(String n, String p) throws Exception {
        Usuario usuario = new Usuario();
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet result = st.executeQuery("select * from usuarios where nombre=" + n + " and password=" + p);
        /**
         * No seguro: se debe arreglar para impedir inyecciones SQL
         */
        while (result.next()) {
            usuario.setNombreUsuario(result.getString("nombre"));
            usuario.setPassword(result.getString("password"));
        }
        con.close();
        return usuario;
    }
    
    public ListaTareas obtenerTodasTareas() throws Exception {
        ListaTareas listaTareas = new ListaTareas();
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet result = st.executeQuery("SELECT * FROM Tareas");
        
        while (result.next()) {
            Tarea elemento = new Tarea();
            elemento.setId(result.getInt("id"));
            elemento.setNombre(result.getString("nombre"));
            elemento.setDescripcion(result.getString("descripcion"));
            
            Date fechaInicio = result.getDate("fechaInicio");
            Fecha objFechaInicio = new Fecha(fechaInicio.getDay(), fechaInicio.getMonth(), fechaInicio.getYear());
            elemento.setFechaInicio(objFechaInicio);
            
            Date fechaFin = result.getDate("fechaFin");
            Fecha objFechaFin = new Fecha(fechaFin.getDay(), fechaFin.getMonth(), fechaFin.getYear());
            elemento.setFechaFin(objFechaFin);
            
            Tarea.prioridad prioridad = (Tarea.prioridad) result.getObject("prioridad");
            elemento.setPrioridad(prioridad);
            listaTareas.add(elemento);
        }
        con.close();
        return listaTareas;
    }
    
    public ListaTareas obtenerTareasPorUsuario(String nombreUsuario) throws Exception {
        /**
         * tabla relacion Usuario_Tareas (retorna todas las tareas asociadas a un usuario específico)
         */
        ListaTareas tareasDeUsuario = new ListaTareas();
        ListaTareas todasTareas = obtenerTodasTareas(); // obtenemos todas las tareas con la query de la funcion de arriba
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet result = st.executeQuery("SELECT idTarea FROM Usuario_Tareas where nombreUsuario=" + nombreUsuario);
        
        while (result.next()) {
            int idTarea = result.getInt("idTarea");
            tareasDeUsuario.add(todasTareas.obtenerPorId(idTarea));
        }
        con.close();
        return tareasDeUsuario;
    }
    
    
}

