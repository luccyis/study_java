package com.mycompany.study.ch03;

public class CompareOperatorExample {

	public static void main(String[] args) {

//		비교연산자 if/else 문에서 사용
		
		int num = 10;
		int num2 = 20;
		
		boolean result = num == num2;
		System.out.println(result);
		
		// !=
		
		boolean result1 = num != num2;
		System.out.println(result1);
		
		// <
		boolean result2 = num < num2;
		System.out.println(result2);
		
		// <=
		boolean result3 = num <= num2;
		System.out.println(result3);
		
		// >
		boolean result4 = num > num2;
		System.out.println(result4);
		
		// >=
		boolean result5 = num >= num2;
		System.out.println(result5);
		
	}

}
