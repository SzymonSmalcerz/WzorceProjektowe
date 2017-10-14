package com.smalcerz.wzorzec_dekorator.dekorator.klasyDerokujace;


import com.smalcerz.wzorzec_dekorator.Kawa;
import com.smalcerz.wzorzec_dekorator.dekorator.Dekorator;

public class Mleko extends Dekorator{
	public Mleko(Kawa kawa) {
		this.koszt = 0.15;
		this.kawa = kawa;
		this.opis = kawa.pobierzOpis() + " + mleko";
	}
}
