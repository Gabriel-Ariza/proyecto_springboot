package com.proyecto.ong.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.ong.Repository.Entities.EnvioMaterial;

public interface EnvioMaterialRepository extends JpaRepository<EnvioMaterial,Long> {
    
}
