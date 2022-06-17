package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Politico;
import com.example.demo.repo.PoliticoRepository;

import lombok.AllArgsConstructor;

@RestController
public class PoliticoController {

	@Autowired
	PoliticoRepository repository;
	
	@GetMapping("/politico")
	public List<Politico> getAllPoliticos(){
		return repository.findAll();
		
	}
	
	@GetMapping("/politico/{id}")
	public Politico getAllPoliticoById(@PathVariable Long id){
		return repository.findById(id).get();
	}
	
	@PostMapping("/politico")
	public Politico savePolitico(@RequestBody Politico politico) {
		return repository.save(politico);
	}
	
	@DeleteMapping("/politico/{id}")
	public void DelPolitico(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
