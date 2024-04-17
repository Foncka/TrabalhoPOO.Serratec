package org.serratec.poo.principal;

import org.serratec.poo.classes.Login;
import org.serratec.poo.util.Menu;

public class TestePessoa  {
	public static void main(String[] args) {
	
	Login login = new Login(null,null,0);
	login = Login.loginAgora();
	Menu.menuPessoa(login);
	
	}
}