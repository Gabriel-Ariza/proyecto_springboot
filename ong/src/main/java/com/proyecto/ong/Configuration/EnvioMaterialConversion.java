package com.proyecto.ong.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proyecto.ong.Repository.Entities.EnvioMaterial;
import com.proyecto.ong.Repository.EntitiesDTO.EnvioMaterialDTO;

@Component
public class EnvioMaterialConversion {
    @Autowired
    private ModelMapper dbm;

    public EnvioMaterial convertirDTOAEnvioMaterial(EnvioMaterialDTO envioMaterialDTO){
        return dbm.map(envioMaterialDTO,EnvioMaterial.class);
    }

    public EnvioMaterialDTO convertirEnvioMaterialADto(EnvioMaterial envioMaterial){
        EnvioMaterialDTO envioMaterialDTO = dbm.map(envioMaterial, EnvioMaterialDTO.class);

        envioMaterialDTO.setId(envioMaterial.getId());
        envioMaterialDTO.setToneladas(envioMaterial.getToneladas());
        envioMaterialDTO.setNumeroMedicamentos(envioMaterial.getNumeroMedicamentos());
        envioMaterialDTO.setEnvio(envioMaterial.getEnvio());
        envioMaterialDTO.setMaterial(envioMaterial.getMaterial());


        
        return envioMaterialDTO;
    } 
}
