package com.proyecto.ong.Service.Impl;

import com.proyecto.ong.Service.EnvioMaterialService;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.proyecto.ong.Configuration.EnvioMaterialConversion;
import com.proyecto.ong.Repository.EnvioMaterialRepository;
import com.proyecto.ong.Repository.Entities.EnvioMaterial;
import com.proyecto.ong.Repository.EntitiesDTO.EnvioMaterialDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EnvioMaterialImplService implements EnvioMaterialService{
    @Autowired
    private EnvioMaterialRepository envioMaterialRepository;
    private EnvioMaterialConversion envioMaterialConversion;

@Override
@Transactional
public EnvioMaterialDTO save(EnvioMaterialDTO envioMaterialDTO) {
    EnvioMaterial envioMaterial = envioMaterialConversion.convertirDTOAEnvioMaterial(envioMaterialDTO);
    envioMaterialRepository.save(envioMaterial);
    return envioMaterialConversion.convertirEnvioMaterialADto(envioMaterial);
}

public EnvioMaterialDTO update(Long id, EnvioMaterialDTO envioMaterialDTO){
    Optional<EnvioMaterial> envioMaterialCurrentOptional = envioMaterialRepository.findById(id);
    if(envioMaterialCurrentOptional.isPresent()){
        EnvioMaterial envioMaterialCurrent = envioMaterialConversion.convertirDTOAEnvioMaterial(envioMaterialDTO);
        
        envioMaterialCurrent.setId(envioMaterialDTO.getId());
        envioMaterialCurrent.setEnvio(envioMaterialDTO.getEnvio());
        envioMaterialCurrent.setMaterial(envioMaterialDTO.getMaterial());
        envioMaterialCurrent.setNumeroMedicamentos(envioMaterialDTO.getNumeroMedicamentos());
        envioMaterialCurrent.setToneladas(envioMaterialDTO.getToneladas());

       envioMaterialRepository.save(envioMaterialCurrent);
        
        return envioMaterialConversion.convertirEnvioMaterialADto(envioMaterialCurrent);
    }
    return null;
}

@Override
public void deleteById(Long id){
    envioMaterialRepository.deleteById(id);
}

@Override
@Transactional(readOnly = true)
public List<EnvioMaterialDTO> findAll(){
    List<EnvioMaterial> envioMateriales = (List<EnvioMaterial>) envioMaterialRepository.findAll();
    return envioMateriales.stream()
                 .map(enviito -> envioMaterialConversion.convertirEnvioMaterialADto(enviito))
                 .toList();
    }

@Override
@Transactional(readOnly = true)
public EnvioMaterialDTO findById(Long id){
    Optional<EnvioMaterial> envioMaterialCurrentOptional = envioMaterialRepository.findById(id);

    return envioMaterialConversion.convertirEnvioMaterialADto(envioMaterialCurrentOptional.get());

}
}
