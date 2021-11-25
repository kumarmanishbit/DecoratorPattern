package com.manish.soni;

public abstract class BeverageDecorator implements Beverage {

	protected Beverage beverage;

	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost();
	}

}
