package org.ycmejia.Arreglos;

import java.util.Scanner;

public class ArregloNotas {
    public static void main(String[] args) {
        int totalMatematicas=0;
        int totalHistoria=0;
        int totalLengueje=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int totalEstuandiantes= teclado.nextInt();
        double[]matematicas, historia, lenguaje;
        matematicas=new double[totalEstuandiantes];
        historia=new double[totalEstuandiantes];
        lenguaje= new double[totalEstuandiantes];
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Ingrese 7 notas para matematicas: ");
        for(int i=0; i<totalEstuandiantes; i++){
            matematicas[i]= teclado.nextDouble();
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Ingrese 7 notas para Historia: ");
        for(int i=0; i<totalEstuandiantes; i++){
            historia[i]= teclado.nextDouble();
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Ingrese 7 notas para lenguaje: ");
        for(int i=0; i<totalEstuandiantes; i++){
            lenguaje[i]= teclado.nextDouble();
        }

        for(int i=0;i<totalEstuandiantes;i++){
            totalLengueje+=lenguaje[i];
            totalHistoria+=historia[i];
            totalMatematicas+=matematicas[i];
        }
        System.out.println();
        System.out.println("El promediio de las notas es:" +
                "\nMatematicas: "+totalMatematicas/totalEstuandiantes+
                "\nHistoria: "+totalHistoria/totalEstuandiantes+
                "\nLenguaje: "+totalLengueje/totalEstuandiantes);


    }
}
