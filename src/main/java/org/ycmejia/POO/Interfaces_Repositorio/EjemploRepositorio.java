package org.ycmejia.POO.Interfaces_Repositorio;

import org.ycmejia.POO.Interfaces_Repositorio.Modelo.Cliente;
import org.ycmejia.POO.Interfaces_Repositorio.Repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        CrudRepositorio repo= new ClienteListrepositorio();
        repo.crear(new Cliente("Juan", "Perez"));
        repo.crear(new Cliente("Camilo", "Mejia"));
        repo.crear(new Cliente("Andres", "Molina"));
        repo.crear(new Cliente("Yovany", "Ayala"));

        List<Cliente> clientes=repo.listarClientes();
        clientes.forEach(System.out::println);


        System.out.println("======PAGINABLE=====");

        List<Cliente> paginable=((PaginableRepositorio)repo).listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("=====ORDENABLE=====");

        List<Cliente> clienteordenAsc=((OrdebanableRepositorio)repo).listar("nombre", Direccion.ASC);
        for(Cliente c: clienteordenAsc){
            System.out.println(c);
        }

        System.out.println("=====EDITABLE=====");
        Cliente actualizar= new Cliente ("Jorge", "Perez");
        actualizar.setIdentificacion(2);
        repo.editar(actualizar);
        Cliente dos=repo.porId(2);
        System.out.println(dos);
        ((OrdebanableRepositorio)repo).listar("apellido",Direccion.ASC)
                        .forEach(System.out::println);

        System.out.println("=====ELIMIANR=====");
        repo.eliminar(2);
        repo.listarClientes().forEach(System.out::println);
    }
}
