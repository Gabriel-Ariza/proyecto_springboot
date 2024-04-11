package com.proyecto.ong.Service.Impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.ong.Configuration.SedeConversion;
import com.proyecto.ong.Repository.SedeRepository;
import com.proyecto.ong.Repository.Entities.Sede;
import com.proyecto.ong.Repository.EntitiesDTO.SedeDTO;
import com.proyecto.ong.Service.SedeService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class SedeImplService implements SedeService {
    @Autowired
    private SedeRepository sedeRepository;
    private SedeConversion sedeConversion;

@Override
@Transactional
public SedeDTO save(SedeDTO sedeDTO ) {
    Sede sede = sedeConversion.convertirDTOASede(sedeDTO);
    sedeRepository.save(sede);
    return sedeConversion.convertirSedeADto(sede);
}

public SedeDTO update(Long id, SedeDTO sedeDTO){
    Optional<Sede> sedeCurrentOptional = sedeRepository.findById(id);
    if(sedeCurrentOptional.isPresent()){
        Sede sedeCurrent = sedeConversion.convertirDTOASede(sedeDTO);
        sedeCurrent.setId(id);
        sedeCurrent.setCiudad(sedeDTO.getCiudad());
        sedeCurrent.setDireccion(sedeDTO.getDireccion());
        sedeCurrent.setDirector(sedeDTO.getDirector());
        sedeCurrent.setEnvios(sedeDTO.getEnvios());

        sedeRepository.save(sedeCurrent);
        
        return sedeConversion.convertirSedeADto(sedeCurrent);
    }
    return null;
}

@Override
public void deleteById(Long id){
    sedeRepository.deleteById(id);
}

@Override
@Transactional(readOnly = true)
public List<SedeDTO> findAll(){
    List<Sede> sedes = (List<Sede>) sedeRepository.findAll();
    return sedes.stream()
                 .map(sedesita -> sedeConversion.convertirSedeADto(sedesita))
                 .toList();
    }
}
