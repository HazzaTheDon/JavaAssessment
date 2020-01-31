package com.qa.circus;

public class Elephant {
	/**
	
	 */
	String species = "asian";
	String colour = "grey";
	int legs = 3;

	public void getsPainted(String paint) {
		colour = paint;}
/**
 * This creates an elephant:
 * @param mySpecies this is the species
 * @param myColour this is  the colour of the elephant (obviously)
 * @param myLegs number of legs on the elephant
 */
	public Elephant(String mySpecies, String myColour, int myLegs) {
			species = mySpecies;
					colour= myColour;
					legs= myLegs;
			System.out.println("An Elephant is born!");
	
	}}
