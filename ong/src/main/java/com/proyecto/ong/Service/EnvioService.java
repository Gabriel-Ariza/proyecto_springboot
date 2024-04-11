package com.proyecto.ong.Service;


import java.util.List;

import com.proyecto.ong.Repository.EntitiesDTO.EnvioDTO;

public interface EnvioService {
    
    public EnvioDTO save(EnvioDTO envioDTO);

    public EnvioDTO update(Long id,EnvioDTO envioDTO );

    void deleteById(Long id);

    List<EnvioDTO> findAll();

    EnvioDTO findById(Long id);

    List<EnvioDTO> informeEnvioAyudaHumanitaria();

    
}
