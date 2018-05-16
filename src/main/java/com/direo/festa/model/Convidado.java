package com.direo.festa.model;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="convidado")
public class Convidado implements Serializable{
	
	@Id @GeneratedValue
	private Long id;
	
	private String nome;
	
	private int quantidadeacompanhantes;

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

	public int getQuantidadeacompanhantes() {
		return quantidadeacompanhantes;
	}

	public void setQuantidadeacompanhantes(int quantidadeacompanhantes) {
		this.quantidadeacompanhantes = quantidadeacompanhantes;
	}

		
	
}
