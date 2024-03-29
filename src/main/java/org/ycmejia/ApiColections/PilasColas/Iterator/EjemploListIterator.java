package org.ycmejia.ApiColections.PilasColas.Iterator;

import org.ycmejia.ApiColections.Modelo.Estudiante;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploListIterator {
    public static void main(String[] args) {

        LinkedList<Estudiante> enlazada = new LinkedList<>();
        enlazada.add(new Estudiante("Adriana", 0.4));
        enlazada.add(new Estudiante("Orlay", 3.5));
        enlazada.add(new Estudiante("Daniela", 2.2));
        enlazada.add(new Estudiante("Yovany", 1.8));
        enlazada.add(new Estudiante("Camilo", 4.8));
        /*
        enlazada.remove(new Estudiante("Daniela", 2.2));
        //agregar Primero
        enlazada.addFirst(new Estudiante("Pedro", 5));
        //agregarPrimero
        enlazada.addLast(new Estudiante("MAycol",4.1));
        //Obtener el primero
        enlazada.getFirst();
        //Obtener el Ultimo
        enlazada.getLast();
        //Eliminar Primero
        enlazada.removeFirst();
        //Eliminar Ultimo
        enlazada.removeLast();
        //Buscar
        enlazada.indexOf(new Estudiante());//Pendiente completar
        //puedo remover por el indice
        enlazada.set(4, new Estudiante());//Falta completar, siver para reemplazar.
*/

        ListIterator<Estudiante> lista= enlazada.listIterator();
        while(lista.hasNext()){
            System.out.println(lista.next());
        }
        System.out.println("=====================PREVIUS");
        // Imprimir alrevez
        while(lista.hasPrevious()){
            Estudiante estudiante= lista.previous();
            System.out.println(estudiante);
        }


    }

}
