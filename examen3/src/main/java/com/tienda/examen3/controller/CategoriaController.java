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


import com.tienda.examen3.entity.Categoria;
import com.tienda.examen3.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
@Autowired
CategoriaService categoriaService;
@GetMapping
public List<Categoria>mostrar(){
	return categoriaService.ver();	
}
@PostMapping
public Categoria registrar(@RequestBody Categoria categoria) {
	return categoriaService.registrar(categoria);
	
}
@PutMapping
public Categoria actualizar(@RequestBody Categoria categoria) {
	return categoriaService.actualizar(categoria);
}
@DeleteMapping
public void elimina(@RequestBody Categoria categoria) {
	categoriaService.eliminar(categoria);
}
}
