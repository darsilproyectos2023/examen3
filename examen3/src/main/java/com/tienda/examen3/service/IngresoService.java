package com.tienda.examen3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.examen3.entity.Ingreso;
import com.tienda.examen3.repository.IngresoRepository;

@Service
public class IngresoService {
	@Autowired
	
	IngresoRepository ingresoRepository;
	public Ingreso registrar(Ingreso ingreso) {
		return ingresoRepository.save(ingreso);
	}
	public Ingreso actualizar(Ingreso ingreso) {
		return ingresoRepository.save(ingreso);	
	}
	public void eliminar(Ingreso ingreso) {
		ingresoRepository.delete(ingreso);
	}
	public List<Ingreso>ver(){
		return ingresoRepository.findAll();
	}

}



