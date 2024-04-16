package org.serratec.poo.classes;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String contato;
	private String senha;
	
	
	public Pessoa(String nome, String cpf, String senha, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
	}

	

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getContato() {
		return contato;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Nome: "+ nome + 
				"\nCpf: "+ cpf + 
				"\nDataNascimento: "+ dataNascimento + 
				"\nContato: "+ contato + 
				"\nSenha: "+ senha+
				"\n";
	}	
}
