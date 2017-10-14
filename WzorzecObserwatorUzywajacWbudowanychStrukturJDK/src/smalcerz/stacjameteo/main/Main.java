package smalcerz.stacjameteo.main;



import smalcerz.stacjameteo.obserwatorzy.WarunkiBiezace;
import smalcerz.stacjameteo.podmiot.DanePogodowe;
import smalcerz.stacjameteo.http.*;

public class Main {
	public static void main(String[] args) {
		
		DanePogodowe danePogodowe = new DanePogodowe();
		@SuppressWarnings("unused")
		WarunkiBiezace warunkiBiezace = new WarunkiBiezace(danePogodowe);
		
		danePogodowe.setDane(60, 60, 60);
		danePogodowe.setDane(60, 80, 60);
		danePogodowe.setDane(60, 60, 80);
		
		
		System.out.println(RequestUrl.executeGet("https://api.forecast.io/forecast/4a04d1c42fd9d32c97a2c291a32d5e2d/50.0646501,19.9449799"));
		
	}
}
