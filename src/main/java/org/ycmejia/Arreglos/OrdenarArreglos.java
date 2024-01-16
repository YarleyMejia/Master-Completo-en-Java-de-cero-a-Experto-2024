package org.ycmejia.Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class OrdenarArreglos {
    public static void main(String[] args) {
        String [] productos= new String [6];
        productos[0]="Motorola a54";
        productos[1]="Carro Mazda";
        productos[2]="Nintendo 5";
        productos[3]="Bicicleta Specilized";
        productos[4]="Camara Canon";
        productos[5]="Pixel one";

        //Metodo para ordenar entenros y alafabeticamente.
        Arrays.sort(productos);

        //Metodo para convertir un arreglo en una lista
        // reverse hace lo contrario de Sort
        Collections.reverse(Arrays.asList(productos));

        for(String i: productos){
            System.out.println("Producto: "+ i);
        }


    }
}
