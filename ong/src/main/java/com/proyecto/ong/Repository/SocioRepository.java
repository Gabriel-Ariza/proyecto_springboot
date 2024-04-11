package com.proyecto.ong.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.ong.Repository.Entities.Cuota;
import com.proyecto.ong.Repository.Entities.Socio;


public interface SocioRepository extends JpaRepository<Socio, Long> {


    String INFORME_SOCIO_CUOTA = "SELECT s.id, p.nombre_completo, p.fecha_nacimiento, p.direccion_vivienda, p.correo_electronico, p.numero_telefono, s.cuenta_bancaria, c.fecha_pago, tc.nombre AS tipo_cuota, s.persona_id, s.tipo_cuota_id FROM persona p JOIN socio s ON p.id = s.persona_id JOIN cuota c ON s.id = c.socio_id";
    @Query(value = INFORME_SOCIO_CUOTA, nativeQuery = true)
    List<Socio> InformeCuotaPorSocio();



    String INTENTO = "SELECT s FROM Socio s JOIN s.cuotas c WHERE c.tipoCuota = :tipoCuota";
    String consulta = "SELECT s.id, p.nombre_completo, p.fecha_nacimiento, p.direccion_vivienda, p.correo_electronico, p.numero_telefono, s.cuenta_bancaria, c.fecha_pago, c.tipoCuota AS tipo_cuota, s.persona_id, s.tipo_cuota_id FROM persona p JOIN Socio s ON p.id = s.persona_id JOIN Cuota c ON s.id = c.socio_id;";
    
    @Query(value = consulta, nativeQuery = true)
    List<Socio> findAllSocioByTipoCuota(@Param("tipoCuota") Cuota.tipoCuota tipoCuota);
}