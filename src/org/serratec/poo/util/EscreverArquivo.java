package org.serratec.poo.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.serratec.poo.classes.Aluno;
import org.serratec.poo.classes.Avaliacao;
import org.serratec.poo.classes.Funcionario;
import org.serratec.poo.classes.Login;
import org.serratec.poo.classes.PersonalTrainer;

import org.serratec.poo.classes.Plano;

public class EscreverArquivo {
	
	
	public static void escreverArquivoAlunos(List<Aluno> alunos){
		
		try {
			 
	        BufferedWriter bw = new BufferedWriter(new FileWriter("ListaDeAlunos.txt"));
	        BufferedReader br = new BufferedReader(new FileReader("ListaDeAlunos.txt"));
			for (Aluno p : alunos) {
				    if(br.readLine() == null) {
	                bw.append(p.formatarArquivoAluno()+"\n");
				    }
	               	}
	        
			bw.flush();
            bw.close();
            br.close();
			
		}catch (IOException e){
			
			System.out.println("Erro pipii popopo");
		}
	}
	
	public static void escreverArquivoPlanos(List<Plano> planos) {
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ListaDePlanos.txt"));
            BufferedReader br = new BufferedReader(new FileReader("ListaDePlanos.txt"));

            for (Plano p : planos) {
                if(br.readLine() == null) {
                bw.append(p.formatarArquivoPlanos()+"\n");
                }
            }

            bw.flush();
            bw.close();
            br.close();

        }catch (IOException e){

            System.out.println("Erro pipii popopo");
        }
	}
	
	public static void escreverArquivoPersonal(List<PersonalTrainer> personal) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("ListaDePersonal.txt"));
            BufferedReader br = new BufferedReader(new FileReader("ListaDePersonal.txt"));
			
			for (PersonalTrainer p : personal) {
				 if(br.readLine() == null) {
				bw.append(p.formatarArquivoPersonal()+"\n");
				 }
			}
			bw.flush();
            bw.close();
            br.close();
			
		}catch (IOException e){
			
			System.out.println("Erro pipii popopo");
		}
	}

	public static void escreverArquivoFuncionarios(List<Funcionario> funcionarios) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("ListaDeFuncionarios.txt"));
            BufferedReader br = new BufferedReader(new FileReader("ListaDeFuncionarios.txt"));
			
            for (Funcionario p : funcionarios) {
				 if(br.readLine() == null) {
				bw.append(p.formatarArquivoFuncionario()+"\n");
				 }
			}
			
			bw.flush();
            bw.close();
            br.close();
			
		}catch (IOException e){
			
			System.out.println("Erro pipii popopo");
		}
	}


public static void escreverArquivoLogin(List<Login> login) {
	try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("ListaLogin.txt"));
        BufferedReader br = new BufferedReader(new FileReader("ListaLogin.txt"));
		
        for (Login p : login) {
			 if(br.readLine() == null) {
			bw.append(p.formatarArquivoLogin()+"\n");
			 }
		}
        bw.flush();
		bw.close();
        br.close();
		
	}catch (IOException e){
		
		System.out.println("Erro pipii popopo");
	}
}
public static void escreverArquivoAvaliacao(List<Avaliacao> avaliacao) {
	try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("ListaDeAvaliacao.txt"));
		
		for (Avaliacao p : avaliacao) {
			
			bw.append(p.formatarArquivoAvaliacao()+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}catch (IOException e){
		
		System.out.println("Erro pipii popopo");
	}
}
}
