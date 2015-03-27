package org.dimigo.basic;

//2015.3.24 shift

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance=10;
		String car ="경차";
		int tax=0;
		
		
		switch(car) {
		case "고속버스" :
			tax=850;
			break;
		case "경차" :
			tax=300;
			break;
		case "그 외":
			tax=600;
			break;
		}
		
		if (distance>10) {
			if (car=="고속버스")
				tax+=300*(distance/10); 
			else if (car=="경차" || car=="그 외")
				tax+=200*(distance/10);
		}
		
		System.out.println("<<교통 도로 통행료 계산>>\n거리 : " + distance + "km\n차종 : " + car + "\n통행료 : " + tax + "원");
		
	}

}
