package com.proyecto.ong.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.ong.Repository.Entities.Sede;

public interface SedeRepository extends JpaRepository<Sede, Long> {
    
}
