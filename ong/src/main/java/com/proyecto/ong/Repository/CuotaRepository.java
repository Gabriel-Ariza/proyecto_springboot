package com.proyecto.ong.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.ong.Repository.Entities.Cuota;

public interface CuotaRepository extends JpaRepository<Cuota, Long>{
    
}
