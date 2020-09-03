package test;

import java.text.SimpleDateFormat;
//import java.text.ParseException;
import java.util.Date; 
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import logica.*;

public class Test {
    
    private LocalDate fecha;
    
    
    public void prueba1() {
        //SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy"); 
        LocalDate ld = LocalDate.now();

        System.out.print(ld.getDayOfMonth() + "/");
        System.out.print(ld.getMonthValue() + "/");
        System.out.print(ld.getYear());
        // print: 26/8/2020 [ok]
        
        fecha = LocalDate.now();
        
        
        JOptionPane.showMessageDialog(null, fecha.toString(), "LocalDate", JOptionPane.PLAIN_MESSAGE);
        
    }
    
    public static void main(String[] args) {
        // prueba1(); -- no static!
        //pruebaObjetoTarea();
        
    }
    
    private static void pruebaObjetoTarea() {
        Tarea unaTarea = new Tarea();
        unaTarea.setId(1);
        unaTarea.setNombre("Hacer practico de ADA");
        unaTarea.setDescripcion("Practico 4 de diagramas Uml");
        unaTarea.setFechaInicio(new Fecha(3, 9, 2020));
        unaTarea.setFechaFin(new Fecha(4, 9, 2020));
        
        unaTarea.setPrioridad(unaTarea.getPrioridad().Alta);
        
        JOptionPane.showMessageDialog(null, unaTarea.toString(), "Información de la tarea creada", JOptionPane.PLAIN_MESSAGE);
    }
    
    
    
}
