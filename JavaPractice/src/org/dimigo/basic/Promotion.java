package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args){
		int salary=1700000;
		byte worker=3;
		short shop=1500;
		long benefit=(long)salary * 12 * (long)worker * (long)shop;
		
		System.out.print("<<디미베네 연관 인건비>>\n월 평균 급여 : ");
		System.out.printf("%,d",salary);
		System.out.println("원");
		System.out.print("점포 내 직원 수 : ");
		System.out.printf("%d",worker);
		System.out.println("명");
		System.out.print("점포 수 : ");
		System.out.printf("%,d",shop);
		System.out.println("개\n");
		System.out.println("연간 인건비 : " + String.format("%,d",benefit) + "원");
	}
}
