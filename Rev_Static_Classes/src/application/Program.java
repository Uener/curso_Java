package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		double paid = CurrencyConverter.converter(price, quantity);

		System.out.println("Total to be paid: " + paid );
	}

}
