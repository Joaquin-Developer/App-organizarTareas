package logica;
import persistencia.*;
//import logica.*;

/**
 * @author joaquin
 * This class implements Facade design pattern
 */

public class ControladorLogica {
    
    private static ControladorLogica instance;
    
    private ControladorLogica() {
        // add arrayLists...
    }
    
    public static ControladorLogica getInstance() {
        if(instance == null)
            instance = new ControladorLogica();
        return instance;
    }
    
    public ListaUsuarios obtenerListaUsuarios() {
        ListaUsuarios lista = new ListaUsuarios();
        try {
            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            return lista;
        }
    }
    
    public boolean login(String nombreUsuario, String passw) {
        /**
         * returns true if login is correct, else, returns f.
         */
        boolean loginCorrecto = false;
        try {
            ConnectionDB cdb = ConnectionDB.getInstance();    
            ListaUsuarios listaUsuarios = cdb.obtenerUsuarios();
            
            Usuario usr = listaUsuarios.obtenerPorNombre(nombreUsuario);
            
            if (usr.getNombreUsuario() == null) {
                loginCorrecto = false;
            } else if (usr.getPassword() != passw) {
                loginCorrecto = false;
            } else {
                loginCorrecto = true;
            }
            
        } catch(Exception ex) {
            loginCorrecto = false;
            System.err.println(ex);
            System.err.println("Error: " + ex.getMessage());
        } finally {
            return loginCorrecto;
        }
        
    }
    
}
