package logica;

/**
 *
 * @author Joaquín Parrilla
 */

public class Usuario {
    
    private String nombreUsuario, password; // datos relacionados a la cuenta
    private String nombrePersona, apellidoPersona; // nombre y apellido reales
    private boolean tareasSuperpuestas;
    
    public Usuario() {  /* constructor para objetos vacios*/ }

    public Usuario(String nombreUsuario, String password, String nombrePersona, String apellidoPersona, boolean tareasSuperpuestas)
    {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.tareasSuperpuestas = tareasSuperpuestas;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNombrePersona () {
        return nombrePersona;
    }
    
    public void setNombrePersona (String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    public String getApellidoPersona () {
        return apellidoPersona;
    }
    
    public void setApellidoPersona (String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
    
    public boolean getTareasSuperpuestas () {
        return tareasSuperpuestas;
    }
    
    public void setTareasSuperpuestas (boolean tareasSuperpuestas) {
        this.tareasSuperpuestas = tareasSuperpuestas;
    }

    @Override
    public String toString() {
        String tareas;
        if (tareasSuperpuestas)
            tareas = "si";
        else
            tareas = "no";
        return "Usuario{" + "nombreUsuario= " + nombreUsuario 
                + ", password= " + password 
                + ", nombrePersona= " + nombrePersona 
                + ", apellidoPersona= " + apellidoPersona 
                + ", este usuario " + tareas + " permite tareas superpuestas }";
    }

}

