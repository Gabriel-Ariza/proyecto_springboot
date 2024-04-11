package com.proyecto.ong.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.proyecto.ong.Repository.Entities.Material;
import com.proyecto.ong.Repository.EntitiesDTO.MaterialDTO;

@Configuration
public class MaterialConversion {
    @Autowired
    private ModelMapper dbm;

    public Material convertirDTOAMaterial(MaterialDTO materialDTO){
        return dbm.map(materialDTO,Material.class);
    }
    
    public MaterialDTO convertirMaterialADto(Material material){
        MaterialDTO materialDTO = dbm.map(material, MaterialDTO.class);

        materialDTO.setId(material.getId());
        materialDTO.setNombre(material.getNombre());
        materialDTO.setTipo(material.getTipo());

        return materialDTO;
    }
}
