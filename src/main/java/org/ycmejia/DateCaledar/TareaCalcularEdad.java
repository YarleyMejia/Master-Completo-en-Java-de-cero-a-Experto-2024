package org.ycmejia.DateCaledar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con el fisguiente formato: \"yyyy-MM-dd\"");
        try {
             Date fechaNacimiento = formato.parse(teclado.next());
            Date actual = new Date();
            LocalDate fechaNacimientoLocal = fechaNacimiento.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
            LocalDate actualLocal = actual.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

            Period periodo = Period.between(fechaNacimientoLocal, actualLocal);

            int edad = periodo.getYears();
            System.out.println("La edad es: " + edad);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
