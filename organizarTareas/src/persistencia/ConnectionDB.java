package persistencia;
import java.sql.*;
import logica.*;

/**
 *
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
    
}

