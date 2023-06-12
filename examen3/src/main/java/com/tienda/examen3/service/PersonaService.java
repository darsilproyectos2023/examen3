package com.tienda.examen3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.examen3.entity.Persona;
import com.tienda.examen3.repository.PersonaRepository;

@Service
public class PersonaService {
@Autowired
	
	PersonaRepository personaRepository;
	public Persona registrar(Persona persona) {
		return personaRepository.save(persona);
	}
	public Persona actualizar(Persona persona) {
		return personaRepository.save(persona);	
	}
	public void eliminar(Persona persona) {
		personaRepository.delete(persona);
	}
	public List<Persona>ver(){
		return personaRepository.findAll();
	}

}



