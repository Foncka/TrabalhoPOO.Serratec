package org.serratec.poo.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.poo.util.Cadastro;
import org.serratec.poo.util.EscreverArquivo;
import org.serratec.poo.util.LeitorArquivo;
import org.serratec.poo.util.Menu;

public class Login {
	
	private String cpfLogin;
	private String senhaLogin;
	private int tipoConta;
	private  boolean valida = false;
	
	public Login(String cpfLogin, String senhaLogin, int tipoConta) {
		this.cpfLogin = cpfLogin;
		this.senhaLogin = senhaLogin;
		this.tipoConta = tipoConta;
	}
	
	public String getCpfLogin() {
		return cpfLogin;
	}
	public void setCpfLogin(String cpfLogin) {
		this.cpfLogin = cpfLogin;
	}
	public String getSenhaLogin() {
		return senhaLogin;
	}
	
	public int getTipoconta() {
		return tipoConta;
	}
	public void setSenhaLogin(String senhaLogin) {
		this.senhaLogin = senhaLogin;
	}
	
	public void leitorArquivoLogin(Pessoa pessoa) {
		
	}
	

	public static Login loginAgora(){
		
		LeitorArquivo.lerRelatorioPlanos(Cadastro.todosPlanos);
        LeitorArquivo.lerRelatorioAlunos(Cadastro.todosAlunos);
        LeitorArquivo.lerRelatorioPersonal(Cadastro.todosPersonal);
        LeitorArquivo.lerRelatorioFuncionario(Cadastro.todosFuncionarios);
        EscreverArquivo.escreverArquivoPlanos(Cadastro.todosPlanos);
        EscreverArquivo.escreverArquivoAlunos(Cadastro.todosAlunos);
        EscreverArquivo.escreverArquivoPersonal(Cadastro.todosPersonal);
        EscreverArquivo.escreverArquivoFuncionarios(Cadastro.todosFuncionarios);
		
        
        Scanner leia = new Scanner(System.in);
		String cpf;
		String senha = null;
		String validador;
		boolean valida = false;
		Login login = new Login(null,null,0);
		List<Login> todosLogin = new ArrayList<>();
			
		LeitorArquivo.lerArquivoLogin(todosLogin);
					
					
					do {
						
					{
						
						System.out.println("Digite o CPF:");
						cpf=leia.nextLine();
													
						for(Login login1 : todosLogin) 
						{
						validador=login1.getCpfLogin();				
						if(cpf.equals(validador))
							{
							System.out.println("CPF valido");
							senha=login1.getSenhaLogin();
							login=login1;
							valida = true;
							break;
							}
						
						}
							if(valida!=true){
							System.out.println("CPF INVALIDO");
							}
						
					}
					
					}while(valida!=true);
					
										
					valida=false;
					
					do {
					System.out.println("Digite senha:");
					String validaSenha=leia.nextLine();
					if(validaSenha.equals(senha)) {
						valida=true;
					}else 	{
						System.out.println("Senha errada!");
							}
					}while(valida!=true);
					
					System.out.println(login);

					return (login);
	
		
	}
	
	public Login escreveLogin(List<Login> listaLog) {
		
		try {
		
			BufferedWriter bw = new BufferedWriter(new FileWriter("ListaLogin.txt"));
			
			for (Login login : listaLog) {
				
				bw.append(login.getCpfLogin());
				bw.append(login.getSenhaLogin());
			}
						
			bw.close();
			
		}catch (IOException e){
			
			System.out.println("Erro pipii popopo");
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "Login \n CPF: " + cpfLogin + " Senha: " + senhaLogin + " Função:" + tipoConta;
	}
	public CharSequence formatarArquivoLogin() {
		return cpfLogin + ";"+ senhaLogin +";"+ tipoConta;
		}

	
	

	
}
