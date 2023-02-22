package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// Lendo arquivo de origem e salvando em uma lista
		
		String sourcePath = "/home/uener/Área de Trabalho/bd.txt";

		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
			String line = br.readLine();
			
			while (line != null) {
				list.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 

		// Lendo lista e salvando em arquivo.
		
		String destinyPath = "/home/uener/Área de Trabalho/out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(destinyPath))) {
			for (String c : list) {
				bw.write(c);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
