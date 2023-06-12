package com.tienda.examen3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.examen3.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,String> {

}
