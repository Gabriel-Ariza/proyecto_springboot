package com.proyecto.ong.Repository.EntitiesDTO;


import java.util.List;

import com.proyecto.ong.Repository.Entities.Envio;
import lombok.Data;

@Data
public class SedeDTO {

    private Long id;

    private String direccion;

    private String director;

    private List<Envio> envios;

    private String ciudad;

}
