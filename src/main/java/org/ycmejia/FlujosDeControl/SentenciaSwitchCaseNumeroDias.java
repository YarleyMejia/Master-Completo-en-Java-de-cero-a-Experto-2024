package org.ycmejia.FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwitchCaseNumeroDias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Ingrese el numero del mes (es decir del 1 al 12");
        int mes = teclado.nextInt();
        int numeroDias = 0;
        System.out.println("Ingrese el numero del año (YYYY): ");
        int anio=teclado.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias=31;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias=30;
                break;
            case 2:
                if((anio%400)==0||((anio%4==0)&& !(anio%100==0))){
                    numeroDias=29;
                }else{
                    numeroDias=28;
                }
                break;
            default:
                System.out.println("¡ERROE EN LOS DATOS INGRESADOS!!!!!!-");

        }
        System.out.println( "numero de  dias del mes "+ mes+ " Es: "+ numeroDias);




    }


}
