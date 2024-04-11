package com.proyecto.ong.Service;


import java.util.List;

import com.proyecto.ong.Repository.Entities.Cuota;
import com.proyecto.ong.Repository.EntitiesDTO.SocioDTO;

public interface SocioService {

    public SocioDTO save(SocioDTO socioDTO);

    public SocioDTO update(Long id, SocioDTO persona);

    void deleteById(Long id);

    List<SocioDTO> findAll();

    List<SocioDTO> findAllSocioByTipoCuota(Cuota.tipoCuota tipoCuota);
    
    List<SocioDTO> InformeCuotaPorSocio();
}
