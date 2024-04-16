package org.serratec.poo.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Aluno;
import org.serratec.poo.classes.Avaliacao;
import org.serratec.poo.classes.Funcionario;
import org.serratec.poo.classes.Login;
import org.serratec.poo.classes.PersonalTrainer;
import org.serratec.poo.classes.Plano;

public class LeitorArquivo {
	
	public static void lerArquivoLogin(List<Login> login) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("ListaLogin.txt"));
			
			String linha;
			
			while(br.ready()) {
				linha = br.readLine();
				String [] partes = linha.split(";");
				String cpf = partes[0];
				String senha = partes[1];
				int tipoConta = Integer.parseInt(partes[2]);
				
				Login login1 = new Login(cpf,senha,tipoConta);
				login.add(login1);
			}
			br.close();
			
			}catch(FileNotFoundException e){
			
			System.out.println("Erro acessar aquivo: " + e.getMessage() );
			
		
			}catch(IOException e){
				
				System.out.println("Erro acessar aquivo"+ e.getMessage());
			}
				
	}

	public static void lerRelatorioPlanos(List<Plano> planos) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("ListaDePlanos.txt"));
			
			String linha;
			while(br.ready()) {
				
				linha = br.readLine();
				
				String[] separador = linha.split(",");
				
				String nome = separador[0];
				String duracao = separador[1];
				String descricao = separador[2];
				double valor = Double.parseDouble(separador[3]);
				
				planos.add(new Plano(nome,duracao,descricao,valor));
			}
			br.close();
		}catch(IOException e) {
			System.out.println();
		}
	}
	
	public static void lerRelatorioAlunos(List<Aluno> alunos) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("ListaDeAlunos.txt"));
			String linha;
			while(br.ready()) {
				
				linha = br.readLine();
				
				String[] separador = linha.split(";");
				
				String nome= separador[0];
				String cpf = separador[1];
				String senha = separador[2];
				String nascimento =separador[3];
				int numeroPlano = Integer.parseInt(separador[5]);
				
				
				
				alunos.add(new Aluno(nome,cpf,senha,nascimento,numeroPlano));
			}
			br.close();
		}catch(IOException e) {
			System.out.println();
		}
		
	}
	
		
		
	
	public static void lerRelatorioPersonal(List<PersonalTrainer> personal) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("ListaDePersonal.txt"));
			
			String linha;
			while(br.ready()) {
				
				linha = br.readLine();
				
				String[] separador = linha.split(";");
				
				String nome= separador[0];
				String cpf = separador[1];
				String senha = separador[2];
				String cref = separador[3];
				String nascimento = separador[4];
				
							
				
				personal.add(new PersonalTrainer(nome,cpf,senha,cref,nascimento));
			}
			br.close();
		}catch(IOException e) {
			System.out.println();
		}
		
	}
	

	public static void lerArquivoAvalicao(List<Avaliacao> todasAvaliacoes) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("ListaDeAvaliacao.txt"));
			String linha;
			while(br.ready()) {
				
				linha = br.readLine();
				
				String[] separador = linha.split(";");
							
				String alunoAvalicao = separador[0];
				String personalAvalicao = separador[1];
				String dataHoraAvalicao = separador [2];
				String descricaoAvaliacao = separador[3];
				List<Login> agendamento;
				
				//agendamento.add(new Agendamento(alunoAvalicao, personalAvalicao, dataHoraAvalicao));
				
				//todasAvaliacoes.add(new Avaliacao(descricaoAvaliacao,agendamento));
				
			}
			br.close();
		}catch(IOException e) {
			System.out.println();
		}
		
	}
	
	public static void lerRelatorioFuncionario(List<Funcionario> funcionarios) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("ListaFuncionarios.txt"));
			String linha;
			while(br.ready()) {
				
				linha = br.readLine();
				
				String[] separador = linha.split(";");
				String nome= separador[0];
				String cpf=separador[1];
				String senha = separador[3];
				String dataNascimento= separador[4];
				String cargo= separador[5];
				funcionarios.add(new Funcionario(nome,cpf,senha,dataNascimento,cargo));
			}
			br.close();
		}catch(IOException e) {
			System.out.println();
		}
	}

}
	
	
