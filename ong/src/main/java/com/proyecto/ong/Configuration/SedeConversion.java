package com.proyecto.ong.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.proyecto.ong.Repository.Entities.Sede;
import com.proyecto.ong.Repository.EntitiesDTO.SedeDTO;


@Configuration
public class SedeConversion {
    @Autowired
    private ModelMapper dbm;

    public Sede convertirDTOASede(SedeDTO sedeDTO){
        return dbm.map(sedeDTO,Sede.class);
    }
    
    public SedeDTO convertirSedeADto(Sede sede){
        SedeDTO sedeDTO = dbm.map(sede, SedeDTO.class);

        sedeDTO.setId(sede.getId());
        sedeDTO.setDireccion(sede.getDireccion());
        sedeDTO.setDirector(sede.getDirector());
        sedeDTO.setEnvios(sede.getEnvios());
        sedeDTO.setCiudad(sede.getCiudad());

        return sedeDTO;
    }
}
