package org.ycmejia.DateCaledar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploCompararFechas {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con el fisguiente formato: \"yyyy-MM-dd\"");
        try{
            Date fecha=formato.parse(teclado.next());
            System.out.println("FECHA: "+ fecha);
            System.out.println("Formato: "+ formato.format(fecha));
            Date fecha2=new Date();
            System.out.println("FECHA 2:"+fecha);
            if(fecha.after(fecha2)){
                System.out.println("La fecha del usuario es: "+ fecha+ " por que es despues de la fecha Actual: "+ fecha2);
            }else if(fecha.before(fecha2)){
                System.out.println("La fecha del usuario es: " + fecha + " por que es anterior de la fecha Actual: " + fecha2);
            }else if (fecha.equals(fecha2)) {
                System.out.println("Las fechas son lñas mismas");
            }

        } catch(ParseException e){
            e.printStackTrace();
        }

    }
}
