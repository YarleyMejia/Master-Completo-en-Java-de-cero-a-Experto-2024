package org.ycmejia.POO.Interfaces_Repositorio.Repositorio;

import org.ycmejia.POO.Interfaces_Repositorio.Modelo.Cliente;

import java.util.List;

public interface OrdebanableRepositorio {
    List<Cliente> listar(String campo, Direccion Dir);
}
