package org.serratec.poo.util;

import java.util.Scanner;

import org.serratec.poo.classes.Login;

public class Menu {
	
	static Cadastro cadastro=new Cadastro();
	static int opcao = 0;
	static boolean continua = true;
	
	
	public static void menuInicial() {
		Scanner leia = new Scanner(System.in);
		
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
		Scanner leia = new Scanner(System.in);
		do {
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
			
			if(leia.hasNextInt()){
				opcao = leia.nextInt();
					}else {
						opcao = -1;
					}
		
		switch(opcao){
		case 0 :
			continua=false;
			break;
			
		case 1 :
			
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
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("""
				----------- MENU -----------
				Oque deseja fazer?
				[1] - Visualizar agenda de atendimentos.
				[2] - Registrar avaliações físicas dos alunos.
				[3] - Visualizar lista de avaliações realizadas.
				[O] - Logout
								
							""");
		
		opcao = leia.nextInt();
		
		if(leia.hasNextInt()){
			opcao = leia.nextInt();
				}else {
					opcao = -1;
				}
		switch(opcao){
		
		case 0:
			continua=false;
			break;
		
		case 1:
			
			break;
		
		case 2:
			
			break;
		
		case 3:
			
			break;	
		
		default:
			System.out.println("Numero Invalido");
			
		}
		
	}while(continua);
	leia.close();	
}

	public static void menuFuncionario() {
		
		Scanner leia = new Scanner(System.in);
		
		do{
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
		
		if(leia.hasNextInt()){
			opcao = leia.nextInt();
			}else {
				opcao = -1;
			}
			
		switch(opcao){
		
		case 0:
			continua = false;
			break;
		
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
	        
	        break;
	        
		case 5:
			
			break;
			
		case 6:
		
			break;	
			
		case 7:
		
			break;	
			
		default:
			System.out.println("Numero Invalido");
			
		}
		 			
			
		
	}while (continua);
		
		leia.close();
}	
	
}


