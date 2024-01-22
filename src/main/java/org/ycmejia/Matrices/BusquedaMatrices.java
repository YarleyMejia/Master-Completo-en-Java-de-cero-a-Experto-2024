package org.ycmejia.Matrices;

public class BusquedaMatrices {

    public static void main(String[] args) {


        int[][] matriz = {
                {12, 25, 24, 26, 13, 104},
                {1, 2, 32, 35, 36, 37, 25, 96, 85},
                {21, 23, 27, 85, 74, 77, 73, 72, 71},
                {54, 46, 78, 42, 39, 67, 78, 93}
        };


        int numeroBuscar = 0;
        boolean encontrado = false;
        int i=0;
        int j=0;
        buscar: for ( i = 0; i < matriz.length; i++) {
            for ( j = 0; j < matriz[i].length; j++) {
                if(numeroBuscar==matriz[i][j]){
                    encontrado=true;
                     break buscar;
                }

            }
        }
        if(encontrado){
            System.out.println("Numero encontrado en la posicicion ;"+i+" "+j);
        }else {
            System.out.println(" numero no encontrado");
        }
    }
}