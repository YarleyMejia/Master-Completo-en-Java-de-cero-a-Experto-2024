package org.ycmejia.Arreglos;

public class ordenPricipioFinal {
    public static void main(String[] args) {
        int [] numeros= new int[10];
        int []a= new int[10];

        for (int i=0;i< numeros.length;i++){
            numeros[i]=i+1;
        }


        int auxiliar=0;
        for(int i=0;i< numeros.length-i; i++){ //otra opcion es umeros.length-i
            //System.out.println(numeros[i]);
            //System.out.println( numeros[numeros.length-1-i]);
            a[auxiliar++]=numeros[i];
            a[auxiliar++]=numeros[numeros.length-1-i];

        }
        for(int i=0;i<a.length;i++){
            System.out.println("i= "+i+ " Valor: "+ a[i]);
        }
    }
}
