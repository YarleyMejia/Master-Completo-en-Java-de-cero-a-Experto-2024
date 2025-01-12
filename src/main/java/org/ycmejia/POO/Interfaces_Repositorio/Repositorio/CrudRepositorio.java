package org.ycmejia.POO.Interfaces_Repositorio.Repositorio;

import org.ycmejia.POO.Interfaces_Repositorio.Modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listarClientes();

    Cliente porId(Integer identificacion); // obtiene los clientes por ID.
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);


}
