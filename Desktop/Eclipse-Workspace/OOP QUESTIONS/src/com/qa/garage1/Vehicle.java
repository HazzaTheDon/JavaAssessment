package com.qa.garage1;

public abstract class Vehicle {
	private String colour;
	public Vehicle (String colour) {
		super();
		this.colour=colour;
		
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
		public abstract float bill();
	
	
	
	

}
