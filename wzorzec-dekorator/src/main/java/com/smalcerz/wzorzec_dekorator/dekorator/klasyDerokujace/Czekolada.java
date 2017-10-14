package com.smalcerz.wzorzec_dekorator.dekorator.klasyDerokujace;

import com.smalcerz.wzorzec_dekorator.Kawa;
import com.smalcerz.wzorzec_dekorator.dekorator.Dekorator;

public class Czekolada extends Dekorator {
	public Czekolada(Kawa kawa) {
		this.koszt = 0.50;
		this.opis = kawa.pobierzOpis() + " + czekolada";
		this.kawa = kawa;
	}
}
