package com.tienda.examen3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.examen3.entity.Users;
import com.tienda.examen3.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	
	UsersRepository usersRepository;
	public Users registrar(Users users) {
		return usersRepository.save(users);
	}
	public Users actualizar(Users users) {
		return usersRepository.save(users);	
	}
	public void eliminar(Users users) {
		usersRepository.delete(users);
	}
	public List<Users>ver(){
		return usersRepository.findAll();
	}

}


