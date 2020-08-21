package persistencia;
import java.sql.*;

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
    
    /**
     *  Add specific methods . . .
     */

}
