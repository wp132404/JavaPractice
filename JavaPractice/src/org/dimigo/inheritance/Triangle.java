package org.dimigo.inheritance;

public class Triangle extends Figure {
	
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this(0, 0, width, height);
	}
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return ((double)width*(double)height)/2;
	}
	
}
