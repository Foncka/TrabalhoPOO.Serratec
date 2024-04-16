package org.serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao{
	//private Aluno aluno;
	//private PersonalTrainer personal;
	//private LocalDateTime data;
	private List<Agendamento> agendamento = new ArrayList<>();
	private String descricao;
	
	public Avaliacao(String descricao) {
		
		//this.aluno = aluno;
		//this.personal = personal;
		//this.data = data;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void cadastrarAgendamento() {
		
	}
	//public Aluno getAluno() {
	//	return aluno;
	//}

	//public PersonalTrainer getPersonal() {
	//	return personal;
	//}

	//public LocalDateTime getData() {
	//	return data;
	//}

	/*
	@Override
	public String toString() {
		return "\nAluno: " + aluno + 
				"\nPersonal: " + personal + 
				"\nData: " + data + 
				"\nDescricao: " + descricao;
	}
	*/
	
}
