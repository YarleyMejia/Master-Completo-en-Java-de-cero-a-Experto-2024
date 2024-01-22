package org.ycmejia.Arreglos;

import java.util.Scanner;

public class ArreglosDesplazamiento {
    public static void main(String[] args) {
        int arreglo[]= new int[10];
        int ultimo;
        Scanner teclado= new Scanner(System.in);
        for (int i=0; i<arreglo.length;i++){
            System.out.println("Ingrese un numero: ");
            arreglo[i]= teclado.nextInt();
        }
        System.out.println();
        ultimo=arreglo[arreglo.length-1];
        for(int i= arreglo.length-2; i>=0;i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0]=ultimo;
        System.out.println("El arreglo final es: ");
        for(int i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
        }

    }


