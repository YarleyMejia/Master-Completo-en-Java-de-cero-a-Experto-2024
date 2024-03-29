package org.ycmejia.Generics.Repositorio;


import org.ycmejia.Generics.Repositorio.modelo.Producto;
import org.ycmejia.Generics.Repositorio.repositorio.TipoOrden;
import org.ycmejia.Generics.Repositorio.repositorio.OrdenablePaginableCrudRepositorio;
import org.ycmejia.Generics.Repositorio.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = (OrdenablePaginableCrudRepositorio<Producto>) new ProductoListRepositorio();
        repo.crear(new Producto("mesa", 50.52));
        repo.crear(new Producto("silla", 18));
        repo.crear(new Producto("lampara", 15.5));
        repo.crear(new Producto("notebook", 400.89));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Producto> paginable = repo.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Producto> productosOrdenAsc = repo.listar("descripcion", TipoOrden.ASCENDENTE);
        for(Producto c: productosOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Producto lamparaActualizar = new Producto("lampara escritorio", 23);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.porId(3);
        System.out.println(lampara);
        System.out.println(" ============= ");
        repo.listar("precio", TipoOrden.ASCENDENTE).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== total ===== ");
        System.out.println("Total registros: " + repo.total());
    }
}
