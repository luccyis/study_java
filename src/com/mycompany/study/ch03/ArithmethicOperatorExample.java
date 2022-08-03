package com.mycompany.study.ch03;

public class ArithmethicOperatorExample {

	public static void main(String[] args) {

//		int 변수 v1 에 초기값 5
//		int 변수 v2 에 초기값 2
		
//		int 변수 result1 에 + 연산 후 출력
//		int 변수 result2 에 - 연산 후 출력
//		int 변수 result3 에 * 연산 후 출력
//		int 변수 result4 에 / 연산 후 출력
//		int 변수 result5 에 % 연산 후 출력
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2: " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3: " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4: " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5: " + result5);
		
		double result6 = v1 / v2;
		System.out.println("result6: " + result6);
		
		double result7 = (double) v1 / v2;
		System.out.println("result7:" + result7);
		
		
		double a = ((1 + 2/3) - (5/8)) * (9 + 4/5);
		System.out.println(a);
		
		double b = 5 - (3.25 - (1+5/6))*(12/17);
		System.out.println(b);
		
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		subAvg("홍길동", 60,70,85,90,45);
		subAvg("박말순", 50,75,70,60,70);
		subAvg("고장난", 55,60,64,58,90);
		subAvg("도롱뇽", 80,70,63,88,78);
		
		
	}
	
	//추가되는 함수는 메인함수 밖, 클래스 안 에
	//자바는 변수명 풀네임으로
	
	public static void sum(int a, int b, int c) {
		System.out.println(a + "+" + b + "+" + c + "=" + (a+b+c));
	}
	
	public static void subAvg(String name, int english, int math, int physics, int music, int athletic) {
		System.out.println(name + " 평균: " + (double)(english + math + physics + music + athletic)/5);
	}
		
	
	

}
