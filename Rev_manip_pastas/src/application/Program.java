package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		String path = "/home/uener/Área de Trabalho/bd.txt";
		
		List<String>list = new ArrayList<>();
		
		//Lendo arquivo e salvando em lista;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				list.add(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		// Criando pasta
		
		new File("/home/uener/Área de Trabalho/destiny").mkdir();
		
		// Escrevendo valores da lista em arquivo;
		
		String destPath = "/home/uener/Área de Trabalho/destiny/out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(destPath))){
			for(String x: list) {
				bw.write(x);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.getMessage();
		}
		
		
	}
}