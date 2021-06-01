package com.weslley.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "pessoa")

public class Pessoa {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String nome;
	private String telefone;
	
	//Criando construtor
	public Pessoa(int id, String nome, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	//Gerando getter e setter de ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//Gerando getter e setter de NOME
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Gerando getter e setter de TELEFONE
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	 
	
}
