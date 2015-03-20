package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		byte a=10;
		byte b=9;
		double h=5.8;
		double s=((double)a+(double)b)*h/2;
		
		byte a2=9;
		double h2=5.4;
		double s2=(double)a2*h2;
		
		System.out.println("<<도형 넓이 비교>>\n사다리꼴 넓이 : "+ s + "\n평행사변형 넓이 : " + s2 + "\n\n사다리꼴은 평행사변형보다 " + (s-s2) + " 더 큽니다.");
		
	}
}
