package org.ycmejia.Generics.Repositorio;


import org.ycmejia.Generics.Repositorio.modelo.Cliente;
import org.ycmejia.Generics.Repositorio.repositorio.TipoOrden;
import org.ycmejia.Generics.Repositorio.repositorio.OrdenablePaginableCrudRepositorio;
import org.ycmejia.Generics.Repositorio.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repo = (OrdenablePaginableCrudRepositorio<Cliente>) new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Pérez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andrés", "Guzmán"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Cliente> paginable = repo.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenAsc = repo.listar("apellido", TipoOrden.ASCENDENTE);
        for(Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println(" ============= ");
        repo.listar("nombre", TipoOrden.ASCENDENTE).forEach(System.out::println);
        System.out.println("===== eliminar ======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== total ===== ");
        System.out.println("Total registros: " + repo.total());
    }
}
