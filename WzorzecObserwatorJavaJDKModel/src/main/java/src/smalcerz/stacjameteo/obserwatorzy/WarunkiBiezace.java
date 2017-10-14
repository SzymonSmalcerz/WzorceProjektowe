package src.smalcerz.stacjameteo.obserwatorzy;

import java.util.Calendar;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

import src.smalcerz.stacjameteo.podmiot.DanePogodowe;

public class WarunkiBiezace implements WyswietlElement,Observer{
	
	private DanePogodowe podmiot;
	
	private double temp;
	private double wiglotnosc;
	private double cisnienie;
	
	public WarunkiBiezace(DanePogodowe podmiot) {
		this.podmiot = podmiot;
		this.podmiot.addObserver(this);
	}
	
	public void update(Observable podmiot, Object arg1) {
//		I TU SIE PRZEJAWIA GLOWNA ROZNICA -> MOZEMY WYDOBYC Z NASZEGO PODMIOTU 
//		TYLKO TE DANE, KTORE NAS INTERESUJA !
		
		this.temp = this.podmiot.getTemp();
		this.wiglotnosc = this.podmiot.getWiglotnosc();
		this.cisnienie = this.podmiot.getCisnienie();
		
		this.wyswietl();
		
		
	}

	
	public void wyswietl() {
		
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.getTime() + "\ttemp: " + this.temp + " cisnienie: " + this.cisnienie + " wilgotnosc : " + this.wiglotnosc);
		
	}

	

}
