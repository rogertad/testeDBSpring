package br.lippe.testDB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

	private String nome;
	private long idade;
	private String endereco;
	
	@Id
	@GeneratedValue
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	protected Usuario() {
		
	}
	
	public Usuario(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "User [nome=" + nome + ", idade=" + idade + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
