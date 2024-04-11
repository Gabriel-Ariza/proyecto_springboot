package com.proyecto.ong.Service;


import java.util.List;

import com.proyecto.ong.Repository.EntitiesDTO.RefugioDTO;

public interface RefugioService {
    
    public RefugioDTO save(RefugioDTO refugioDTO);

    public RefugioDTO update(Long id, RefugioDTO refugioDTO);

    void deleteById(Long id);

    List<RefugioDTO> findAll();
}
