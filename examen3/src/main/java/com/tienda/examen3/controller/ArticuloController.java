package com.tienda.examen3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.examen3.entity.Articulo;
import com.tienda.examen3.service.ArticuloService;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
	@Autowired
	ArticuloService articuloService;
	
	@GetMapping
	public List<Articulo>mostrar(){
		return articuloService.ver();
		
	}
	
	@PostMapping
	public Articulo registrar(@RequestBody Articulo articulo) {
		return articuloService.registrar(articulo);
		
	}
	@PutMapping
	public Articulo actualizar(@RequestBody Articulo articulo) {
		return articuloService.actualizar(articulo);
	}
	@DeleteMapping
	public void elimina(@RequestBody Articulo articulo) {
		articuloService.eliminar(articulo);
	}

}
