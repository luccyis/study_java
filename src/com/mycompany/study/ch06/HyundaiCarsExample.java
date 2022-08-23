package com.mycompany.study.ch06;

public class HyundaiCarsExample {

	public static void main(String[] args) {

		
//사용
		HyundaiCars hyundaiCars = new HyundaiCars();
		
		
		HyundaiCars car2 = new HyundaiCars("casper");
		System.out.println("car2: " + car2.name);
		
		HyundaiCars car3 = new HyundaiCars("그렌져 ", 3000);
		System.out.println("car3: " + car3.name + car3.cc);
		
		HyundaiCars car4 = new HyundaiCars("g80 ", 3000, "gray");
		System.out.println("car4: " + car4.name + car4.cc + car4.color);
		
		HyundaiCars car5 = new HyundaiCars(3300);
		
		
		
		
		
	}

}
