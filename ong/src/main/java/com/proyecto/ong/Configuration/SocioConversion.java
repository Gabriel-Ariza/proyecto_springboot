package com.proyecto.ong.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.proyecto.ong.Repository.Entities.Socio;
import com.proyecto.ong.Repository.EntitiesDTO.SocioDTO;

@Configuration
public class SocioConversion {
    @Autowired
    private ModelMapper dbm;

    public Socio convertirDTOASocio(SocioDTO socioDTO){
        return dbm.map(socioDTO,Socio.class);
    }

    public SocioDTO convertirSocioADto(Socio socio){
        SocioDTO socioDTO = dbm.map(socio, SocioDTO.class);

        socioDTO.setId(socio.getId());
        socioDTO.setCuentaBancaria(socio.getCuentaBancaria());
        socioDTO.setPersona(socio.getPersona());


        return socioDTO;
    }
}
