package org.ycmejia.POO.proyectoFactura;

import org.ycmejia.POO.proyectoFactura.Modelo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        cliente.setNombre( "Yarley camilo Mejia");
        cliente.setNit("1044102024");

        Scanner teclado= new Scanner(System.in);
        String descripcion= "COMPRA DE VIVIVERES";
        Factura factura= new Factura(descripcion,cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i=0; i<5;i++){
            producto= new Producto();
            System.out.println("INGRESE EL PRODUCTO No."+producto.getCodigo()+": ");

            System.out.print("Ingrese el nombre del Producto: ");
            nombre= teclado.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio del producto: ");
            precio= teclado.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad de productos  adquiridos: ");
            cantidad= teclado.nextInt();

            ItemFactura item= new ItemFactura(producto,cantidad);
            factura.addItemFactura(item);

            System.out.println();
            teclado.nextLine();
        }
        System.out.println(factura.generarDetalleFactura());



    }

}
