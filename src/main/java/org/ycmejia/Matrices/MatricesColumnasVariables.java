package org.ycmejia.Matrices;

public class MatricesColumnasVariables {
    public static void main(String[] args) {

        // Vamos a asignar a cada fila un cantidad de columnnas diferentes
        int matriz [][]= new int[3][];
        matriz[0]= new int[4];// Estoy diciendo que la mmatriz en la fila 0 va a tener 4 columnas
        matriz[1]= new int[3];
        matriz[2]= new int[6];

        System.out.println("Tamaño de la matriz: "+ matriz.length);
        System.out.println(" Fila 0 length: "+ matriz[0].length);
        System.out.println(" Fila 1 length: "+ matriz[1].length);
        System.out.println(" Fila 2 length: "+ matriz[2].length);
        System.out.println();
        for(int i=0; i< matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i * j) + 1;
            }
        }
        System.out.println();
        for(int i=0; i< matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
