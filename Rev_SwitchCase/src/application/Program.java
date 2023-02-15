package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Escolha um número: ");
		int n = sc.nextInt();
		String dia;

		switch (n) {

		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;
			
		case 3:
			dia = "Terça";
			break;
		
		case 4:
			dia =  "Quarta";
			break;
			
		case 5:
			dia = "Quinta";
			break;
			
		case 6:
			dia = "Sexta";
			break;
			
		case 7:
			dia = "Sábado";
			break;
			
			default:
				dia = "Valor inválido";
				break;
		}
		System.out.println("Dia escolhido: " + dia);
	}

}
