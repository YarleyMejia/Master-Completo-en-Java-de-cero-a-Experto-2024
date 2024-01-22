package org.ycmejia.Arreglos;

import java.util.Scanner;

public class Tarea1Orden {

    //Leer 10 números enteros desde el teclado para llenar un
    // arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden:
    // el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println(" Ingrese el tamaño del arreglo: ");
        int tamano= teclado.nextInt();
        int [] numeros= new int[tamano];

        for(int i=0; i<tamano; i++){
            System.out.println( "Ingrese el "+ (i+1)+ " nomero: ");
            numeros[i]= teclado.nextInt();
        }

        System.out.println("El resultado es:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(numeros[9 - i]); // y el i-ésimo por el final
            System.out.println(numeros[i]); // mostramos el i-ésimo número por el principio
        }


    }
}
