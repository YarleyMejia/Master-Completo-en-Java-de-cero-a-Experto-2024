package org.ycmejia.Arreglos;

import java.util.Scanner;

public class ArreglosDesplazamiento2 {
    public static void main(String[] args) {
        int arreglo[]= new int[10];
        int elemento;
        int posicion;
        Scanner teclado= new Scanner(System.in);
        for (int i=0; i<arreglo.length-1;i++){
            System.out.println("Ingrese un numero: ");
            arreglo[i]= teclado.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento: ");
         elemento=teclado.nextInt();
        System.out.println("Posicion donde desea Agregar el elemento: ");
         posicion= teclado.nextInt();


        for(int i= arreglo.length-2; i>=posicion;i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[posicion]=elemento;
        System.out.println("El arreglo final es: ");
        for(int i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }

}

