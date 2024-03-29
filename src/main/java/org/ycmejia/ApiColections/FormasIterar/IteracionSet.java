package org.ycmejia.ApiColections.FormasIterar;

import org.ycmejia.ApiColections.Modelo.Estudiante;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteracionSet {
    public static void main(String[] args) {
        // sirve para hashSet y TreeSet, mejor dicho toda la clase SET


       Set<Estudiante> setAlumno= new TreeSet<>();

        setAlumno.add(new Estudiante("Adriana", 0.4));
        setAlumno.add(new Estudiante("Orlay", 3.5));
        setAlumno.add(new Estudiante("Daniela", 2.2));
        setAlumno.add(new Estudiante("Yovany", 1.8));
        setAlumno.add(new Estudiante("Camilo", 4.8));
        System.out.println(setAlumno);

        System.out.println("Iterando usando FOREACH");
        for(Estudiante estudiante: setAlumno ){
            System.out.println(estudiante);
        }

        System.out.println("\nIterando usando while y iterator");
        Iterator <Estudiante> i= setAlumno.iterator();
        while( i.hasNext()){
            Estudiante estudiante= i.next();
            System.out.println(estudiante);
        }

        System.out.println("\nIterando usando STREAM y forEach");
        setAlumno.forEach(System.out::println);

        System.out.println("\nImprimiendo un solo dato");
        setAlumno.forEach(a-> System.out.println(a.getNombre()));

    }
}
