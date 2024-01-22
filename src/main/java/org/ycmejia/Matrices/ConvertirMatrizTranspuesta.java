package org.ycmejia.Matrices;

public class ConvertirMatrizTranspuesta {
    public static void main(String[] args) {
        int[][] matrizOriginal = {
                {3, 12, 3, 4},
                {2, 1, 15, 5},
                {25, 0, 1, 45},
                {8, 5, 6, 7}
        };

        int auxiliar;
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < i; j++) {
                auxiliar=matrizOriginal[i][j];
                matrizOriginal[i][j]=matrizOriginal[j][i];
                matrizOriginal[j][i] = auxiliar;
            }
        }
        System.out.println("La matriz transupuesta es: ");
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                System.out.print(matrizOriginal [i][j]+"\t");
            }
            System.out.println();
        }
    }
}
