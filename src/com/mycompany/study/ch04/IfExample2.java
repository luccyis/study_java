package com.mycompany.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {

		int price = 20000;
		
		int user = 3;
		
		
		if(user == 1) {
			System.out.println("정가:"+ price + " 할인가 :"+ (int)(price * (1 -0.05)) + "원");
		}
		else if (user == 2) {
			System.out.println("정가:" + price + " 할인가 :"+ (int)(price * (1 - 0.1)) + "원");
		}
		else if (user == 3) {
			System.out.println("정가:" + price + " 할인가 :"+ (int)(price * (1 - 0.15)) + "원");
		}
		else if (user == 4) {
			System.out.println("정가:" + price + " 할인가 :"+ (int)(price * (1 - 0.2)) + "원");
		}
		else {
			System.out.println("정가:" + price + " 할인가 :"+ (int)(price * (1 - 0.27)) + "원");
		}
	}

}
