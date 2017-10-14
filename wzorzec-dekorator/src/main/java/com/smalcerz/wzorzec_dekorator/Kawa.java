package com.smalcerz.wzorzec_dekorator;

public abstract class Kawa {
	protected String opis;
	
	public abstract double koszt();
	
	public String pobierzOpis(){
		return this.opis;
	}
}
