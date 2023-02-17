package application;

public class Program {

	public static void main(String[] args) {
		
		String str = "abcde FGHIJ ABC abc DEFG    ";
		String names = "Potato apple corn";
		
		String s01 = str.toLowerCase();         // Passa tudo pra minúscula
		String s02 = str.toUpperCase();			// Passa tudo pra maiúscula
		String s03 = str.trim();				// Porta espaços excedentes
		String s04 = str.substring(6);			// Recorta caracteres iniciais
		String s05 = str.substring(6, 10);		// Recorta caracteres dentro de 
		String s06 = str.replace('a', 'x');		// Substitui caracteres
		String s07 = str.replace("abc", "xxx");	// Substitui trechos
		int i = str.indexOf("bc");				// Posição de trechos
		int j = str.lastIndexOf("bc");			// Última posição de trecho
		
		String[] vect = names.split(" ");		// Recorta baseado em espaço
		String name = vect[0];
		String surName = vect[1];
		String lastName = vect[2];
		
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println(i);
		System.out.println(j);
		System.out.println(name + surName + lastName);
		

	}

}
