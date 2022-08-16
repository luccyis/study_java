package com.mycompany.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {

		double a = 1.0;
		double b = 100.0;
		
		int num1 = (int)(Math.random() * (b - a) + a);
		int num2 = (int)(Math.random() * (b - a) + a);
		
		int max = 0, min = 0, sum = 0;
		
		if (num1 > num2) {
			max += num1;
			min += num2;
		} else {
			max += num2;
			min += num1;
		}
		System.out.println("min: " + min + " max: " + max);
		
		for(int i = min; i <= max; i++) {
			sum += i;
			System.out.println(i + " : " + sum );
		}
		System.out.println("total: " + sum);
		
		
		
		
	}

}
