package com.mycompany.study.ch06;

public class CarSeconExample {

	public static void main(String[] args) {

		//초기화 
		CarSecond carSecond = new CarSecond();
		String color;
		
		//새로운 값으로 초기화 
		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("white", 3000);
		String color2 = "Red";
		
//		System.out.println("carSecond.color: " + carSecond.color);
		System.out.println("carSecond2.color: " + carSecond2.color);
		System.out.println("carSecond2.cc: " + carSecond2.cc);
		
		System.out.println("carSecond3.color: " + carSecond3.color);
		System.out.println("carSecond3.cc: " + carSecond3.cc);
		
		
	
		
		
	}

}
