package org.ycmejia.Arreglos;

import java.util.Scanner;

public class ProgramaImprimirMasOcurrencias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        // creamos un segundo arreglo llamado arregloCantidadValores (de igual largo)
        // para guardar las cantidades de veces que se repite cada elemento 
        // del arreglo principal
        int[] arregloCantidadValores = new int[10];
        // luego llenamos este segundo arreglo con las cantidades de ocurrencia
        // de los elementos del primer arreglo
        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    cantidad++;
                }
            }
            arregloCantidadValores[i] = cantidad;
        }

        // luego obtenemos el valor de la mayor ocurrencia (mas veces repetido)
        // y el indice o pocicion para obtener el numero mas repetido
        int indice = 0; // indice del elemento con la mayor ocurrencia (mas repetido)
        int max = 0; // la cantidad mayor de veces (la mayor ocurrencia)
        for (int i = 0; i < 10; i++) {
            if (max <=arregloCantidadValores[i]) { // con solo < hace menos interacciones
                max = arregloCantidadValores[i];
                System.out.println("Max: "+ max);
                indice = i;
                //System.out.println("indice+ "+indice);
            }
        }
        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + arreglo[indice]);
        System.out.println("el elemento " + arreglo[indice] + " esta repetido " + max + "veces!");
    }
}