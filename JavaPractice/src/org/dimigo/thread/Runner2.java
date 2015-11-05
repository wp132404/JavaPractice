package org.dimigo.thread;

import java.util.Random;

public class Runner2 implements Runnable {

	private String name;
	private int a = 100;
	
	public Runner2() {
		
	}
	public Runner2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while (a > 0) {
			System.out.println(name + " : " + a + " 미터");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a = a - 10;
		}
		System.out.println(name + " : 도착");
	}
	
	
}
