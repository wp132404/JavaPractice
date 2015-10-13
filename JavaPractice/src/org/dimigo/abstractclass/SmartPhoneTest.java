package org.dimigo.abstractclass;

public class SmartPhoneTest {
	
	public static void main(String[] args) {
		
		SmartPhone phones[] = {
				new IPhone("iPhone 6","애플",700000),
				new Galaxy("갤럭시 S6","삼성",650000)
		};
		
		for(SmartPhone p : phones) {
			System.out.println(p.toString());
			p.turnOn();
			p.pay();
			p.useSpecialFunction();
			p.turnOff();
			System.out.println();
		}
		
		
	}

}
