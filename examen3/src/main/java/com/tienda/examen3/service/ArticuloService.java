package com.tienda.examen3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.examen3.entity.Articulo;
import com.tienda.examen3.repository.ArticuloRepository;
@Service
public class ArticuloService {
	@Autowired
	
	ArticuloRepository articuloRepository;
	public Articulo registrar(Articulo articulo) {
		return articuloRepository.save(articulo);
	}
	public Articulo actualizar(Articulo articulo) {
		return articuloRepository.save(articulo);	
	}
	public void eliminar(Articulo articulo) {
		articuloRepository.delete(articulo);
	}
	public List<Articulo>ver(){
		return articuloRepository.findAll();
	}

}
