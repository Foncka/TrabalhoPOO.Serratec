package org.serratec.poo.classes;

public class Funcionario extends Pessoa{
	private String cargo;

	public Funcionario(String nome, String cpf, String senha, String cargo, String dataNascimento ) {
		super(nome, cpf, senha, dataNascimento);
		this.cargo = cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCargo() {
		return cargo;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCargo: " + cargo+
				"\n--------------------------";
	}
	
	
	public String formatarArquivoFuncionario() {
		return super.getNome() + ";" + super.getCpf() + ";" + super.getSenha() + ";" + cargo + ";" + super.getDataNascimento();
	}
}
