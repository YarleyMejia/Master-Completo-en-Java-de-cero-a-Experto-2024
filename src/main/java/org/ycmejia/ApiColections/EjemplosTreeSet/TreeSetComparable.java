package org.ycmejia.ApiColections.EjemplosTreeSet;

import org.ycmejia.ApiColections.Modelo.Estudiante;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparable {
    public static void main(String[] args) {
    // Como es un objeto, se debe de manejar diferente para que implemente la interfaz COMPARABLE
        Set<Estudiante> setAlumno= new TreeSet<>(Comparator.reverseOrder());// Por defecto lo hace con el nombre, si deseo que sea por la la nota uso
        //Set<Estudiante> setAlumno= new TreeSet<>((a,b)->b.getNota().compareTo(a.getNota()));

        setAlumno.add(new Estudiante("Adriana", 0.4));
        setAlumno.add(new Estudiante("Orlay", 3.5));
        setAlumno.add(new Estudiante("Daniela", 2.2));
        setAlumno.add(new Estudiante("Yovany", 1.8));
        setAlumno.add(new Estudiante("Camilo", 4.8));
        System.out.println(setAlumno);
    }
}
