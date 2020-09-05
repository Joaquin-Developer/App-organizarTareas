package logica;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author joaquin
 */
public class ListaTareas {
    
    private ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
    
    public ListaTareas() { /* empty cons. */ }
    
    /* ArrayList methods */

    public int size() {
        return listaTareas.size();
    }

    public boolean isEmpty() {
        return listaTareas.isEmpty();
    }

    public int indexOf(Object o) {
        return listaTareas.indexOf(o);
    }

    public boolean add(Tarea e) {
        return listaTareas.add(e);
    }

    public void add(int index, Tarea element) {
        listaTareas.add(index, element);
    }

    public Tarea remove(int index) {
        return listaTareas.remove(index);
    }

    public boolean equals(Object o) {
        return listaTareas.equals(o);
    }

    public boolean remove(Object o) {
        return listaTareas.remove(o);
    }

    public boolean removeAll(Collection<?> c) {
        return listaTareas.removeAll(c);
    }
    
    /* Specific ArrayList methods */
    
    public void recorrerLista() {
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea.toString());
        }
    }
    
    public Tarea obtenerPorNombre (String nombre) {
        Tarea tarea = new Tarea();
        for (Tarea t : listaTareas) {
            if (t.getNombre().equals(nombre)) {
                tarea = t;
                break;
            }
        }
        return tarea;
    }
    
    public Tarea obtenerPorId (int idTarea) {
        Tarea tarea = new Tarea();
        for (Tarea t : listaTareas) {
            if (t.getId() == idTarea) {
                tarea = t;
                break;
            }
        }
        return tarea;
    }
    
    public ListaTareas filtrarPorPrioridad (Tarea.prioridad tipoPrioridad) {
        ListaTareas lista = new ListaTareas();
        for (Tarea tarea : listaTareas) {
            if (tarea.getPrioridad().name().equals(tipoPrioridad.name()))
                lista.add(tarea);
        }
        return lista;
    }
    
    public ListaTareas filtrarPorFechaInicio (Fecha fechaInicio) {
        ListaTareas lista = new ListaTareas();
        for (Tarea tarea : listaTareas) {
            if (tarea.getFechaInicio().equals(fechaInicio))
                lista.add(tarea);
        }
        return lista;
    }
    
}
