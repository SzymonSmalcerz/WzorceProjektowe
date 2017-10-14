package src.smalcerz.stacjameteo.main;



import src.smalcerz.stacjameteo.obserwatorzy.WarunkiBiezace;
import src.smalcerz.stacjameteo.podmiot.DanePogodowe;

public class Main {
	public static void main(String[] args) {
		
		DanePogodowe danePogodowe = new DanePogodowe();
		@SuppressWarnings("unused")
		WarunkiBiezace warunkiBiezace = new WarunkiBiezace(danePogodowe);
		
		long now;
		long guard = System.currentTimeMillis() - 20000;
		
		while(true) {
			
			now = System.currentTimeMillis();
			
			if((now - guard) >= 15000) {
				guard = now;
				danePogodowe.tick();
			}
			
		}
		
		
		
//		System.out.println(RequestUrl.executeGet("https://api.forecast.io/forecast/4a04d1c42fd9d32c97a2c291a32d5e2d/50.0646501,19.9449799"));
		
	}
}
