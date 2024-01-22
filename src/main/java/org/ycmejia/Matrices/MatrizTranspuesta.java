package org.ycmejia.Matrices;

public class MatrizTranspuesta {
    //Una Matriz traspuesta es aquella que es igual al intercambiar filas por columnas
    public static void main(String[] args) {
        int [][]matrizOriginal= {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };
        boolean simetrica = true;
        for (int i=0; i<matrizOriginal.length;i++){
            for (int j=0; j<i;j++){
                if(matrizOriginal[i][j]!=matrizOriginal[j][i]){
                    simetrica=false;
                    break;
                }
                }
            if(!simetrica){
                break;

            }

        }
        if(simetrica){
            System.out.println(" Es simetrica");
        }else{
            System.out.println("No es simetrica");
        }
    }
}
