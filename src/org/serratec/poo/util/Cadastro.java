package org.serratec.poo.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalQuery;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import org.serratec.poo.classes.Agendamento;
import org.serratec.poo.classes.Aluno;
import org.serratec.poo.classes.Avaliacao;
import org.serratec.poo.classes.Funcionario;
import org.serratec.poo.classes.Login;
import org.serratec.poo.classes.PersonalTrainer;
import org.serratec.poo.classes.Plano;


public class Cadastro {
	static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	static LocalDate dataMatricula;
	static String nome;
	static String cpf;
	static String dataNascimento;
	static String contato;
	static String senha;
	static String especialiadade;
	static String cref;
	static String horaAtendimento;
	static int cont=0;
	static String duracao;
	static String descricao;
	static double valor;
	public static List<Plano> todosPlanos= new ArrayList<>();
	public static List<PersonalTrainer> todosPersonal = new ArrayList<>();
	public static List<Aluno> todosAlunos = new ArrayList<>();
	public static List<Login> todosLogin = new ArrayList<>();
	public static List<Funcionario> todosFuncionarios = new ArrayList<>();
	static Plano planos;
	static Scanner leia = new Scanner(System.in);
	
	public static void cadastraPersonal(){
		
		System.out.println("Digite o Nome:");
		nome=leia.nextLine();
		
		System.out.println("Digite o CPF:");
		cpf=leia.nextLine();
		
		System.out.println("Digite a Data de Nascimento(dd/MM/yyyy):");
		dataNascimento=leia.nextLine();
				
		System.out.println("Digite o Contato:");
		contato=leia.nextLine();
		
		System.out.println("Digite a senha:");
		senha=leia.nextLine();
		
		System.out.println("Digite a especialidade:");
		especialiadade=leia.nextLine();
		
		System.out.println("Digite a CREF:");
		cref=leia.nextLine();
		
		System.out.println("Digite a Hora de Atendimento:");
		horaAtendimento=leia.nextLine();
		
		PersonalTrainer personal = new PersonalTrainer(nome, cpf, senha, cref, dataNascimento);
		
		personal.setEspecialiadade(especialiadade);
		
		personal.setContato(contato);
		
		personal.setHoraAtendimento(horaAtendimento);
		
		Login login = new Login(cpf,senha,2);
		
		todosLogin.add(login);
		
		todosPersonal.add(personal);
		
		EscreverArquivo.escreverArquivoLogin(todosLogin);
		EscreverArquivo.escreverArquivoPersonal(todosPersonal);
			
		}

	public static void cadastraAluno(){
		
		System.out.println("Digite o Nome:");
		nome=leia.nextLine();
		
		System.out.println("Digite o CPF:");
		cpf=leia.nextLine();
		
		System.out.println("Digite a Data de Nascimento:");
		dataNascimento=leia.nextLine();
		
		System.out.println("Digite o Contato:");
		contato=leia.nextLine();
		
		System.out.println("Digite a senha:");
		senha=leia.nextLine();
		
		System.out.println("Escolha um plano:");
		
		for(Plano plano : todosPlanos){
		
		System.out.print((cont+1)+" - Plano:\n"+todosPlanos.get(cont)+"\n\n");
		cont++;
		}
		cont=0;
		cont=leia.nextInt();
		cont--;
		
		Aluno aluno = new Aluno(nome, cpf, senha, dataNascimento,cont);
		todosAlunos.add(aluno);
		Login login = new Login(cpf,senha,3);
		todosLogin.add(login);
		EscreverArquivo.escreverArquivoLogin(todosLogin);
		EscreverArquivo.escreverArquivoAlunos(todosAlunos);
		}

	
	public static void cadastraPlano(){
				
		System.out.println("Digite o Nome do Plano: ");
		nome=leia.nextLine();
		
		System.out.println("Digite a duração: ");
		duracao=leia.nextLine();
		
		System.out.println("Digite a descricao do plano: ");
		descricao=leia.nextLine();
		
		System.out.println("Digite o valor do plano: ");
		valor=leia.nextDouble();
		leia.nextLine();
		Plano plano= new Plano(nome,duracao,descricao,valor);
		todosPlanos.add(plano);
		
		EscreverArquivo.escreverArquivoPlanos(todosPlanos);
		}

	static List<Avaliacao> todasAvaliacoes = new ArrayList<>();

	public static void criarAvalicao () {
			
			System.out.println("Informe o nome aluno: ");
			String alunoAvalicao=leia.nextLine();
			
			System.out.println("Informe Personal Trainer: ");
			String personalAvalicao=leia.nextLine();
			
			System.out.println("Informa a data e a hora: ");
			String dataHoraAvalicao=leia.nextLine();
			
			System.out.println("Qual o tipo da avaliação: ");
			String descricaoAvaliacao=leia.nextLine();
			
			//Agendamento agendamento = new Agendamento(alunoAvalicao, personalAvalicao, dataHoraAvalicao);
			
			//todasAvaliacoes.add (new Avaliacao(descricaoAvaliacao, agendamento));
			
			//LeitorArquivo.lerArquivoAvalicao(todasAvaliacoes);
			//EscreverArquivo.escreverArquivoAvaliacao(todasAvaliacoes);
			
		}
	
}
