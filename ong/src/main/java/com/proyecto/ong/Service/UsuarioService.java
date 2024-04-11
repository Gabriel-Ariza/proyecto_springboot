package com.proyecto.ong.Service;


import java.util.List;

import com.proyecto.ong.Repository.EntitiesDTO.UsuarioDTO;



public interface UsuarioService {

    public UsuarioDTO save(UsuarioDTO usuario);

    public UsuarioDTO update(Long id, UsuarioDTO usuario);

    void deleteById(Long id);

    List<UsuarioDTO> findAll();

}