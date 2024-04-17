package org.serratec.poo.util;

import java.util.Scanner;

public class MenuIniciar {
	public static void MenuIniciarAluno() {
		boolean continua = true; 
		Scanner leia = new Scanner(System.in);
		
		do {
			Menu.menuAluno();

			int opcao = leia.nextInt();
			
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
			
			break;
		
		case 3 :
		
			break;		
			
		case 4 :
		
			break;
		
		case 5 :
		
			break;
	
		default:
			System.out.println("Numero Invalido");
			leia.next();
		}
	}while(continua);
		leia.close();
	}
}
