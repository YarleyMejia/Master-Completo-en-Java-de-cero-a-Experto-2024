package org.ycmejia.Arreglos;

import java.util.Scanner;

public class DetectarOrdenArreglos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int []arreglo=new int[7];

        for(int i=0;i< arreglo.length;i++){
            System.out.println("Ingrese el "+ (i+1)+ "Numero: ");
            arreglo[i]= teclado.nextInt();
        }
        boolean ascendente=false;
        boolean descendente=false;
        for (int i=0; i< arreglo.length-1;i++){
            if(arreglo[i]>arreglo[i+1]){
                descendente=true;
            }
            if(arreglo[i]<arreglo[i+1]){
                ascendente=true;
            }
        }
        if (ascendente==true&&descendente==true){
            System.out.println(" ARREGLO DESORDENADO");
        }
        if (ascendente==false&&descendente==false){
            System.out.println("TODOS SON IGUALES");
        }
        if (ascendente==false&&descendente==true){
            System.out.println(" ARREGLO DESENDENTE");
        }
        if (ascendente==true&&descendente==false){
            System.out.println(" ARREGLO ASCENDENTE");
        }
    }
}
