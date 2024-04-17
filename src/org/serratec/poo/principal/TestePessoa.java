package org.serratec.poo.principal;

import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Agendamento;
import org.serratec.poo.classes.Avaliacao;
import org.serratec.poo.classes.Login;
import org.serratec.poo.util.EscreverArquivo;
import org.serratec.poo.util.Menu;

public class TestePessoa  {
	public static void main(String[] args) {
	
	Login login = new Login(null,null,0);
	login = Login.loginAgora();
	Menu.menuPessoa(login);
	
	
	
	//List<Avaliacao> avaliacao = new ArrayList<>();
	//Agendamento agendamento = new Agendamento("Aluno", "Personal", "22/10/2024 - 20:21");
	//avaliacao.add(new Avaliacao("descrição", agendamento));
	//EscreverArquivo.escreverArquivoAvaliacao(avaliacao);
	
		
	}
}