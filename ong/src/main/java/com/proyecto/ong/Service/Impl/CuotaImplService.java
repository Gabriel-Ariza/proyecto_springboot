package com.proyecto.ong.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.ong.Configuration.CuotaConversion;
import com.proyecto.ong.Repository.CuotaRepository;
import com.proyecto.ong.Repository.Entities.Cuota;
import com.proyecto.ong.Repository.EntitiesDTO.CuotaDTO;
import com.proyecto.ong.Service.CuotaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CuotaImplService implements CuotaService {
    
    @Autowired
    private CuotaRepository cuotaRepository;
    private CuotaConversion cuotaConversion;

    @Override
    @Transactional
    public CuotaDTO save(CuotaDTO cuotaDTO) {
        Cuota cuota = cuotaConversion.convertirDTOACuota(cuotaDTO);
        cuotaRepository.save(cuota);
        return cuotaConversion.convertirCuotaADto(cuota);
    }

    public CuotaDTO update(Long id, CuotaDTO cuotaDTO){
        Optional<Cuota> cuotaCurrentOptional = cuotaRepository.findById(id);
        if(cuotaCurrentOptional.isPresent()){
            Cuota cuotaCurrent = cuotaConversion.convertirDTOACuota(cuotaDTO);
            cuotaCurrent.setId(id);
            cuotaCurrent.setValor(cuotaDTO.getValor());
            cuotaCurrent.setFechaPago(cuotaDTO.getFechaPago());
            cuotaCurrent.setTipoCuota(cuotaDTO.getTipoCuota());
            cuotaRepository.save(cuotaCurrent);
            return cuotaConversion.convertirCuotaADto(cuotaCurrent);
        }
        return null;
    }

    @Override
    public void deleteById(Long id){
        cuotaRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CuotaDTO> findAll(){
        List<Cuota> cuotas = (List<Cuota>) cuotaRepository.findAll();
        return cuotas.stream()
                     .map(cuotita -> cuotaConversion.convertirCuotaADto(cuotita))
                     .toList();
    }
}