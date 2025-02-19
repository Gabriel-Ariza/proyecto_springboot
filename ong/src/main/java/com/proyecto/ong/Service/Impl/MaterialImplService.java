package com.proyecto.ong.Service.Impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.ong.Configuration.MaterialConversion;
import com.proyecto.ong.Repository.MaterialRepository;
import com.proyecto.ong.Repository.Entities.Material;
import com.proyecto.ong.Repository.EntitiesDTO.MaterialDTO;
import com.proyecto.ong.Service.MaterialService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MaterialImplService implements MaterialService{
    @Autowired
    private MaterialRepository materialRepository;
    private MaterialConversion materialConversion;

@Override
@Transactional
public MaterialDTO save(MaterialDTO materialDTO) {
    Material material = materialConversion.convertirDTOAMaterial(materialDTO);
    materialRepository.save(material);
    return materialConversion.convertirMaterialADto(material);
}

public MaterialDTO update(Long id, MaterialDTO materialDTO){
    Optional<Material> materialCurrentOptional = materialRepository.findById(id);
    if(materialCurrentOptional.isPresent()){
        Material materialCurrent = materialConversion.convertirDTOAMaterial(materialDTO);

        materialCurrent.setId(id);
        materialCurrent.setNombre(materialDTO.getNombre());
        materialCurrent.setTipo(materialDTO.getTipo());

        materialRepository.save(materialCurrent);
        return materialConversion.convertirMaterialADto(materialCurrent);
    }
    return null;
}

@Override
public void deleteById(Long id){
    materialRepository.deleteById(id);
}

@Override
@Transactional(readOnly = true)
public List<MaterialDTO> findAll(){
    List<Material> materiales = (List<Material>) materialRepository.findAll();
    return materiales.stream()
                   .map(materialiito -> materialConversion.convertirMaterialADto(materialiito))
                   .toList();
}

}
