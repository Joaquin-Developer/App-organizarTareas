package logica;

import java.util.ArrayList;

/**
 *
 * @author joaquin
 */

public class ListaUsuarios {
    
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    
    public ListaUsuarios() {
        
    }

    /* ArrayList methods */
    
    public int size() {
        return listaUsuarios.size();
    }

    public boolean isEmpty() {
        return listaUsuarios.isEmpty();
    }

    public boolean add(Usuario e) {
        return listaUsuarios.add(e);
    }

    public void add(int index, Usuario element) {
        listaUsuarios.add(index, element);
    }

    public Usuario remove(int index) {
        return listaUsuarios.remove(index);
    }

    public boolean remove(Object o) {
        return listaUsuarios.remove(o);
    }
    
    /* Specific ArrayList methods */
    
    public boolean existe(String nombreUsuario) {
        boolean existe = false;
        for (Usuario u : listaUsuarios) {
            if (u.getNombreUsuario().equals(nombreUsuario)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public Usuario obtenerPorNombre(String nombreUsuario) {
        Usuario encontrado = new Usuario();
        for (Usuario u : listaUsuarios) {
            if (u.getNombreUsuario().equals(nombreUsuario)) {
                encontrado = u;
                break;
            }
        }
        return encontrado;
    }
    
    
}
