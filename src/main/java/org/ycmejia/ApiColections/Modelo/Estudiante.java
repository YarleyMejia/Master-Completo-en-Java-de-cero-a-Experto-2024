package org.ycmejia.ApiColections.Modelo;

import java.util.Objects;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Estudiante a) {
        if(this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(a.nombre);
        /*if(this.nota == a.nota){
            return 0;
        }
        if(this.nota > a.nota){
            return 1;
        } else {
            return -1;
        }*/
        /*if(this.nota == null){
            return 0;
        }
        return this.nota.compareTo(a.nota);*/
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante Estudiante = (Estudiante) o;
        return Objects.equals(nombre, Estudiante.nombre) &&
                Objects.equals(nota, Estudiante.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }

    @Override
    public String toString() {
        return
                "NOMBRE=" + nombre  +
                ", NOTA=" + nota +
                '}';
    }
}