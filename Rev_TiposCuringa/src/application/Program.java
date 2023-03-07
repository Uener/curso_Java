package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(5, 2, 10);
		printList(list);
		
		List<String>liststr = Arrays.asList("Maria", "Bob", "Frank");
		printList(liststr);


	}
	
	public static void printList(List<?>list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
