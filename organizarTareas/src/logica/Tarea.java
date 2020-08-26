package logica;

import java.sql.Time;

/**
 *
 * @author joaquin
 */
public class Tarea {
    
    private Time fechaInicio;
    private Time fechaFin;
    //private
    private String nombre;
    private String descripcion;
    private int id;
    
    public Tarea(){
    }

    public Tarea(Time fechaInicio, Time fechaFin, String nombre, String descripcion, int id) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }
    
    
    
}
