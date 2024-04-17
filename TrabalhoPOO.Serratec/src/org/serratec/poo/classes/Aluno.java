package org.serratec.poo.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
	
	private LocalDate dataMatricula;
	private	Plano plano;
	private List<Avaliacao> avaliacaoAluno = new ArrayList<>();
	private int numeroPlano;
	
	public Aluno(String nome, String cpf, String senha, String dataNascimento,int numeroPlano) 
	{
		
		super(nome, cpf, senha, dataNascimento);
		this.dataMatricula = LocalDate.now();
		this.numeroPlano = numeroPlano;	
	}
	
	

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}


	public List<Avaliacao> getAvaliacaoAluno() {
		return avaliacaoAluno;
	}
	
	public int getNumeroPlano() {
		return numeroPlano;
	}

	public int alterarPlano(int numeroPlano) {
		return this.numeroPlano = numeroPlano;
	}
	
	public void adicionaAvaliacaoAluno(Avaliacao avaliacao) {
		this.avaliacaoAluno.add(avaliacao);
	}
	
	public void exibirAvaliacaoAluno() {
		for (Avaliacao avaliacao : avaliacaoAluno) {
			System.out.println(avaliacao); 
		}
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\nData de Matricula: "+ dataMatricula + 
				"\n" + plano + 
				"\nAvaliações:" + avaliacaoAluno+
				"\n--------------------------";
	}
	
	
	public void setNumeroPlano(int numeroPlano) {
		this.numeroPlano = numeroPlano;
	}



	public String formatarArquivoAluno() {
		return super.getNome()+";"+super.getCpf()+";"+ super.getSenha()+";"+super.getDataNascimento()+";"+
				dataMatricula+";"+numeroPlano;
	}
}



