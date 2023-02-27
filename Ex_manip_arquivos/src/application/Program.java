package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		String strPath = "/home/uener/Área de Trabalho/in.txt";
		
		List<Product>list = new ArrayList<>();
		
		Product prod;
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String[]vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer quantity = Integer.parseInt(vect[2]);
				
				list.add(new Product(name, price, quantity));
				line = br.readLine();
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		for (Product x : list) {
			System.out.println(x);
		}
		
	}
}
