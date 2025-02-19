package com.proyecto.ong.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.ong.Repository.Entities.Envio;
import com.proyecto.ong.Repository.EntitiesDTO.EnvioDTO;

@Component
public class EnvioConversion {
    @Autowired
    private ModelMapper dbm;

    public Envio convertirDTOAEnvio(EnvioDTO envioDTO){
        return dbm.map(envioDTO,Envio.class);
    }

    public EnvioDTO convertirEnvioADto(Envio enviito){
        EnvioDTO envioDTO = dbm.map(enviito, EnvioDTO.class);

        envioDTO.setId(enviito.getId());
        envioDTO.setFechaSalida(enviito.getFechaSalida());
        envioDTO.setCodigo(enviito.getCodigo());
        envioDTO.setRefugio(enviito.getRefugio());
        envioDTO.setSedes(enviito.getSedes());
        envioDTO.setVoluntarios(enviito.getVoluntarios());

        
        return envioDTO;
    } 
}
