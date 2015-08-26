package org.dimigo.inheritance;

public class Circle extends Figure {

	private int radius;
	
	public Circle(int radius) {
		this(0,0,radius);
	}
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
		
	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
	}
	protected double calcArea() {
		return (double)radius*(double)radius*Math.PI;
	}
	
}
