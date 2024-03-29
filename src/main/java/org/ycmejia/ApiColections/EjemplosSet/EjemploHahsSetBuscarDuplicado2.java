package org.ycmejia.ApiColections.EjemplosSet;

import java.util.HashSet;
import java.util.Set;

public class EjemploHahsSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"Mojarra", "Trucha", "Bagre", "Tilapia", "Corvina", "Robalo", "Atun", "Mojarra"};
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) { // lo agrega, pero asi mismo valida que no sea un elemento duplicado del arreglo
                System.out.println("Se añade el elemento duplicado: " + pez);
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println(unicos.size()+ " Elementos unicos: "+ unicos);
        System.out.print("Elementos diplicados: "+ duplicados);
    }
}
