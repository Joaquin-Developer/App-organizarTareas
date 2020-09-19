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
    
    // *********** SELECT STATEMENTS *******************************************************************
    
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
            if (result.getInt("tareasSuperpuestas") == 0)
                usuario.setTareasSuperpuestas(false);
            else 
                usuario.setTareasSuperpuestas(true);
            usuario.setNombrePersona(result.getString("nombrePersona"));
            usuario.setApellidoPersona(result.getString("apellidoPersona"));
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
            
            //Tarea.Prioridad prioridad = (Tarea.Prioridad) result.getObject("prioridad");
            elemento.setPrioridad(result.getString("prioridad"));
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
        ResultSet result = st.executeQuery("SELECT idTarea FROM Usuario_Tareas where nombreUsuario='" + nombreUsuario + "'");
        
        while (result.next()) {
            int idTarea = result.getInt("idTarea");
            tareasDeUsuario.add(todasTareas.obtenerPorId(idTarea));
        }
        con.close();
        return tareasDeUsuario;
    }
    
    // *********** END SELECT STATEMENTS ***************************************************************
    
    // *********** INSERT STATEMENTS *******************************************************************
    
    public void ingresarUsuario (Usuario nuevoUsuario) throws Exception {
        
        Connection conexion = getConnection();
        conexion.setAutoCommit(false);
        String query = "insert into usuarios (nombre, password, tareasSuperpuestas, " +
                "nombrePersona, apellidoPersona) values(?,?,?,?,?)";
        
        PreparedStatement st = conexion.prepareStatement(query);
        st.setString(1, nuevoUsuario.getNombreUsuario());
        st.setString(2, nuevoUsuario.getPassword());
        if (nuevoUsuario.getTareasSuperpuestas())
            st.setInt(3, 1);
        else    
            st.setInt(3, 0);
        st.setString(4, nuevoUsuario.getNombrePersona());
        st.setString(5, nuevoUsuario.getApellidoPersona());        
        st.executeUpdate();
        conexion.commit();
        conexion.close();
    }
    
    public void ingresarTarea (Tarea nuevaTarea) throws Exception{
        Connection conexion = getConnection();
        conexion.setAutoCommit(false);
        String query = "insert into Tareas (nombre, descripcion, fechaInicio, fechaFin, prioridad) " +
                "values(?,?,?,?,?)";
        
        PreparedStatement st = conexion.prepareStatement(query);
        st.setString(1, nuevaTarea.getNombre());
        st.setString(2, nuevaTarea.getDescripcion());
        
        java.sql.Date fechaInicio = new java.sql.Date(nuevaTarea.getFechaInicio().getAnio(), 
                nuevaTarea.getFechaInicio().getMes(), nuevaTarea.getFechaInicio().getDia());
        st.setDate(3, fechaInicio);
        
        java.sql.Date fechaFin = new java.sql.Date(nuevaTarea.getFechaFin().getAnio(), 
                nuevaTarea.getFechaFin().getMes(), nuevaTarea.getFechaFin().getDia());
        st.setDate(4, fechaFin);        
        st.setString(5, nuevaTarea.getPrioridad());

        st.executeUpdate();
        conexion.commit();
        conexion.close();
    }
    
    public void relacionarTareaUsuario (Tarea tarea, Usuario usuario) {
        
    }
    
    // *********** END INSERT STATEMENTS ***************************************************************
    
    // *********** UPDATE/DELETE STATEMENTS ************************************************************
    
    public void actualizarTarea(Tarea tarea) {
        
    }
    
    public void actualizarUsuario(Usuario usuario) {
        
    }
    
    public void actualizarTareasDeUsuario(Usuario usuario, Tarea tareaBorrar) {
        
    }
    
    /* delete statement: */
    public void bajaTarea (Tarea tareaBaja) {
        
    }
    
    /**
     * @param usuarioBaja: usuario al que se seteará estado 
     * @@code Baja logica
     */
    public void bajaUsuario (Usuario usuarioBaja) {
        
    }
    
    // *********** END UPDATE/DELETE STATEMENTS ********************************************************
    
} // end class

