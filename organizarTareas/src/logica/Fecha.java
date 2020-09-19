package logica;

/**
 *
 * @author Joaquín Parrilla
 */

public class Fecha {
    
    private int dia, mes, anio;
    
    public Fecha() {
        // objeto por defecto
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
    
    public Fecha (int dia, int mes, int anio) {
        // luego de validar los parametros del objeto fecha (con la funcion de abajo)
        // se llama a este constructor para construir dicho objeto valga la redundancia :)
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public boolean validarFecha(int dia, int mes, int anio) {
        // Funcion que retorna true o false, si el objeto fecha que deseamos crear
        // es correcto o no
        
        boolean todoOk = true;
        
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1000) {
            todoOk = false;
        } else if (mes30dias(mes) && dia > 30 ) {
            todoOk = false;
        } else if (mes == 2 && dia > 29) {
            todoOk = false;
        }
        
        return todoOk;
    }

    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getMes() {
        return this.mes;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getAnio () {
        return this.anio;
    }
    
    public boolean mes30dias (int mes) {
        // funcion que determina si el mes indicado tiene 30 dias o no
        boolean pertenece = false;
        int [] arrayMeses = {4, 6, 9, 11};
        
        for (int i = 0; i <= arrayMeses.length; i++) {
            if (mes == arrayMeses[i]) {
                pertenece = true;
                break;
            }
        }
        return pertenece;
    }
    
    @Override
    public String toString() {
        return anio + "-" + mes + "-" + dia;
    }
    
}
