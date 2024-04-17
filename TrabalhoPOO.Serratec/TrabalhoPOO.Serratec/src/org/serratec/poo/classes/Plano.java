package org.serratec.poo.classes;

public class Plano {
	private String nome;
	private String duracao;
	private double valor;
	private String descricao;
	
	public Plano(String nome, String duracao, String descricao,double valor) {
		
		this.nome = nome;
		this.duracao = duracao;
		this.descricao = descricao;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getDuracao() {
		return duracao;
	}
	
	@Override
	public String toString() {
		return "\nPlano: "+ nome + 
				"\nDuracao: "+ duracao + 
				"\nValor: " + valor + 
				"\nDescricao: " + descricao;
	}
	
	 public String formatarArquivoPlanos() {
		 return nome + ","+ duracao + "," + descricao + "," + valor;
	 }
		 
}
