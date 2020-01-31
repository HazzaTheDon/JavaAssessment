package com.qa.garage1;

public class Car extends Vehicle{
	private boolean radio;
	public Car(String colour, boolean radio) {
		super(colour);
		this.radio=radio;
	}
	
@Override 
public float bill() {
	if (radio) {
		return 1000.00f;
	}else {
		return 500.00f;
	}
	}
}
	

