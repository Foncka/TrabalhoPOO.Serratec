package org.serratec.poo.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.poo.util.EscreverArquivo;
import org.serratec.poo.util.LeitorArquivo;
import org.serratec.poo.util.Menu;

public class Login {
	
	private String cpfLogin;
	private String senhaLogin;
	private static String tipoConta;
	private static boolean valida = false;
	private String getCpfLogin;
	public Login(String cpfLogin, String senhaLogin, String tipoConta) {
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
	
	public String getTipoconta() {
		return tipoConta;
	}
	public void setSenhaLogin(String senhaLogin) {
		this.senhaLogin = senhaLogin;
	}
	
	public void leitorArquivoLogin(Pessoa pessoa) {
		
	}
	
	public static void loginAgora(){
		
		Scanner leia = new Scanner(System.in);
		String cpf;
		String senha;
		boolean continua = true;
		
		while(continua) {
			
			
		System.out.println("Digite o CPF:");
		cpf=leia.nextLine();
		
		System.out.println("Digite senha:");
		senha=leia.nextLine();
		
		String loginAluno = ValidarLogin.validaLoginAluno(cpf, senha);
		String loginPersonal = ValidarLogin.validaLoginPersonal(cpf, senha);
		String loginFunc = ValidarLogin.validaLoginFuncionario(cpf, senha);
		
		if(loginAluno.equals("Aluno")) {
			Menu.menuAluno();
			continua = false;	
			
			}else if (loginPersonal.equals("Personal")) {
				Menu.menuPersonal();
				continua = false;		
				
				}else if (loginFunc.equals("Funcionario")) {
					Menu.menuFuncionario();
					continua = false;							
					
					}else {
						System.out.println("Login e/ou senha invalido");
					}
		}
		leia.close();
	
	
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
		return "Login [cpfLogin=" + cpfLogin + ", senhaLogin=" + senhaLogin + ", tipoConta=" + tipoConta + "]";
	}
	public CharSequence formatarArquivoLogin() {
		return cpfLogin + ";"+ senhaLogin +";"+ tipoConta;
		}

	
	

	
}
