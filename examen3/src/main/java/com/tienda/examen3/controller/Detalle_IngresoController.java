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
import com.tienda.examen3.entity.Detalle_Ingreso;
import com.tienda.examen3.service.Detalle_IngresoService;

@RestController
@RequestMapping("/detalle_ingreso")
public class Detalle_IngresoController{
	@Autowired
	Detalle_IngresoService detalle_ingresoService;
	
	@GetMapping
	public List<Detalle_Ingreso>mostrar(){
		return detalle_ingresoService.ver();
		
	}
	
	@PostMapping
	public Detalle_Ingreso registrar(@RequestBody Detalle_Ingreso detalle_ingreso) {
		return detalle_ingresoService.registrar(detalle_ingreso);
		
	}
	@PutMapping
	public Detalle_Ingreso actualizar(@RequestBody Detalle_Ingreso detalle_ingreso) {
		return detalle_ingresoService.actualizar(detalle_ingreso);
	}
	@DeleteMapping
	public void elimina(@RequestBody Detalle_Ingreso detalle_ingreso) {
		detalle_ingresoService.eliminar(detalle_ingreso);
	}

}


