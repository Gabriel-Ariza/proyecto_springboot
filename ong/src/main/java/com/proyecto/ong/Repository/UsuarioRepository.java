package com.proyecto.ong.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.ong.Repository.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByEmail(String email);
}
