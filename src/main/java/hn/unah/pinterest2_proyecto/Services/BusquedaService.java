package hn.unah.pinterest2_proyecto.Services;

import hn.unah.pinterest2_proyecto.Entities.Usuario;

public interface BusquedaService {

    public void registrarBusqueda(String termino, String nombreCategoria, Long codigoUsuario);

    public Long getCategoriaCodigo(String nombreCategoria);

    public Usuario getUsuarioByCodigo(Long codigoUsuario);

    
}
