package org.dimigo.basic;

/*
 *  <First>
 */


public class PrimitiveDataType {

	public static void main(String[] args) {
		String name="아이유";
		Boolean isFemale=true;
		String isFemaleString;
		if (isFemale)
			isFemaleString="여자";
		else
			isFemaleString="남자";
		int age=23;
		double height=161.8d;
		float weight=44.3f;
		char bloodType='A';
		
		System.out.println("<<아이유 프로필>>\n이름 : " + name + "\n성별 : " + isFemaleString + "\n나이 : " + age + "세\n키 : " + height + "cm\n몸무게 : " + weight + "kg\n혈액형 : " + bloodType + "형");

	}

}
