package com.proyecto.ong.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import com.proyecto.ong.Repository.Entities.Persona;
import com.proyecto.ong.Repository.EntitiesDTO.PersonaDTO;

@Configuration
public class PersonaConversion {
    
    @Autowired
    private ModelMapper dbm;

    public Persona convertirDTOAPersona(PersonaDTO personaDTO){
        return dbm.map(personaDTO,Persona.class);
    }

    public PersonaDTO convertirPersonaADto(Persona persona){
        PersonaDTO personaDTO = dbm.map(persona, PersonaDTO.class);

        personaDTO.setId(persona.getId());
        personaDTO.setNombreCompleto(persona.getNombreCompleto());
        personaDTO.setFechaNacimiento(persona.getFechaNacimiento());
        personaDTO.setDireccionVivienda(persona.getDireccionVivienda());
        personaDTO.setCorreoElectronico(persona.getCorreoElectronico());
        personaDTO.setNumeroTelefono(persona.getNumeroTelefono());
        personaDTO.setSede(persona.getSede());

        return personaDTO;
    }
}
