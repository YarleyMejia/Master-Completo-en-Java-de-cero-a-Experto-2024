package org.ycmejia.POO.Interfaces_Repositorio.Repositorio;

import org.ycmejia.POO.Interfaces_Repositorio.Modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
