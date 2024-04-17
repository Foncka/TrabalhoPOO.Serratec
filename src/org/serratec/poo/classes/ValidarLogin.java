package org.serratec.poo.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidarLogin {

	public static String validaLoginAluno(String cpf,String senha) {
		
		String tipoPessoa=null;
	
		try {
		BufferedReader br = new BufferedReader( new FileReader("ListaDeAlunos.txt"));
		
		String linha;
		
		while(br.ready()) {
			
			linha = br.readLine();
			
			String separador[] = linha.split(";");

			
			String cpfLog = separador[1];
			String senhaLog = separador[2];
		
			
			if(cpf.equals(cpfLog) && senha.equals(senhaLog)) {
				System.out.println("leu aluno");
				tipoPessoa = "Aluno";
			}
		}
		
		br.close();
		
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
		 
		return tipoPessoa;
	}

	@SuppressWarnings("resource")
	public static String validaLoginPersonal(String cpf,String senha) {
		
		String tipoPessoa=null;
		try {
		BufferedReader br = new BufferedReader( new FileReader("ListaDePersonal.txt"));
		String linha;
		
		linha = br.readLine();
		
		while(br.ready()) {
			
			String separador [] = linha.split(";");
			
			String cpfLog = separador[1];
			String senhaLog = separador[2];
			
			if(cpf.equals(cpfLog) && senha.equals(senhaLog)) {
				tipoPessoa ="Personal";
			}		
		}
		
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
		return tipoPessoa;
	}

	@SuppressWarnings("resource")
	public static String validaLoginFuncionario(String cpf, String senha) {
		
		String tipoPessoa=null;
		try {
		BufferedReader br = new BufferedReader( new FileReader("ListaDeFuncionario.txt"));
		String linha;
		
		linha = br.readLine();
		
		while(br.ready()) {
			
			String separador [] = linha.split(";");
			String cpfLog = separador[1];
			String senhaLog = separador[2];
			
			if(cpf.equals(cpfLog) && senha.equals(senhaLog)) {
				tipoPessoa ="Funcionario";
			}		
		}
		
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
		return tipoPessoa;
	}
}
