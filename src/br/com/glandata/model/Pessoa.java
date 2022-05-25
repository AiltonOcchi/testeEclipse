package br.com.glandata.model;

import java.util.Objects;

public class Pessoa {
	
	//Construtor
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	// Atributos
	private String nome;
	private String cpf;
	
	
	//Getters And Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// Hascode
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}
	
	// Equal
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}
	
	// ToString
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
}
