package org.ycmejia.POO.ClassAndObjects.Proyecto_OrdenDeCompra;

import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private  Producto[] productos;

    private static int ultimoId;
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this. identificador=++ultimoId;
        this.productos= new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProducto() {
        return productos;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        if(indiceProductos<this.productos.length){
            this.productos[indiceProductos++]=producto;
        }
    }

    public double getGranTotal(){
        double total=0;
        for(Producto p:productos){
            total+=p.getPrecio();
        }
        return total;
    }
}