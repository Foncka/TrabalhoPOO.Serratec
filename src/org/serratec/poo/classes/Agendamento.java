package org.serratec.poo.classes;

import java.time.LocalDateTime;

public class Agendamento {
	
	private String aluno;
	private String personal;
	private String dataHora;
	//private List<Avaliacao> avaliacao;
	private boolean status = true;
	
	public Agendamento(String aluno, String personal, String dataHora) {
		
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
	
	public String getAluno() {
		return aluno;
	}

	public String getPersonal() {
		return personal;
	}

	public String getDataHora() {
		return dataHora;
	}
	
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	
	public void adicionaAvaliacao() {
		
	}
	
	//rertiramos status.
	public String toString() {
		return "\nAluno: " + aluno + ""
				+ "\nPersonal: " + personal 
				+ "\nData e Horário: " + dataHora;
	}

	
	//---REAVALIAR ESSE METODO---
	public void remarcarDataHora(String dataHora) {
		this.dataHora = dataHora;
		
	}
	
	////Metodo para verificar status agendamento
	public String verificaStatus() {
		return (status)?"Confirmado" :"Desmarcado";
	}
	
	public String formatarArquivoAgendamento() {
		return aluno + ";" + personal + ";" + dataHora;
	}
	
		
}
