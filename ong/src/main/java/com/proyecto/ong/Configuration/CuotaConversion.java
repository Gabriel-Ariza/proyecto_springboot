package com.proyecto.ong.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.proyecto.ong.Repository.Entities.Cuota;
import com.proyecto.ong.Repository.EntitiesDTO.CuotaDTO;

@Configuration
public class CuotaConversion {
    
    @Autowired
    private ModelMapper dbm;

    public Cuota convertirDTOACuota(CuotaDTO cuotaDTO){
        return dbm.map(cuotaDTO,Cuota.class);
    }

    public CuotaDTO convertirCuotaADto(Cuota cuota){
        CuotaDTO cuotaDTO = dbm.map(cuota, CuotaDTO.class);


        cuotaDTO.setId(cuota.getId());
        cuotaDTO.setValor(cuota.getValor());
        cuotaDTO.setFechaPago(cuota.getFechaPago());
        cuotaDTO.setTipoCuota(cuota.getTipoCuota());
        /* cuotaDTO.setSocio(cuota.getSocio()); */

        return cuotaDTO;
    }


}
