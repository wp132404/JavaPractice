package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		int korean;
		int math;
		int english;
		StringBuilder sb = new StringBuilder("");
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("국어 점수 입력 => ");
		korean = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		math = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		english = scanner.nextInt();
		
		System.out.println("<< 점수 출력 >>");
		sb.append("국어 점수 : ").append(korean + "점\n")
			.append("수학 점수 : ").append(math + "점\n")
			.append("영어 점수 : ").append(english + "점\n")
			.append("총점 : ").append(math + english + korean + "점\n")
			.append("평균 : ").append((double)(math + english + korean)/3 + "점\n");
			
		System.out.println(sb);
			
		int a;
		
		
	}
	
}
