package com.proyecto.ong.Service;


import java.util.List;

import com.proyecto.ong.Repository.EntitiesDTO.PersonaDTO;

public interface PersonaService {
    
    public PersonaDTO save(PersonaDTO personaDTO);

    public PersonaDTO update(Long id, PersonaDTO personaDTO);

    void deleteById(Long id);

    List<PersonaDTO> findAll();
    
}
