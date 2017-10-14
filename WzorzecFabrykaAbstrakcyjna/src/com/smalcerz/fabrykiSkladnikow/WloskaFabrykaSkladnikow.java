package com.smalcerz.fabrykiSkladnikow;

import com.smalcerz.fabrykiSkladnikow.skladniki.Ciasto;
import com.smalcerz.fabrykiSkladnikow.skladniki.Malze;
import com.smalcerz.fabrykiSkladnikow.skladniki.Ser;
import com.smalcerz.fabrykiSkladnikow.skladniki.Sos;
import com.smalcerz.fabrykiSkladnikow.skladniki.wloskie.CienkieCiasto;
import com.smalcerz.fabrykiSkladnikow.skladniki.wloskie.Ketchup;
import com.smalcerz.fabrykiSkladnikow.skladniki.wloskie.SerGouda;
import com.smalcerz.fabrykiSkladnikow.skladniki.wloskie.SwiezeMalze;

public class WloskaFabrykaSkladnikow extends FabrykaSkladnikow{

	@Override
	public Ser getSer() {
		return new SerGouda();
	}

	@Override
	public Malze getMalze() {
		return new SwiezeMalze();
	}

	@Override
	public Sos getSos() {
		return new Ketchup();
	}

	@Override
	public Ciasto getCiasto() {
		return new CienkieCiasto();
	}
	
}
