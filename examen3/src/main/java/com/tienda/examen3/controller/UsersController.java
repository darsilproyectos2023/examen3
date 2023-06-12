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

import com.tienda.examen3.entity.Users;
import com.tienda.examen3.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	UsersService usersService;
	
	@GetMapping
	public List<Users>mostrar(){
		return usersService.ver();
		
	}
	
	@PostMapping
	public Users registrar(@RequestBody Users users) {
		return usersService.registrar(users);
		
	}
	@PutMapping
	public Users actualizar(@RequestBody Users users) {
		return usersService.actualizar(users);
	}
	@DeleteMapping
	public void elimina(@RequestBody Users users) {
		usersService.eliminar(users);
	}

}


