package org.ycmejia.FlujosDeControl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tarea2 {
    //Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
    // Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
    // ademas mostrar el promedio total.
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double notasFinales[]= new double[20];
        double sumaNotas5=0;
        int cantidadNotas5=5;

        double sumaNotas4=0;
        int cantidadNotas4=0;

        int cantidadNota1=0;
        double sumanotas1=0;

        for(int i=0;i<20; i++){
            System.out.println("Ingrese la nota final del estudiante No."+(i+1)+": ");
            notasFinales[i]= teclado.nextDouble();
            if(notasFinales[i]>=5){
                sumaNotas5+=notasFinales[i];
                cantidadNotas5++;
            }
            if(notasFinales[i]<=4){
                sumaNotas4+=notasFinales[i];
                cantidadNotas4++;
            }
            if (notasFinales[i]<=1){
                cantidadNota1++;
                sumanotas1+=notasFinales[i];
            }
            if(notasFinales[i]==0){
                System.out.println("error finalizando el programa");
                break;
            }
        }
        System.out.println();
        System.out.println("El promedio de notas mayores a 5.0 es: "+ (sumaNotas5/cantidadNotas5));
        System.out.println("\nEl promedio de notas menores o iguales a 4.0 es: "+ (sumaNotas4/cantidadNotas4));
        System.out.println("El promedio total de notas finales es: "+ (sumaNotas4+sumaNotas5+sumanotas1)/notasFinales.length);
        System.out.println("\nLa cantidad de estudiantes con notas de 1.0 es: "+cantidadNota1);

    }
}
