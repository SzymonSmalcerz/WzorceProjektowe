package com.smalcerz.wzorzec_dekorator.dekorator;

import com.smalcerz.wzorzec_dekorator.Kawa;

public abstract class Dekorator extends Kawa {

	protected Kawa kawa;
	protected double koszt;
	@Override
	
	public double koszt() {
		return kawa.koszt() + this.koszt;
	}

}
