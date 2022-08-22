package com.mycompany.study.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car abx = new Car();
		int a = 1;
		
		int[] b = new int[1];
		
		System.out.println("car.name: " + abx.getName());
		System.out.println("abx.name2[1]" + abx.name2[1]);
		
		Car car = new Car();
		
		System.out.println("car.name: " + car.getName());
		System.out.println("car.name2[1]: " + car.name2[1]);
		
	}

}
