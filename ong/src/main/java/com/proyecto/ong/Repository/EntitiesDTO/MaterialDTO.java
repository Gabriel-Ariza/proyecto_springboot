package com.proyecto.ong.Repository.EntitiesDTO;



import com.proyecto.ong.Repository.Entities.Material;

import lombok.Data;

@Data
public class MaterialDTO {
    
    private Long id;

    private Material.tipoMaterial tipo; 

    private String nombre;
}
