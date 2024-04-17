package org.serratec.poo.classes;

public class Agendamento {
	
	private String aluno;
	private String personal;
	private String dataHora;
	private boolean status = true;
	
	public Agendamento(String alunoAvalicao, String personalAvalicao, String dataHoraAvalicao) {
		
		this.aluno = alunoAvalicao;
		this.personal = personalAvalicao;
		this.dataHora = dataHoraAvalicao;
		
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
	
	
	public String toString() {
		return "\nAluno: " + aluno + ""
				+ "\nPersonal: " + personal 
				+ "\nData e Horário: " + dataHora;
				
	}

	
	public void remarcarDataHora(String dataHora) {
		this.dataHora = dataHora;
		
	}
	
	public String verificaStatus() {
		return (status)?"Confirmado" :"Desmarcado";
	}
	
	public String formatarArquivoAgendamento() {
		return aluno + ";" + personal + ";" + dataHora;
	}
}
