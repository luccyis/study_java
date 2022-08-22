package com.mycompany.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {

	Iphone iphone = new Iphone();
	
	//.name 은 변수 
	System.out.println("iphone.name: " + iphone.name);
	
	//괄호가 있으면 함수.
	iphone.pr(); 
	
	Car car = new Car();
	System.out.println("car.name: " + car.getName());
	
	Handbag handbag = new Handbag();
	
	System.out.println("handbag.name: " + handbag.name);
	
	System.out.println(handbag.getName());
	
	car.setName("소나타"); 
	System.out.println("car.name: " + car.getName());
	
	
	
	}

}
