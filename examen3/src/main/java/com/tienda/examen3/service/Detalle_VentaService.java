package com.tienda.examen3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.examen3.entity.Detalle_Venta;
import com.tienda.examen3.repository.Detalle_VentaRepository;
@Service
public class Detalle_VentaService {
	@Autowired
	
	Detalle_VentaRepository detalle_ventaRepository;
	public Detalle_Venta registrar(Detalle_Venta detalle_venta) {
		return detalle_ventaRepository.save(detalle_venta);
	}
	public Detalle_Venta actualizar(Detalle_Venta detalle_venta) {
		return detalle_ventaRepository.save(detalle_venta);	
	}
	public void eliminar(Detalle_Venta detalle_venta) {
		detalle_ventaRepository.delete(detalle_venta);
	}
	public List<Detalle_Venta>ver(){
		return detalle_ventaRepository.findAll();
	}

}

