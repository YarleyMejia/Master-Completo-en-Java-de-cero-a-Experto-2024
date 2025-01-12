package org.ycmejia.POO.Interfaces.imprenta;

import org.ycmejia.POO.Interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv= new Curriculo(new Persona("Camilo", "Mejia"),"Ing. Sistemas","Resumen Laboral:");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle");
        cv.addExperiencia(("Spring Framework"));
        cv.addExperiencia("Desarrollador FullStack");
        cv.addExperiencia("Angular");

        Libro libro= new Libro(new Persona("Jhon", "mathew"),"InterStellar", Genero.CIENCIA);
        libro.addPagina(new Pagina("Pelicula de Accion"))
                .addPagina(new Pagina("Viaje a Jupiter"))
                .addPagina(new Pagina("Viaje al agujero Negro"))
                .addPagina(new Pagina("Viaje a la nueva Galaxia"));

        Informe informe= new Informe(new Persona("Jose", "Gonzalez"),
                new Persona("Jose", "Diaz"),"Estudio sobre Microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
