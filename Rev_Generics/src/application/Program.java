package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values: ");
		int number = sc.nextInt();
		
		for(int i = 0; i<number; i++) {
			ps.addValue(sc.next());
		}

		ps.print();
		System.out.println("\nFrist: " + ps.first());
		
	}

}
