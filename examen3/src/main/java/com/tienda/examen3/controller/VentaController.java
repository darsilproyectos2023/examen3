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

import com.tienda.examen3.entity.Venta;
import com.tienda.examen3.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
	@Autowired
	VentaService ventaService;
	
	@GetMapping
	public List<Venta>mostrar(){
		return ventaService.ver();
		
	}
	
	@PostMapping
	public Venta registrar(@RequestBody Venta venta) {
		return ventaService.registrar(venta);
		
	}
	@PutMapping
	public Venta actualizar(@RequestBody Venta venta) {
		return ventaService.actualizar(venta);
	}
	@DeleteMapping
	public void elimina(@RequestBody Venta venta) {
		ventaService.eliminar(venta);
	}

}


