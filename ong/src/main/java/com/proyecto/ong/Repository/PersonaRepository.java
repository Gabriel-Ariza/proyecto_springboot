package com.proyecto.ong.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.ong.Repository.Entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
