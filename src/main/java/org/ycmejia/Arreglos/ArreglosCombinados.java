package org.ycmejia.Arreglos;

public class ArreglosCombinados {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];
        for (int i=0; i<10; i++){
            a[i]= 1+i;
            b[i]= (1+i)*i;
        }

        int auxiliar=0;
        for (int i=0; i<10; i++){
            c[auxiliar++]=a[i];
            c[auxiliar++]=b[i];

        }


        for(int i=0;  i<c.length; i++){
            System.out.println("Numeros en la posicion: " +i+" + : "+c[i]);
        }
    }
}
