package application;

import model.entities.Anelideo;
import model.entities.Mamifero;

public class Program {

	public static void main(String[] args) {
		
		Anelideo anel = new Anelideo();
		anel.locomove();
		
		Mamifero mam = new Mamifero();
		mam.locomove();

	}

}
