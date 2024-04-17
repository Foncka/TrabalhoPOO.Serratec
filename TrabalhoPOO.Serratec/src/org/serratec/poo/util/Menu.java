package org.serratec.poo.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.serratec.poo.classes.Login;

public class Menu {
	
	static Cadastro cadastro=new Cadastro();
	static int opcao = 1;
	static boolean continua = true;
	static Scanner leia = new Scanner(System.in);
	
	public static void menuInicial() {
		
		
		do {
		System.out.println("-----------Login-----------"+"\nCPF: ");
		String cpf= leia.nextLine();
		
		System.out.println("Senha: ");
		String senha=leia.nextLine();
				
		} while (continua);
		leia.close();
	}
	
	public static void menuPessoa(Login login1) {
		
		int menu=login1.getTipoconta();
	
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
			opcao = 10;
			break;
			
		case 2 :
			Cadastro.criarAvalicao();
			opcao = 10;
			break;
		
		case 3 :
			opcao = 10;
			break;		
			
		case 4 :
			opcao = 10;
			break;
		
		case 5 :
			opcao = 10;
			break;
			
		case 0:
			System.out.println("Programa Encerrado");
			opcao = 0;
			break;
		
		default:
			System.out.println("Numero Invalido");
			break;
		
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
			opcao = 10;
			break;
		
		case 2:
			opcao = 10;
			break;
		
		case 3:
			opcao = 10;
			break;	
		
			
		case 0:
			System.out.println("Numero Invalido");
			opcao = 0;
			break;
		
		default:
			System.out.println("Programa Encerrado");
			break;
		
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
			opcao = 10;
			break;	
			
		case 2:
			Cadastro.cadastraAluno();
			opcao = 10;
			break;	
			
		case 3:
			Cadastro.cadastraPersonal();
			opcao = 10;
			break;
			
		 case 4:
			Emitir.relatorioPlanos(Cadastro.todosPlanos);
			opcao = 10;
			break;
	        
		case 5:
			Emitir.relatorioAluno(Cadastro.todosAlunos);
			opcao = 10;
			break;
			
		case 6:
			Emitir.relatorioPersonal(Cadastro.todosPersonal);
			opcao = 10;
			break;	
			
		case 7:
			//[7] - Emitir relação de avaliações físicas por período
			break;	
		case 0:
			System.out.println("Programa Encerrado");
			opcao = 0;
			break;
		
		default:
			System.out.println("Numero Invalido");
			break;
		}
		 			
			
		
	}
	leia.close();
}	
	
}


