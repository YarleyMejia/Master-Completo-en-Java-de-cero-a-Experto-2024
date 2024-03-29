package org.ycmejia.ApiColections.EjemplosSet;

import java.util.HashSet;
import java.util.Set;

public class EjemploHahsSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Mojarra", "Trucha", "Bagre", "Tilapia", "Corvina", "Robalo", "Atun", "Mojarra"};
        Set<String> unicos = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) { // lo agrega, pero asi mismo valida que no sea un elemento duplicado del arreglo
                System.out.println("Elemento duplicado: " + pez);
            }
        }
        System.out.println(unicos.size()+ " Elementos No duplicados: "+ unicos);
    }
}
