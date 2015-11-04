package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Runner r = new Runner("디미고");
		Runner r2 = new Runner("선린");
		
		r.start();
		r2.start();
		
		System.out.println("main thread end");
		
	}
	
}
