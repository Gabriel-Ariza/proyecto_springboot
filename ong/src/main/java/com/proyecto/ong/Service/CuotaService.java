package com.proyecto.ong.Service;


import java.util.List;

import com.proyecto.ong.Repository.EntitiesDTO.CuotaDTO;

public interface CuotaService {

    public CuotaDTO save(CuotaDTO cuotaDTO );

    public CuotaDTO  update(Long id, CuotaDTO cuotaDTO );

    void deleteById(Long id);

    List<CuotaDTO > findAll();
    
}
