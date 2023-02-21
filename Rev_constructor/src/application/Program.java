package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		if(resp == 'n') {
			acc = new Account(number, holder);
		}
		else if(resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			acc = new Account(number, holder, amount);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(acc);

		System.out.print("\nEnter a deposit value: ");
		double amount = sc.nextDouble();
		acc.deposit(amount);
		System.out.println(acc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		acc.whitdraw(amount);
		System.out.println(acc);
	}

}
