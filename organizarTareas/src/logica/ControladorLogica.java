package logica;
import persistencia.*;

/**
 * @author joaquin
 * This class implements Facade design pattern
 */

public class ControladorLogica {
    
    private static ControladorLogica instance;
    private ListaUsuarios listaUsuarios;
    
    private ControladorLogica() { /* empty const. */ }
    
    public static ControladorLogica getInstance() {
        if(instance == null)
            instance = new ControladorLogica();
        return instance;
    }
    
    public ListaUsuarios obtenerListaUsuarios() {
        ListaUsuarios lista = new ListaUsuarios();
        try {
            ConnectionDB cdb = ConnectionDB.getInstance();
            lista = cdb.obtenerUsuarios();
            if (lista.isEmpty())
                throw new Exception("Error: La lista de usuarios no contiene elementos");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        } finally {
            return lista;
        }
        /**
        ListaUsuarios lista = new ListaUsuarios();
        try {
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            return lista;
        }
         **/
    }
    
    public boolean login(String nombreUsuario, String passw) {
        /**
         * returns true if login is correct, else, returns f.
         */
        boolean loginCorrecto = false;
        try {
            ConnectionDB cdb = ConnectionDB.getInstance();  
            listaUsuarios = cdb.obtenerUsuarios();
            Usuario usr = listaUsuarios.obtenerPorNombre(nombreUsuario);
            
            if (usr.getNombreUsuario() == null)
                loginCorrecto = false;
            else if (! usr.getPassword().equals(passw))
                loginCorrecto = false;
            else
                loginCorrecto = true;
            
        } catch(Exception ex) {
            loginCorrecto = false;
            System.err.println(ex);
            System.err.println("Error: " + ex.getMessage());
        } finally {
            return loginCorrecto;
        }
        
    }
    
    public ListaTareas obtenerTareasPorUsuario (Usuario usuario) {
        ListaTareas listaTareas = new ListaTareas();
        try {
            ConnectionDB cdb = ConnectionDB.getInstance();
            listaTareas = cdb.obtenerTareasPorUsuario(usuario.getNombreUsuario());
            if (listaTareas.isEmpty()) {
                throw new Exception("Error: La lista de tareas no contiene elementos");
            }
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            return listaTareas;    
        }
    }
    
    
}
