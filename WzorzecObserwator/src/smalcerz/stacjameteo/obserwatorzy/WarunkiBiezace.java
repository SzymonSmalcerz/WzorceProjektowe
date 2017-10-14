package smalcerz.stacjameteo.obserwatorzy;


import smalcerz.stacjameteo.podmiot.*;
 



public class WarunkiBiezace implements Obserwator,WyswietlElement{

	
	private float temp;
	private float wiglotnosc;
	private float cisnienie;
	
	@SuppressWarnings("unused")// just yet
	private Podmiot podmiot;
	
	public WarunkiBiezace(Podmiot podmiot) {
		this.podmiot = podmiot;
		podmiot.zarejestrujObserwatora(this);
	}
	
	@Override
	public void aktualizacja(float temp, float wiglotnosc, float cisnienie) {
		
		this.temp = temp;
		this.wiglotnosc = wiglotnosc;
		this.cisnienie = cisnienie;
		this.wyswietl();
		
	}

	@Override
	public void wyswietl() {
		
		System.out.println("temp: " + this.temp + " cisnienie: " + this.cisnienie + " wiglotnosc: " + this.wiglotnosc + "/n");
		
	}


}
