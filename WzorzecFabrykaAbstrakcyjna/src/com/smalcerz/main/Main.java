package com.smalcerz.main;

import com.smalcerz.Pizzeria;
import com.smalcerz.PizzeriaItalian;
import com.smalcerz.pizza.Pizza;

public class Main {
	public static void main(String[] args) {
		Pizzeria pizzeria = new PizzeriaItalian();
		Pizza myPizza = pizzeria.orderPizza("serowa");
		
		System.out.println(myPizza.getClass().getSimpleName());
	}
}
