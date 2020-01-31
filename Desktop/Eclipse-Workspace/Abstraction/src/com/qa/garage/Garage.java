package com.qa.garage;

import java.util.ArrayList;

public class Garage {
	public static void main(String[] args){
		ArrayList<Vehicle> vehicles= new ArrayList<Vehicle>();
		vehicles.add (new Car("red", true));
	//Vehicle bike= new Bike("green",150)};
		vehicles.stream().forEach(
			vehicle-> System.out.println(vehicle.bill())
			);
	}
}
