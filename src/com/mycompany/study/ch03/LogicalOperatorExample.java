package com.mycompany.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

//		&& = & : and : 논리곱 : 연산 참 참 참, 나머지 폴스
//		|| = | : or : 논리합 : 연산 참 폴스 참, 폴스 참 참, 참 참 참 , 폴스 폴스 폴스
//		^ : 배타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스 , 참 폴스 참, 폴스 참 참
		
		int a = 65;
		
		boolean result = (a >= 65);
		System.out.println("result: " + result);
		
		boolean result2 = (a <= 90);
		System.out.println("result: " + result2);
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		System.out.println("-------------------------------------");
		if(a >= 65 | a <= 90) {
			System.out.println("둘다 참");
		}
		if(a >= 66 | a <= 90) {
			System.out.println("한개만 참");
		}
		if (a >= 66 | a <= 50) {
			System.out.println("둘다 폴스라서 이 글은 보이지 않아야 되는데 말이지...");
		}
		if (a >= 65 || a <= 90) {
			System.out.println("둘 다 참");
		}
		if (a >= 66 || a <= 90) {
			System.out.println("한 개 만 참");
		}
		if (a >= 66 || a <= 50) {
			System.out.println("둘다 폴스라서 이 글은 보이지 않아야 되는데 말이지...");
		}
		System.out.println("-----------------------------------");

		if(a >=65 ^ a <= 50) {
			System.out.println("한개만 참");
		}
		if(a >= 65 ^ a <=90) {
			System.out.println("둘 다 참");
		}
		if(a >= 66 ^ a <=90) {
			System.out.println("한개만 참 ");
		}
		if(a >= 66 ^ a <=50) {
			System.out.println("둘 다 폴스");
		}
	}

}
