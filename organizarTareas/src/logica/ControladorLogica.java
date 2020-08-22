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
    
    public void obtenerListaUsuarios() {
        
    }
    
    public boolean login(String nombreUsuario, String passw) {
        /**
         * returns true if login is correct, else, returns f.
         */
        
        
        return true;
    }
    
}
