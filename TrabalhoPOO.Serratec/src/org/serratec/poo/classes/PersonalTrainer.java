package org.serratec.poo.classes;

public class PersonalTrainer extends Pessoa {
	private String especialiadade;
	private String cref;
	private String horaAtendimento;
	
	public PersonalTrainer(String nome, String cpf, String senha, String cref, String dataNascimento) {
		super(nome, cpf, senha, dataNascimento);
		this.cref = cref;
	}

	public String getEspecialiadade() {
		return especialiadade;
	}

	public String getCref() {
		return cref;
	}

	public String getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setEspecialiadade(String especialiadade) {
		this.especialiadade = especialiadade;
	}

	public void setHoraAtendimento(String horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}

	@Override
	public String toString() {
		return super.toString()+"\nEspecialiadade: " + especialiadade + 
				"\nCREF: " + cref + 
				"\nHoraio de Atendimento: "+ horaAtendimento + 
				"\n--------------------------";
	} 
	
	
	public String formatarArquivoPersonal() {
		return super.getNome()+";"+super.getCpf()+";"+ super.getSenha()+";"+cref+";"+super.getDataNascimento()+
				";"+ especialiadade;
	}
}
