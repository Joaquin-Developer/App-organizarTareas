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
        ResultSet result = st.executeQuery("");
        while (result.next()) {
            Usuario usuario = new Usuario();
            // completar segun el nombre del campo en la BD
            
            usuario.setNombreUsuario(result.getString("nombre")); 
            usuario.setPassword(result.getString("password"));
            lista.add(usuario);
        }       
        con.close();
        return lista;
    }

}

