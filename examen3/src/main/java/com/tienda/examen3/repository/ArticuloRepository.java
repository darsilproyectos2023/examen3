package com.tienda.examen3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.examen3.entity.Articulo;
@Repository

public interface ArticuloRepository extends JpaRepository<Articulo,String>{
	
}