package model.services;

public class CurrencyConverter {
	
	private double dollarPrice;
	private double amount;
	private static final double IOF = 0.06;
	
	 public static double converter(double dollarPrice, double amount) {
		 double parcial = dollarPrice * amount;
		 return parcial += parcial *IOF;
	 }

}
