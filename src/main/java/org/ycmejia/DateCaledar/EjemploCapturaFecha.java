package org.ycmejia.DateCaledar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploCapturaFecha {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con el fisguiente formato: \"yyyy-MM-dd\"");
        try{
            Date fecha=formato.parse(teclado.next());
            System.out.println("FECHA: "+ fecha);
            System.out.println("Formato: "+ formato.format(fecha));
        } catch(ParseException e){
            e.printStackTrace();
        }

    }

}
