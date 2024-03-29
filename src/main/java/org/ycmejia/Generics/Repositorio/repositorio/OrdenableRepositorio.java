package org.ycmejia.Generics.Repositorio.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, TipoOrden dir);
}
