package projetoIdades;

import java.util.Scanner;

public class IdadesSwitch {

	public static void main(String[] args) {
		int idade, faixa;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade: ");
		idade = sc.nextInt();
		
		if(idade > 18) {
			faixa = 3;
		}else if(idade > 12) {
			faixa = 2;
		}else {
			faixa = 1;
		}

		switch(faixa) {
		case 1:
			System.out.println("\nCriança!");
			break;
		case 2:
			System.out.println("\nAdolescente!");
			break;
		case 3:
			System.out.println("\nAdulto!");
			break;
		}
	}

}
