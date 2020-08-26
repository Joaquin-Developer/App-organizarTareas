package logica;

//import java.text.SimpleDateFormat;
//import java.text.ParseException;
//import java.util.Date; 
import java.time.LocalDate;

/**
 *
 * @author joaquin
 */
public class PruebaObjetos {
    
    public static void main(String[] args) {
        //SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy"); 
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.print(ld.getDayOfMonth() + "/");
        System.out.print(ld.getMonthValue() + "/");
        System.out.print(ld.getYear());
        // print: 26/8/2020 [ok]
    }
    
}
