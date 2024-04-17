package org.serratec.poo.classes;

import java.time.LocalDateTime;

public class Agendamento {
	
	private Aluno aluno;
	private PersonalTrainer personal;
	private LocalDateTime dataHora;
	//private List<Avaliacao> avaliacao;
	private boolean status = true;
	
	public Agendamento(Aluno aluno, PersonalTrainer personal, LocalDateTime dataHora) {
		
		this.aluno = aluno;
		this.personal = personal;
		this.dataHora = dataHora;
		
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//Getters
	public boolean isStatus() {
		return status;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public PersonalTrainer getPersonal() {
		return personal;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}
	
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	public void adicionaAvaliacao() {
		
	}
	
	
	public String toString() {
		return "\nAluno: " + aluno + ""
				+ "\nPersonal: " + personal 
				+ "\nData e Horário: " + dataHora
				+ "\nStatus:" + status;
	}

	
	//---REAVALIAR ESSE METODO---
	public void remarcarDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
		
	}
	
	////Metodo para verificar status agendamento
	public String verificaStatus() {
		return (status)?"Confirmado" :"Desmarcado";
	}
}
