package org.ycmejia.ApiColections.MetodosList;

import org.ycmejia.ApiColections.Modelo.Estudiante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Estudiante> estudiante = new ArrayList<>();
        System.out.println(" ESTA VACIA?  \n R/="+ estudiante.isEmpty());
        estudiante.add(new Estudiante("Adriana", 0.4));
        estudiante.add(new Estudiante("Orlay", 3.5));
        estudiante.add(new Estudiante("Daniela", 2.2));
        estudiante.add(new Estudiante("Yovany", 1.8));
        estudiante.add(new Estudiante("Camilo", 4.8));
        System.out.println(estudiante+ "\nSIZE = "+ estudiante.size());
        estudiante.remove(new Estudiante("Daniela",2.2));
        System.out.println(estudiante+ "\nSIZE = "+ estudiante.size());

        boolean b= estudiante.contains(new Estudiante("Camilo",4.8));
        System.out.println("La lista contiene a Camilo= "+ b);

        Object [] arreglo= estudiante.toArray();
        for(int i=0; i<arreglo.length;i++){
            System.out.println( arreglo [i]+"..");
        }
    }
}