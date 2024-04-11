package com.proyecto.ong.Repository.EntitiesDTO;



import com.proyecto.ong.Repository.Entities.Envio;
import com.proyecto.ong.Repository.Entities.Material;

import lombok.Data;

@Data
public class EnvioMaterialDTO {
    
    private Long id;

    private Long toneladas;

    private Long numeroMedicamentos;

    private Envio envio;

    private Material material;
}
