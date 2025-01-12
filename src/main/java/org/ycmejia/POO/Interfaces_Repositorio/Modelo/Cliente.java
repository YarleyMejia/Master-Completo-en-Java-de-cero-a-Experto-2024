package org.ycmejia.POO.Interfaces_Repositorio.Modelo;

import java.util.Objects;

public class Cliente {
    private Integer identificacion;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Cliente() {
        this.identificacion=++ultimoId;
    }

    public Cliente( String nombre, String apellido) {
        this();//LLama al contructor que genera los ID de manera automatica.
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(identificacion, cliente.identificacion);
    }

}
