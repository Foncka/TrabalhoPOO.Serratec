package org.serratec.poo.util;

import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Aluno;
import org.serratec.poo.classes.Funcionario;
import org.serratec.poo.classes.PersonalTrainer;
import org.serratec.poo.classes.Plano;

public class Emitir {
	
	
	public void relatorioPlanos(List<Plano> planos) {
		if (planos == null) {
		
			System.out.println("Não existe planos cadastrados.");
			return;
		}
		System.out.println("Relatório de Planos:");
        for (Plano plano : planos) {
            System.out.println(plano.toString()); }
            
            
        }
        public void relatorioAluno(List<Aluno> todosAlunos) {
    		if (todosAlunos == null) {
    		
    			System.out.println("Não existe planos cadastrados.");
    			return;
    		}
    		System.out.println("Relatório de Alunos:");
            
			for (Aluno aluno : todosAlunos) {
                System.out.println(aluno.toString());
     
	}
	
        }
        public void relatorioPersonal(List<PersonalTrainer> todosPersonal) {
    		if (todosPersonal == null) {
    		
    			System.out.println("Não existe Equipe.");
    			return;
    		}
    		System.out.println("Relatório de Personal Trainer:");
            
			for (PersonalTrainer personal : todosPersonal) {
                System.out.println(personal.toString());
   }
   }
	public void relatorioFuncionario(List<Funcionario> todosFuncionarios) {
		    		if (todosFuncionarios == null) {
		    		
		    			System.out.println("Não existe Equipe.");
		    			return;
		    		}
		    		System.out.println("Relatório de Funcionarios:");
		            
					for (Funcionario funcionario : todosFuncionarios) {
		                System.out.println(funcionario.toString());
   }
}
}

