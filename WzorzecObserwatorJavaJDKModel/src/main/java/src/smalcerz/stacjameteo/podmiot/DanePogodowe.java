package src.smalcerz.stacjameteo.podmiot;


import java.util.Observable;

import org.json.JSONObject;

import src.smalcerz.stacjameteo.http.RequestUrl;

public class DanePogodowe extends Observable {
	
	private double temp;
	private double wiglotnosc;
	private double cisnienie;
	
	
//	public void setDane(float temp, float wiglotnosc, float cisnienie) {
//		
//		this.temp = temp;
//		this.wiglotnosc = wiglotnosc;
//		this.cisnienie = cisnienie;
//		setChanged();
//		notifyObservers();
//		
//	}
	
	public void tick() {
		JSONObject data = RequestUrl.getStringObj("https://api.forecast.io/forecast/4a04d1c42fd9d32c97a2c291a32d5e2d/50.0646501,19.9449799");
		
		this.temp = data.getJSONObject("currently").getDouble("temperature");
		this.cisnienie = data.getJSONObject("currently").getDouble("pressure");
		this.wiglotnosc = data.getJSONObject("currently").getDouble("dewPoint");
		setChanged();
		notifyObservers();
	}

	public double getTemp() {
		return this.temp;
	}
	public double getCisnienie() {
		return this.cisnienie;
	}
	public double getWiglotnosc() {
		return this.wiglotnosc;
	}
	
	
}
