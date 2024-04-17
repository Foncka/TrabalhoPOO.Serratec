package org.serratec.poo.util;

import java.util.Scanner;

import org.serratec.poo.classes.Login;

public class Menu {
	
	static Cadastro cadastro=new Cadastro();
	static int opcao = 1;
	static boolean continua = true;
	static Scanner leia = new Scanner(System.in);
	static Login loginAtual;
	
	
	public static void menuPessoa(Login login1) {
		
		int menu=login1.getTipoconta();
			loginAtual = login1;
			if(menu == 1){		
			 Menu.menuAluno();
			}else if(menu==2){
			Menu.menuPersonal();
			} else if(menu==3){
			Menu.menuFuncionario();
			}
		
	}
			
	public static void menuAluno() {
		
		while(opcao!=0) {
			System.out.println( """
					----------- MENU -----------
					Oque deseja fazer?
					[1] - Visualizar dados pessoais e plano contratado
					[2] - Solicitar agendamento de horário com personal trainer
					[3] - Visualizar histórico de agendamentos.
					[4] - Cancelar agendamento
					[5] - Visualizar avaliações físicas.
					[O] - Logout
		
								""");
			
			opcao = leia.nextInt();
			
			
		
		switch(opcao){
					
		case 1 :
			AdministracaoAluno.dadosAlunos(loginAtual);
			break;
			
		case 2 :
			Cadastro.criarAvalicao();
			break;
		
		case 3 :
			break;		
			
		case 4 :
			break;
		
		case 5 :
			break;
			
		default:
			System.out.println("Numero Invalido");
		}

	}while(continua);
	leia.close();
}
		
	public static void menuPersonal() {
		
		
	
		while(opcao!=0){
		System.out.println("""
				----------- MENU -----------
				Oque deseja fazer?
				[1] - Visualizar agenda de atendimentos.
				[2] - Registrar avaliações físicas dos alunos.
				[3] - Visualizar lista de avaliações realizadas.
				[O] - Logout
								
							""");
		
		opcao = leia.nextInt();
		
		
		switch(opcao){
				
		case 1:
			Emitir.visualizarAgendaAtendimentos(Cadastro.todasAvaliacoes);
			break;
		
		case 2:
			Cadastro.criarAvalicao();
			break;
							
		case 3:
			break;	
		
		default:
			System.out.println("Numero Invalido");
			
		}
		
	}
	leia.close();	
}

	public static void menuFuncionario() {
		
		while(opcao!=0){
			System.out.println("""
				----------- MENU -----------
				Oque deseja fazer?
				[1] - Cadastrar novo plano
				[2] - Cadastrar novo aluno
				[3] - Cadastrar novo Personal Trainer
				[4] - Emitir relatório de planos
				[5] - Emitir relatório de alunos
				[6] - Emitir relatório de equipe (funcionários e personal trainers)
				[7] - Emitir relação de avaliações físicas por período
				[O] - Logout
						""");
			opcao = leia.nextInt();
						
		switch(opcao){
		
		case 1:
			Cadastro.cadastraPlano();
			break;	
			
		case 2:
			Cadastro.cadastraAluno();
			break;	
			
		case 3:
			Cadastro.cadastraPersonal();
			break;
			
		 case 4:
			Emitir.relatorioPlanos(Cadastro.todosPlanos);
			break;
	        
		case 5:
			Emitir.relatorioAluno(Cadastro.todosAlunos);
			break;
			
		case 6:
			Emitir.relatorioPersonal(Cadastro.todosPersonal);
			break;	
			
		case 7:
			//[7] - Emitir relação de avaliações físicas por período
			break;	
			
		default:
			System.out.println("Numero Invalido");
			break;
		}
		
	}
	leia.close();
}	
	
}


