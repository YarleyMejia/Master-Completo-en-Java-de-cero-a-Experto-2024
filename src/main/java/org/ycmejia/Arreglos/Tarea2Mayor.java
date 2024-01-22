package org.ycmejia.Arreglos;

public class Tarea2Mayor {

    //Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
    // por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
    public static void main(String[] args) {
        int i;
         int mayor=0;
        int numeros[]={14,14, 33, 15, 36, 78, 21, 43, 14};

         for(i=0; i< numeros.length; i++){
             if(numeros[i]>mayor){
                 mayor= numeros[i];
             }if(numeros[i]==mayor){
                 continue;
             }
         }
        System.out.println(" El numero mayor es: "+ mayor);

    }
}
