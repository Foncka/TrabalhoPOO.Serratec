package org.serratec.poo.classes;

public class Avaliacao{

	
	
	private String descricao;
	private Agendamento agendamento;
	
	public Avaliacao(String descricao, Agendamento agendamento) {
		this.descricao = descricao;
		this.agendamento = agendamento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void cadastrarAgendamento() {
		
	}
	

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public String formatarArquivoAvaliacao() {
		return agendamento.formatarArquivoAgendamento() + ";" + descricao;
	}

	@Override
	public String toString() {
		return "Avaliacao [descricao=" + descricao + ", agendamento=" + agendamento + "]";
	}

	

	
	

	
}
