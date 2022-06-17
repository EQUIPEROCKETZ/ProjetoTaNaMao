package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;


@Entity

public class Usuario {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private	Long id;
		
		private	String nome;
		private int idade;
		private char sexo;
		private String cep;
		private String email;
		private String senha;
		
		
	
		public Usuario() {
			
		}
		
		public Usuario(Long id, String nome, int idade,char sexo, String cep, String email,String senha) {
	        this.id = id;
	        this.nome = nome;
	        this.idade = idade;
	        this.sexo = sexo;
	        this.cep = cep;
	        this.email = email;
	        this.senha = senha;
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
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}
	
		private String getSenha() {
			return senha;
		}

		private void setSenha(String senha) {
			this.senha = senha;
		}

		
}
