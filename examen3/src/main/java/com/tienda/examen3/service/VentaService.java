package com.tienda.examen3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.examen3.entity.Venta;
import com.tienda.examen3.repository.VentaRepository;

@Service
public class VentaService {
@Autowired
	
	VentaRepository ventaRepository;
	public Venta registrar(Venta venta) {
		return ventaRepository.save(venta);
	}
	public Venta actualizar(Venta venta) {
		return ventaRepository.save(venta);	
	}
	public void eliminar(Venta venta) {
		ventaRepository.delete(venta);
	}
	public List<Venta>ver(){
		return ventaRepository.findAll();
	}

}


