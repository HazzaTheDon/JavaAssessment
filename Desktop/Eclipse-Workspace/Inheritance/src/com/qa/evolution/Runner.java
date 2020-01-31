package com.qa.evolution;

public class Runner {
	public static void main(String[] args) {
		Snake kobe = new Snake();
		kobe.bite();
		kobe.getLength();
		RattleSnake leBron = new RattleSnake();
		BlackMamba Tyler = new BlackMamba();
		Snake a = (Snake) leBron;
		Snake b = (Snake)Tyler;
		RattleSnake still; leBron = (Rattlesnake) a;
		RattleSnake not; leBron = (Rattlesnake) b;
		
//		leBron.bite();
//		leBron.rattle();
//		leBron.speak();
//		
			
	}

}
