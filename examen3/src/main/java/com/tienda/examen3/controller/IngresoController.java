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

import com.tienda.examen3.entity.Ingreso;
import com.tienda.examen3.service.IngresoService;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {
	@Autowired
	IngresoService ingresoService;
	
	@GetMapping
	public List<Ingreso>mostrar(){
		return ingresoService.ver();
		
	}
	
	@PostMapping
	public Ingreso registrar(@RequestBody Ingreso ingreso) {
		return ingresoService.registrar(ingreso);
		
	}
	@PutMapping
	public Ingreso actualizar(@RequestBody Ingreso ingreso) {
		return ingresoService.actualizar(ingreso);
	}
	@DeleteMapping
	public void elimina(@RequestBody Ingreso ingreso) {
		ingresoService.eliminar(ingreso);
	}

}



