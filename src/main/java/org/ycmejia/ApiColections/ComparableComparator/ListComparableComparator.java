package org.ycmejia.ApiColections.ComparableComparator;

import org.ycmejia.ApiColections.Modelo.Estudiante;

import java.util.*;

public class ListComparableComparator {
    public static void main(String[] args) {

        List<Estudiante> estudiante= new ArrayList<>();
        estudiante.add(new Estudiante("Adriana", 0.4));
        estudiante.add(new Estudiante("Orlay", 3.5));
        estudiante.add(new Estudiante("Daniela", 2.2));
        estudiante.add(new Estudiante("Yovany", 1.8));
        estudiante.add(new Estudiante("Camilo", 4.8));
        estudiante.add(new Estudiante("Camilo", 4.8));
        estudiante.add(new Estudiante("Ramiro", 3.8));
        estudiante.add(new Estudiante("Pablo", 4.0));
        estudiante.add(new Estudiante("Santiago", 4.3));
        //vamos a ordenar
        Collections.sort(estudiante);//Primer forma
        System.out.println(estudiante);
        
        //Collections.sort(estudiante,(a,b)-> b.getNota().compareTo(a.getNota()));
        estudiante.sort((Comparator.comparing((Estudiante a)->a.getNota()).reversed() ));
        //otra forma
        estudiante.sort((Comparator.comparing(Estudiante::getNombre).reversed()));

        System.out.println(estudiante);
        
        System.out.println("\n Iterando usando STREAM");
        estudiante.forEach(System.out::println);
    }


}
