package com.smalcerz.wzorzec_dekorator.podklasy;

import com.smalcerz.wzorzec_dekorator.Kawa;

public class Espresso extends Kawa{
	
	public Espresso() {
		this.opis = "Espresso";
	}
	
	@Override
	public double koszt() {
		return 0.99;
	}

}
