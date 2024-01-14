package org.ycmejia.DateCaledar;

import java.util.Calendar;
import java.util.Date;

public class EjemploJavautilCalendar {
    public static void main(String[] args) {
        Calendar calendario= Calendar.getInstance();
       // calendario.set(2020,11,25) usado para mostrar una fecha predefinida;
        Date fecha=calendario.getTime();
        System.out.println("Calendario Creado: "+ fecha);
        //hh camiado en el formato, agrga formatos de 12 horas

    }

}
