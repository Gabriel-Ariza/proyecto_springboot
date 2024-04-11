package com.proyecto.ong.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.proyecto.ong.Repository.Entities.Voluntario;
import com.proyecto.ong.Repository.EntitiesDTO.VoluntarioDTO;

@Configuration
public class VoluntarioConversion {
    @Autowired
    private ModelMapper dbm;

    public Voluntario convertirDTOAVoluntario(VoluntarioDTO voluntarioDTO){
        return dbm.map(voluntarioDTO,Voluntario.class);
    }

    public VoluntarioDTO convertirVoluntarioADto(Voluntario voluntario){
        VoluntarioDTO voluntarioDTO = dbm.map(voluntario, VoluntarioDTO.class);

        voluntarioDTO.setId(voluntario.getId());
        voluntarioDTO.setTipo(voluntario.getTipo());
        voluntarioDTO.setDisponibilidad(voluntario.getDisponibilidad());
        voluntarioDTO.setNumeroTrabajos(voluntario.getNumeroTrabajos());
        voluntarioDTO.setProfesion(voluntario.getProfesion());
        voluntarioDTO.setPersona(voluntario.getPersona());

        return voluntarioDTO;
    }
}
