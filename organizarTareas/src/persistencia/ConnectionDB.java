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
    
    public void obtenerUsuarios(){
        
    }
    
    

}

/**
 * public Alumnos getAlumnos() throws Exception {
 Alumnos alumnos = new Alumnos();
 Connection conn = getConnection();
 Statement st = conn.createStatement();
 ResultSet resultado = st.executeQuery("select * from alumno");
 while (resultado.next()) {
 Alumno a = new Alumno();
 a.setCedula(resultado.getString("cedula"));
 a.setAnio(resultado.getInt("anio"));
 a.setCuotaColegio(resultado.getDouble("cuotaColegio"));
 alumnos.insertar(a);
 }
 conn.close();
 return alumnos;
 }
 */


