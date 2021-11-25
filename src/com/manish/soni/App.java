package com.manish.soni;

public class App {

	public static void main(String[] args) {

		// Here we can wrap (or decorate) any object. We are
		// wrapping plain beverage with the others beverage.
		Beverage beverage = new Sugar(new Sugar(new Milk(new PlainBeverage())));
		
		System.out.println(beverage.getCost());
		System.out.println(beverage.getDescription());
	}
}
