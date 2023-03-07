package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<LogEntry>set = new HashSet<>();
		
		String path = "/home/uener/Área de Trabalho/in2.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				
				String[]vect = line.split(" ");
				String name = vect[0];
				Date moment = Date.from(Instant.parse(vect[1]));
				
				set.add(new LogEntry(name, moment));
				line = br.readLine();
			}
			
			int sum = 0;
			
			for(LogEntry x : set) {
				sum ++;
			}
			System.out.println("Total users: " + sum);
		}
		catch(IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
