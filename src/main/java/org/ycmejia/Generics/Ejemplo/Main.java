package org.ycmejia.Generics.Ejemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes= new ArrayList<>();
        clientes.add(new Cliente("Camilo", "Mejia"));

        Cliente camilo=clientes.iterator().next();

        Cliente [] clientesArreglo={new Cliente("juan", "Lopez"), new Cliente("Orlay", "MOlina")};
        Integer[] enterosArreglo={1,2,3,4};

        //generando la primer lista;
        List<Cliente> clientesLista= fromArraytoList(clientesArreglo);
        List<Integer> enterosLista= fromArraytoList(enterosArreglo);

        System.out.println("Imprimiendo con forEach directo");
        clientesLista.forEach(System.out::println);


        System.out.println("mprimiendo usando un metodo definido");
        print(clientesLista);
        print(enterosLista);

    }

    //Convertir cualquier arreglo a una lista
    public static <T>List<T> fromArraytoList(T [] c){
        return Arrays.asList(c);
    }

    //metodo que imprime
    public static <T> void print(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
