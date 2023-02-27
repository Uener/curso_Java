package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("\nFOLDERS: ");
		for(File x : folders) {
			System.out.println(x);
		}
		
		System.out.println("\nFILES: ");
		File[]files = path.listFiles(File::isFile);
		for(File c :files) {
			System.out.println(c);
		}
		
		sc.close();

	}

}
