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

import com.tienda.examen3.entity.Detalle_Venta;
import com.tienda.examen3.service.Detalle_VentaService;

@RestController
@RequestMapping("/detalle-venta")
public class Detalle_VentaController {
	@Autowired
	Detalle_VentaService detalle_ventaService;
	
	@GetMapping
	public List<Detalle_Venta> mostrar(){
		return detalle_ventaService.ver();
		
	}
	
	@PostMapping
	public Detalle_Venta registrar(@RequestBody Detalle_Venta detalle_venta) {
		return detalle_ventaService.registrar(detalle_venta);
		
	}
	@PutMapping
	public Detalle_Venta actualizar(@RequestBody Detalle_Venta detalle_venta) {
		return detalle_ventaService.actualizar(detalle_venta);
	}
	@DeleteMapping
	public void elimina(@RequestBody Detalle_Venta detalle_venta) {
		detalle_ventaService.eliminar(detalle_venta);
	}

}



