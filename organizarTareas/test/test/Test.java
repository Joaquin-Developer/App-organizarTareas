package test;

import java.text.SimpleDateFormat;
//import java.text.ParseException;
import java.util.Date; 
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import javax.swing.JOptionPane;

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
        
        //prueba1();
        
    }
    
}
