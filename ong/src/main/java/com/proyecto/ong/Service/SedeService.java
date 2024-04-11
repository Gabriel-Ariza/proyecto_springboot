package com.proyecto.ong.Service;


import java.util.List;

import com.proyecto.ong.Repository.EntitiesDTO.SedeDTO;

public interface SedeService {


    public SedeDTO save(SedeDTO sedeDTO);

    public SedeDTO update(Long id, SedeDTO sedeDTO);

    void deleteById(Long id);

    List<SedeDTO> findAll();
}
