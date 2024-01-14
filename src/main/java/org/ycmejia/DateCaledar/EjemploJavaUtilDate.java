package org.ycmejia.DateCaledar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("La fecha es: "+ fecha);
        // lo podemos configurar de la siguiente manera
        SimpleDateFormat formatoSimple= new SimpleDateFormat( "dd MMMM,yyyy - HH:mm:ss z");
        String fechaStr=formatoSimple.format(fecha);
        //z=zona horaria
        System.out.println("El nuevo formato de la fecha es : "+ fechaStr);



    }
}
