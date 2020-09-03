package logica;

import java.sql.Time;

/**
 * @author joaquin
 */
public class Tarea {
    
    private int id;
    private String nombre;
    private String descripcion;
    private Fecha fechaInicio;
    //private Time fechaInicio;
    //private Time fechaFin;
    private Fecha fechaFin;
    private prioridad prioridad;
    
    public enum prioridad {
        Alta, Baja, Normal  
    };
    
    public Tarea(){
    }

    public Tarea(Fecha fechaInicio, Fecha fechaFin, String nombre, String descripcion, int id) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public prioridad getPrioridad() {
        return prioridad;
    }
    
    public void setPrioridad(prioridad p) {
        this.prioridad = p;
    }
    
    @Override
    public String toString () {
        return "Tarea: " + nombre + "\n"
                + "Fecha inicio: " + fechaInicio.toString() + "\n"
                + "Fecha fin: " + fechaFin.toString() + "\n"
                + "Breve descripcion: " + descripcion + "\n"
                + "Esta tarea tiene una prioridad " + prioridad.name();
    }
    
}
