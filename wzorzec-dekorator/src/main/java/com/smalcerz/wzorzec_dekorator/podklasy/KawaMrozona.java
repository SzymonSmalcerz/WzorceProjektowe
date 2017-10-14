package com.smalcerz.wzorzec_dekorator.podklasy;

import com.smalcerz.wzorzec_dekorator.Kawa;

public class KawaMrozona extends Kawa {

	public KawaMrozona() {
		this.opis = "Mrozona Kawa";
	}
	@Override
	public double koszt() {
		
		return 1.99;
	}

}
