package org.ycmejia.Arreglos;

public class NumeroMayorArreglo {
    public static void main(String[] args) {

        int[] a;
        a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = 1 + (i * 3);
        }
        int max=0;
        for(int i=0; i<a.length;i++){
            max=(a[max]>a[i])?max:i;
        }
        System.out.println("MAX: "+a[max]);
    }
}

