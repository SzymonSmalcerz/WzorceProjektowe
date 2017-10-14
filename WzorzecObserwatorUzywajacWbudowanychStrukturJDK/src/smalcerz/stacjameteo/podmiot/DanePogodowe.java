package smalcerz.stacjameteo.podmiot;


import java.util.Observable;

public class DanePogodowe extends Observable {
	
	private float temp;
	private float wiglotnosc;
	private float cisnienie;
	
	
	public void setDane(float temp, float wiglotnosc, float cisnienie) {
		
		this.temp = temp;
		this.wiglotnosc = wiglotnosc;
		this.cisnienie = cisnienie;
		setChanged();
		notifyObservers();
		
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
