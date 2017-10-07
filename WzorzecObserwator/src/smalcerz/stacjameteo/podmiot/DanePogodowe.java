package smalcerz.stacjameteo.podmiot;

import java.util.ArrayList;

import smalcerz.stacjameteo.obserwatorzy.Obserwator;

public class DanePogodowe implements Podmiot{

	
	private float temp;
	private float wiglotnosc;
	private float cisnienie;
	
	private ArrayList<Obserwator> obserwatorzy;
	
	public DanePogodowe() {
		obserwatorzy = new ArrayList<>();
	}
	
	@Override
	public void zarejestrujObserwatora(Obserwator obserwator) {
		
		obserwatorzy.add(obserwator);
		
	}

	@Override
	public void usunObserwatora(Obserwator obserwator) {
		
		int index = obserwatorzy.indexOf(obserwator);
		
		if(index >=0) {
			obserwatorzy.remove(index);
		}
		
	}

	@Override
	public void powiadomObserwatorow() {
		
		for(Obserwator obserwator : obserwatorzy) {
			obserwator.aktualizacja(this.temp, this.wiglotnosc, this.cisnienie);
		};
		
	}
	
	public void odczytZmiana(float temp, float wiglotnosc, float cisnienie) {
		this.temp = temp;
		this.wiglotnosc = wiglotnosc;
		this.cisnienie = cisnienie;
		this.powiadomObserwatorow();
	}
	
	
	public float getTemp() {
		return this.temp;
	}
	public float getCisnienie() {
		return this.cisnienie;
	}
	public float getWiglotnosc() {
		return this.wiglotnosc;
	}
	
	
	
	
	
	
	

}
