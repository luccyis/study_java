package com.mycompany.study.ch06;

public class Arithmetic {
	
//	사칙연산 클래스 생성 
//	연살별 함수 생성 (매개변수는 정수형으로 2개씩 )
//	출력하는 함수도 생성
//	
//	사칙연산 실행 클래스 생성 
//	함수를 사용하여 5개의 연산 결과를 출력하시오.
//	단 출력시 사칙 연산 클래스의 출력 함수를 사용.
	
	
	public int plus (int a, int b) {
		return a + b;
	}
	
	public int minus (int a, int b) {
		return a - b;
	}	
		
	public int multiplication (int a, int b) {
		return a * b;
	}
	
	public int division (int a, int b) {
		return a / b;
	}

	public int remind(int a, int b) {
		return a % b;
	}
	
	public void say (int a) {
		System.out.println("값은 " + a + "입니다.");
	}
	
	public void what (String a, String b) {
	
		System.out.println(a + b);
	}
	
	
	
	
	


}
