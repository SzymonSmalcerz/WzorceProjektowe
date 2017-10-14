package smalcerz.stacjameteo.obserwatorzy;

import java.util.Observable;
import java.util.Observer;

import smalcerz.stacjameteo.podmiot.DanePogodowe;

public class WarunkiBiezace implements WyswietlElement,Observer{
	
	private DanePogodowe podmiot;
	
	private float temp;
	private float wiglotnosc;
	private float cisnienie;
	
	public WarunkiBiezace(DanePogodowe podmiot) {
		this.podmiot = podmiot;
		this.podmiot.addObserver(this);
	}

	@Override
	public void update(Observable podmiot, Object arg1) {
//		I TU SIE PRZEJAWIA GLOWNA ROZNICA -> MOZEMY WYDOBYC Z NASZEGO PODMIOTU 
//		TYLKO TE DANE, KTORE NAS INTERESUJA !
		
		this.temp = this.podmiot.getTemp();
		this.wiglotnosc = this.podmiot.getWiglotnosc();
		this.cisnienie = this.podmiot.getCisnienie();
		
		this.wyswietl();
		
		
	}

	@Override
	public void wyswietl() {
		
		System.out.println("temp: " + this.temp + " cisnienie: " + this.cisnienie + " wilgotnosc : " + this.wiglotnosc);
		
	}

}
