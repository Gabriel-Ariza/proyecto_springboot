package com.proyecto.ong.Service;


import java.util.List;

import com.proyecto.ong.Repository.EntitiesDTO.MaterialDTO;

public interface MaterialService {

    public MaterialDTO save(MaterialDTO materialDTO);

    public MaterialDTO  update(Long id, MaterialDTO materialDTO);

    void deleteById(Long id);

    List<MaterialDTO> findAll();
}
