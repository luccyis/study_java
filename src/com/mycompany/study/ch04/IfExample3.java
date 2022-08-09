package com.mycompany.study.ch04;

public class IfExample3 {

	public static void main(String[] args) {

		//int 타입의 변수를 2개 선언하고 
		//두 정수가 주어졌을때 두 정수를 비교하여
		//크기비교 결과를 나타내는 프로그램을 작성하시오 
		
		int a = 9;
		int b = 9;
		
		if (a > b) {
			System.out.println("a 가 b 보다 큽니다.");
		} else if (a < b) {
			System.out.println("b 가 a 보다 큽니다. ");
		} else {
			System.out.println("a 와 b 가 같습니다. ");
		}
	}

}
