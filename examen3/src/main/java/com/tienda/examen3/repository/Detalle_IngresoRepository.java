package com.tienda.examen3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.examen3.entity.Detalle_Ingreso;

@Repository
public interface Detalle_IngresoRepository extends JpaRepository<Detalle_Ingreso,String> {

}
