package com.smalcerz.wzorzec_dekorator;

import com.smalcerz.wzorzec_dekorator.dekorator.klasyDerokujace.Czekolada;
import com.smalcerz.wzorzec_dekorator.dekorator.klasyDerokujace.Mleko;
import com.smalcerz.wzorzec_dekorator.podklasy.Espresso;
import com.smalcerz.wzorzec_dekorator.podklasy.KawaMrozona;
import com.smalcerz.wzorzec_dekorator.podklasy.MocnoPalona;

public class App {
	public static void main(String[] args) {
		Kawa kawaMrozona = new KawaMrozona();
		kawaMrozona = new Czekolada(kawaMrozona);
		kawaMrozona = new Czekolada(kawaMrozona);
		
		Kawa espresso = new Espresso();
		
		Kawa mocnoPalona = new Czekolada(new Mleko(new MocnoPalona()));
		
		Kawa mocnoPalona2 = new MocnoPalona();
		mocnoPalona2 = new Mleko(mocnoPalona2);
		mocnoPalona2 = new Czekolada(mocnoPalona2);
		
		System.out.println(kawaMrozona.pobierzOpis() + ": " + kawaMrozona.koszt());
		System.out.println(espresso.pobierzOpis() + ": " + espresso.koszt());
		System.out.println(mocnoPalona.pobierzOpis() + ": " + mocnoPalona.koszt());
		System.out.println(mocnoPalona2.pobierzOpis() + ": " + mocnoPalona2.koszt());
	}
}









