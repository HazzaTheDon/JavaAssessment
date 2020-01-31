package com.qa.factory;

public class Runner {
	public static void main(String[] args) {
		Box box = new Box(100);

		Box crate = new Box(600);
//		System.out.println(box.getMaterial());
//		System.out.println(crate.getMaterial());
//	}
		for (Box boxy : Box.boxes) {
			System.out.println(boxy.getVolume());
		}
	}
	
}