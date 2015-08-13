package org.dimigo.inheritance;

public class Figure {
	
	private int centerX;
	private int centerY;
	
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	
	protected double calcArea() {
		return 1.1;
	}
	protected void printCenter() {
		System.out.println("중심 좌표 : (" + centerX + "," + centerY + ")");
	}
	protected void moveFigure(int x, int y) {
		centerX+=x;
		centerY+=y;
		
		if (x==y) {
			System.out.println("--중심좌표 이동 (x,y축 " + x + "씩)");
		}
		else {
			System.out.println("--중심좌표 이동 (x축 " + x + ",y축 " + y + "씩)");
		}
	}
	

}
