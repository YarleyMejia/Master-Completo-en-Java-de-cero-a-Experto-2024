package org.ycmejia.Generics.BoundedGenerics;

import org.ycmejia.Generics.Ejemplo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Camilo", "Mejia"));

        Cliente camilo = clientes.iterator().next();

        Cliente[] clientesArreglo = {new org.ycmejia.Generics.Ejemplo.Cliente("juan", "Lopez"), new org.ycmejia.Generics.Ejemplo.Cliente("Orlay", "MOlina")};
        Integer[] enterosArreglo = {1, 2, 3, 4};

        //generando la primer lista;
        List<Cliente> clientesLista = fromArraytoList(clientesArreglo);
        List<Integer> enterosLista = fromArraytoList(enterosArreglo);

        List<ClientePremium> clientesPremiumList = fromArraytoList(new ClientePremium[]{new ClientePremium("Juan", "Fernandez")});
        clientesPremiumList.forEach(System.out::println);

        System.out.println("Aplicando comparable");
        System.out.println("MAximo de 1, 9, 4 Es: "+ maximo(1,9,4));
        System.out.println("Maximo de 3.9, 11.6,7.79 es: "+ maximo  (3.9,11.6, 7.79));
        System.out.println("Maximo  de zanahoria, arandanos y manzana es: "+ maximo("zanahoria", "arandanos", "manzana"));
    }

    //Convertir cualquier arreglo a una lista
    public static <T> List<T> fromArraytoList(T[] c) {
        return Arrays.asList(c);
    }

    // Solo funciona apra datos primitivos
    public static <T extends Number> List<T> fromArraytoList(T[] c) {
        return Arrays.asList(c);
    }

    // Solo funciona para la clase cliente y sus hijos
    public static <T extends Cliente> List<T> fromArraytoList(T[] c) {
        return Arrays.asList(c);
    }

    //Metodo que implementa adicionalmente interfaces

    /*public static <T extends Cliente & Comparable<T>>List<T> fromArraytoList(T [] c){
        return Arrays.asList(c);
    }*/


    //metodo que imprime
    public static <T> void print(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    //Metodo que imprime una clase y sus hijas
    public static void printClient(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);

    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}


