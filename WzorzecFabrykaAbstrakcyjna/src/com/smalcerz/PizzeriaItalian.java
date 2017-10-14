package com.smalcerz;

import com.smalcerz.fabrykiSkladnikow.WloskaFabrykaSkladnikow;
import com.smalcerz.pizza.Pizza;
import com.smalcerz.pizza.PizzaSerowa;

public class PizzeriaItalian extends Pizzeria{
	
	public PizzeriaItalian() {
		this.fabrykaSkladnikow = new WloskaFabrykaSkladnikow();
	}
	
	@Override
	protected Pizza makePizza(String type) {
		
		return new PizzaSerowa(fabrykaSkladnikow);
	}

}
