package org.serratec.poo.util;

import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Aluno;
import org.serratec.poo.classes.Login;
import org.serratec.poo.classes.Plano;

public class AdministracaoAluno {
	/*
	[1] - Visualizar dados pessoais e plano contratado
	[2] - Solicitar agendamento de horário com personal trainer
	[3] - Visualizar histórico de agendamentos.
	[4] - Cancelar agendamento
	[5] - Visualizar avaliações físicas.
	[O] - Logout*/
	
	
	public static Aluno dadosAlunos(Login login) {
		String cpf;
		String senha;
		cpf=login.getCpfLogin();
		senha=login.getSenhaLogin();
		Aluno aluno1 = new Aluno("", "", "", "", 0);
		
		
		for(Aluno aluno : Cadastro.todosAlunos) {
			System.out.println("oiii");
			String senhaAluno=aluno.getSenha();
			String cpfAluno=aluno.getCpf();
			if((cpf.equals(cpfAluno)) && (senha.equals(senhaAluno))) 
			{
			aluno1=aluno;
			System.out.println(aluno);
			}
			
		}
		return (aluno1);
		
}	
	

}
