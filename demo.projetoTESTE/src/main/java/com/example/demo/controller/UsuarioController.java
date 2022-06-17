package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repo.UsuarioRepository;

import java.util.List;
import lombok.AllArgsConstructor;

@RestController

public class UsuarioController {
	@Autowired
	UsuarioRepository repository;
	
	@GetMapping("/usuario")
	public List<Usuario> getAllUsuarios(){
		return repository.findAll();
		
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario getAllUsuariosById(@PathVariable Long id){
		return repository.findById(id).get();
	}
	
	@PostMapping("/usuario")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void DelUsuario(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
