package com.smalcerz.wzorzec_dekorator.podklasy;

import com.smalcerz.wzorzec_dekorator.Kawa;

public class MocnoPalona extends Kawa{
	
	public MocnoPalona() {
		this.opis = "Mocno Palona";
	}
	@Override
	public double koszt() {
		return 1.49;
	}

}
