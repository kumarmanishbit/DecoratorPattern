package com.manish.soni;

/*
 * 
 *  This is sugar decorator to add the sugar to existing object.
 */
public class Sugar extends BeverageDecorator {

	protected Beverage beverage;

	public Sugar(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost() + 1;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " Sugar ";
	}

}
