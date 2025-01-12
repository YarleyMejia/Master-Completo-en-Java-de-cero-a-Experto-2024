package org.ycmejia.POO.Interfaces_Repositorio.Repositorio;

import org.ycmejia.POO.Interfaces_Repositorio.Modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListrepositorio implements CrudRepositorio,
        OrdebanableRepositorio, PaginableRepositorio {

    private List<Cliente>dataSource;

    public ClienteListrepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listarClientes() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer identificacion) {
        Cliente resultado=null;
        for(Cliente cli:dataSource){
            if(cli.getIdentificacion()!=null &&cli.equals(identificacion)){
                resultado=cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);

    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cEditable=this.porId(cliente.getIdentificacion());
        cEditable.setNombre(cliente.getNombre());
        cEditable.setApellido(cliente.getApellido());
    }
    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    switch (campo) {
                        case "id" -> resultado = a.getIdentificacion().compareTo(b.getIdentificacion());
                        case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                    }
                } else if (dir == Direccion.DES) {
                    switch (campo) {
                        case "id" -> resultado = b.getIdentificacion().compareTo(a.getIdentificacion());
                        case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                    }

                }
                return resultado;
            }
        });
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }
}
