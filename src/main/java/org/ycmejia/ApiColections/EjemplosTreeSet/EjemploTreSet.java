package org.ycmejia.ApiColections.EjemplosTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreSet {
    //Es una Lista Ordenada
    //No se puede cualquier objeto, si o si debe de implementar la interfaz comparable
    public static void main(String[] args) {
        Set<String> ts= new TreeSet<>();//costo de rendimiento mayor, son mas rapidos los hashSet
        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Tres");
        ts.add("Cuatro");
        ts.add("Cinco");
        System.out.println("ts: "+ts);//Ordena alfabeticamente


        Set<Integer> numeros= new TreeSet<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(7);
        numeros.add(12);
        numeros.add(3);
        System.out.println("NUMEROS: "+numeros);

        System.out.println();
        System.out.println("EJEMPLO USANDO COMPARATOR DE MANERA DESCENDENTE");
        Set<String> ts2= new TreeSet<>((a,b)->{ //
            // LO PUEDO REEMPLAZAR POR :  Set<String> ts2= new TreeSet<>(Comparator.reverseOrder());
            return b.compareTo(a);//ordenando de forma descendente
        });
        ts2.add("Uno");
        ts2.add("Dos");
        ts2.add("Tres");
        ts2.add("Tres");
        ts2.add("Cuatro");
        ts2.add("Cinco");
        System.out.println("ts: "+ts2);//Ordena alfabeticamente

    }
}
