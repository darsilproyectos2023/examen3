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

import com.tienda.examen3.entity.Persona;
import com.tienda.examen3.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
	PersonaService personaService;
	
	@GetMapping
	public List<Persona>mostrar(){
		return personaService.ver();
		
	}
	
	@PostMapping
	public Persona registrar(@RequestBody Persona persona) {
		return personaService.registrar(persona);
		
	}
	@PutMapping
	public Persona actualizar(@RequestBody Persona persona) {
		return personaService.actualizar(persona);
	}
	@DeleteMapping
	public void elimina(@RequestBody Persona persona) {
		personaService.eliminar(persona);
	}

}



