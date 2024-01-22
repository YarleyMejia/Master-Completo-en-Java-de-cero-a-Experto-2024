package org.ycmejia.Arreglos;

import java.util.Scanner;

public class ArreglosOrdenContinuo {

    public static void main(String[] args) {


        /// Eemplo no muy util pues solo mantiene el orden del arreglo en una posicion
        int arreglo[]= new int[7];
        int numero;
        int posicion;
        Scanner teclado= new Scanner(System.in);
        for (int i=0; i<arreglo.length-1;i++){
            System.out.println("Ingrese un numero: ");
            arreglo[i]= teclado.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese el numero a insertar: ");
        numero= teclado.nextInt();
        System.out.println("Ingrese la posicion: ");
        posicion= teclado.nextInt();

        while(posicion<arreglo.length-1&&numero>arreglo[posicion]) {
            posicion++;

        }

        for(int i=arreglo.length-2;i>=posicion;i--){
            arreglo[i+1]=arreglo[i];
        }
        arreglo[posicion]=numero;

        System.out.println("Arreglo ordenado!!!!!");
        for (int i=0;i<arreglo.length;i++){
            System.out.println("Indice "+i+"___"+arreglo[i]);
        }
    }

}
