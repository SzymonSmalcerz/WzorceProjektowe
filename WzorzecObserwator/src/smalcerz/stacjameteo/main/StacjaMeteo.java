package smalcerz.stacjameteo.main;

import smalcerz.stacjameteo.obserwatorzy.*;
import smalcerz.stacjameteo.podmiot.*;

public class StacjaMeteo {
	
	public static void main(String[] args) {
		
		DanePogodowe danePogodowe = new DanePogodowe();
		
		@SuppressWarnings("unused")
		Obserwator obserwator1 = new WarunkiBiezace(danePogodowe);
		
		danePogodowe.odczytZmiana(60, 60, 60);
		danePogodowe.odczytZmiana(70, 70, 70);
		danePogodowe.odczytZmiana(60, 80, 60);
		
	}
	
}
