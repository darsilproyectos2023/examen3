package com.tienda.examen3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.examen3.entity.Categoria;
import com.tienda.examen3.repository.CategoriaRepository;

@Service
public class CategoriaService {
@Autowired

CategoriaRepository categoriaRepository;

public Categoria registrar(Categoria categoria) {
	return categoriaRepository.save(categoria);
}
public Categoria actualizar(Categoria categoria) {
	return categoriaRepository.save(categoria);
}
public void eliminar(Categoria categoria) {
	 categoriaRepository.delete(categoria);
}
public List<Categoria>ver(){
	return categoriaRepository.findAll();
}

}
