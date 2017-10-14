package com.smalcerz.pizza;

import com.smalcerz.fabrykiSkladnikow.FabrykaSkladnikow;

public class PizzaSerowa extends Pizza {
	public PizzaSerowa(FabrykaSkladnikow fabrykaSkladnikow) {
		this.fabrykaSkladnikow = fabrykaSkladnikow;
	}

	@Override
	public String getOpis() {
		
		return fabrykaSkladnikow.getCiasto().getClass().getSimpleName() + ", " + 
			 "4x" + fabrykaSkladnikow.getSer().getClass().getSimpleName() + ", " +
			 fabrykaSkladnikow.getSos().getClass().getSimpleName();
	}
}
