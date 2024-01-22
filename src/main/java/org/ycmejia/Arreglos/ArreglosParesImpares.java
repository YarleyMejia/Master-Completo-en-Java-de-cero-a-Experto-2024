package org.ycmejia.Arreglos;

public class ArreglosParesImpares {
    public static void main(String[] args) {
        int []arreglo, pares, impares;
        int totalPares=0;
        int totalImpares=0;

        arreglo=new int[10];
        for(int i=0; i<10; i++){
            arreglo[i]=(i+1)*3;
            if(arreglo[i]%2==0){
                totalPares++;
            }else{
                totalImpares++;
            }
        }

        pares=new int[totalPares];
        impares=new int[totalImpares];
        int j=0;
        int k=0;
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]%2==0){
                pares[j++]=arreglo[i];
            }else{
                impares[k++]=arreglo[i];
            }
        }

        System.out.println("\nImprimiendo el arreglo original");
        for(int ar: arreglo){
            System.out.print(ar+"---");
        }

        System.out.println("\nImprimiendo el arreglo de pares");
        for(int par: pares){
            System.out.print(par+"---");
        }

        System.out.println("\nImprimiendo el arreglo impares");
        for(int imp: impares){
            System.out.print(imp+"---");
        }


    }
}
