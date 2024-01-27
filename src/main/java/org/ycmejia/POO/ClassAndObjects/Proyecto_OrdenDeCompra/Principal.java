package org.ycmejia.POO.ClassAndObjects.Proyecto_OrdenDeCompra;

import java.sql.SQLOutput;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        OrdenCompra orden1= new OrdenCompra("Compra de celulares");
        orden1.setCliente(new Cliente("Yarley","Mejia"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("APPLE", "Iphone 15", 1200));
        orden1.addProducto(new Producto("Motorola", "E}dge 30", 1000));
        orden1.addProducto(new Producto("Samsung", "Galaxy S21 ultra", 1110));
        orden1.addProducto(new Producto("Google", "Pixel 4", 990));

        OrdenCompra orden2= new OrdenCompra("Compra de vehiculos");
        orden2.setCliente(new Cliente("Camilo","Bedoya"));
        orden2.setFecha(new Date());

        orden2.addProducto(new Producto("Toyota", "Corolla", 27850));
        orden2.addProducto(new Producto("Renault", "Logan", 15000));
        orden2.addProducto(new Producto("Chevrolet", "Spark Gt", 12650));
        orden2.addProducto(new Producto("Nissan", "Versa", 19654));

        OrdenCompra orden3= new OrdenCompra("Compra de Morrrales");
        orden3.setCliente(new Cliente("Orlay","Molina"));
        orden3.setFecha(new Date());

        orden3.addProducto(new Producto("Totto", "AIR FOX MAX", 100));
        orden3.addProducto(new Producto("Arturo Calle", "Morral Ejecutivo", 150));
        orden3.addProducto(new Producto("Velez", "Colegio Ultra", 120));
        orden3.addProducto(new Producto("Lugano", "Adventure", 105));


        OrdenCompra[]ordenes={ orden1, orden2, orden3};

        for(OrdenCompra orden:  ordenes){
            System.out.println(" Folio: "+ orden.getIdentificador());
            System.out.println("Cliente: "+ orden.getCliente());
            System.out.println("Descripcion: "+ orden.getDescripcion());
            System.out.println("Fecha: "+ orden.getFecha());
            System.out.println("TOTAL COMPRA: "+ orden.getGranTotal());


            int i=1;
            for(Producto p: orden.getProducto()){
                System.out.println("Producto "+ i+": "+ p.getFabricante()+ " "+ p.getNombre()+ " "+
                       "Precio: $"+p.getPrecio() );
                i++;
            }
            System.out.println("-----------------SIGUIENTE PRODUCTO----------------");
        }
    }
}
