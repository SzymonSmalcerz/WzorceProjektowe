package com.smalcerz.wzorzec_dekorator.dekorator.klasyDerokujace;

import com.smalcerz.wzorzec_dekorator.Kawa;
import com.smalcerz.wzorzec_dekorator.dekorator.Dekorator;

public class BitaSmietana extends Dekorator{
	public BitaSmietana(Kawa kawa) {
		this.koszt = 0.20;
		this.opis = kawa.pobierzOpis() + " + bita smietana";
		this.kawa = kawa;
	}
}
