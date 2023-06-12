package com.tienda.examen3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.examen3.entity.Detalle_Ingreso;
import com.tienda.examen3.repository.Detalle_IngresoRepository;

@Service
public class Detalle_IngresoService {
@Autowired
	
	Detalle_IngresoRepository detalle_ingresoRepository;
	public Detalle_Ingreso registrar(Detalle_Ingreso detalle_ingreso) {
		return detalle_ingresoRepository.save(detalle_ingreso);
	}
	public Detalle_Ingreso actualizar(Detalle_Ingreso detalle_ingreso) {
		return detalle_ingresoRepository.save(detalle_ingreso);	
	}
	public void eliminar(Detalle_Ingreso detalle_ingreso) {
		detalle_ingresoRepository.delete(detalle_ingreso);
	}
	public List<Detalle_Ingreso>ver(){
		return detalle_ingresoRepository.findAll();
	}

}


