package com.proyecto.ong.Repository.EntitiesDTO;



import com.proyecto.ong.Repository.Entities.Persona;
import com.proyecto.ong.Repository.Entities.Voluntario;

import lombok.Data;

@Data
public class VoluntarioDTO {
    private Long id;

    private Voluntario.tipoVoluntario tipo; 

    private Boolean disponibilidad;

    private Long numeroTrabajos;

    private String profesion;

    private Persona persona;

}
