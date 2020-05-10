package com.manish.soni;

/*
 * 
 *  This is plain class. Sometimes the object need customization, by adding sugar or milk. 
 *  Adding sugar or milk can be done by using Milk decorator and sugra decorator.
 *  
 */
public class PlainBeverage implements Beverage {

	@Override
	public int getCost() {
		return 5;
	}

	@Override
	public String getDescription() {
		return "Plain beverage";
	}

}
