package org.ycmejia.Arreglos;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int [] numeros=new int[5];
        numeros[0]=1;
        numeros[1]=24;
        numeros[2]=33;
        numeros[3]=14;
        numeros[4]=-12;
        int contador=0; //Para saber cuantas validaciones hace el metodo bubuja

        //METODO BUBUJA
        for(int i=0; i<numeros.length-1;i++){

            for(int j=0; j<numeros.length-1-i;j++){ // Hacer esto j<numeros.length-1-i reduce el numero de compraciones, haciendo el metodo bubuja mas eficiente y evitar validar el final del arreglo
                if(((Integer) numeros[j+1]).compareTo(numeros[j])<0){// se debe castar por el que compareto solo recibe enteros, si se va a usar de manera generica en un objeto, se una en le funcion Object [] y casteamos a (Comparable)
                    int auxiliar=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=auxiliar;
                }
                contador++;
            }
        }

        for(int num:numeros){
            System.out.println("Numero:"+num);
        }
        System.out.println("Iteracciones totales: "+ contador);
    }
}
