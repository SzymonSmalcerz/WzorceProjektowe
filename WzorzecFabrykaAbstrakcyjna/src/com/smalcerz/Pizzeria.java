package com.smalcerz;

import com.smalcerz.fabrykiSkladnikow.FabrykaSkladnikow;
import com.smalcerz.pizza.Pizza;

public abstract class Pizzeria {
	protected FabrykaSkladnikow fabrykaSkladnikow;
	
	public Pizza orderPizza(String type) {
		Pizza pizza = makePizza(type);
		krojeniePizzy();
		pieczeniePizzy();
		pakowaniePizzy();
		System.out.println(pizza.getOpis());
		return pizza;
	}

	protected abstract Pizza makePizza(String type);
	
	public void krojeniePizzy() {
		System.out.println("Krojenie pizzy na 8 kawalkow.");
	}
	
	
	public void pieczeniePizzy() {
		System.out.println("Pieczenie pizzy przez 15 min w 180 Stopniach.");
	}
	
	
	public void pakowaniePizzy() {
		System.out.println("Pakowanie Pizzy do kwadratowego pudelka firmowego.");
	}
	
	
}
