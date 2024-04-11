package com.proyecto.ong.Service.Impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.ong.Configuration.SocioConversion;
import com.proyecto.ong.Repository.SocioRepository;
import com.proyecto.ong.Repository.Entities.Cuota;
import com.proyecto.ong.Repository.Entities.Socio;
import com.proyecto.ong.Repository.EntitiesDTO.SocioDTO;
import com.proyecto.ong.Service.SocioService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SocioImplService implements SocioService {
    @Autowired
    private SocioRepository socioRepository;
    private SocioConversion socioConversion;


@Override
@Transactional
public SocioDTO save(SocioDTO socioDTO) {
    Socio socio = socioConversion.convertirDTOASocio(socioDTO);
    socioRepository.save(socio);
    return socioConversion.convertirSocioADto(socio);
}

public SocioDTO update(Long id, SocioDTO socioDTO){
    Optional<Socio> socioCurrentOptional = socioRepository.findById(id);
    if(socioCurrentOptional.isPresent()){
        Socio socioCurrent = socioConversion.convertirDTOASocio(socioDTO);
        socioCurrent.setId(id);
        socioCurrent.setPersona(socioDTO.getPersona());
        socioCurrent.setCuentaBancaria(socioDTO.getCuentaBancaria());

        socioRepository.save(socioCurrent);
        
        return socioConversion.convertirSocioADto(socioCurrent);
    }
    return null;
}

@Override
public void deleteById(Long id){
    socioRepository.deleteById(id);
}

@Override
@Transactional(readOnly = true)
public List<SocioDTO> findAll(){
    List<Socio> socios = (List<Socio>) socioRepository.findAll();
    return socios.stream()
                 .map(sociito -> socioConversion.convertirSocioADto(sociito))
                 .toList();
    }

    
@Override
@Transactional(readOnly = true)
public List<SocioDTO> findAllSocioByTipoCuota(Cuota.tipoCuota tipoCuota){
    List<Socio> socios = (List<Socio>) socioRepository.findAllSocioByTipoCuota(tipoCuota);
    return socios.stream().map(socio -> socioConversion.convertirSocioADto(socio)).toList();
}

@Override
@Transactional(readOnly = true)
public List<SocioDTO> InformeCuotaPorSocio(){
    List<Socio> socios = (List<Socio>) socioRepository.InformeCuotaPorSocio();
    return socios.stream().map(socio -> socioConversion.convertirSocioADto(socio)).toList();

}


}
