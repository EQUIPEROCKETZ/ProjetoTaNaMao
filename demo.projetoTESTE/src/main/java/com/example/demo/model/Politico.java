package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Politico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private	Long id;
	private	String nome;
	private int idade;
	private char sexo;
	private String partido;
	private String cargo;
	private String propostas;
	
	
	public Politico() {
		
	}
	
	
	public Politico(Long id, String nome, int idade,char sexo,String partido, String cargo,String propostas ) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.partido = partido;
        this.cargo = cargo;
        this.propostas = propostas;
    }
	


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getPropostas() {
		return propostas;
	}
	private void setPropostas(String propostas) {
		this.propostas = propostas;
	}
		
}
