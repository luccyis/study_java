package com.mycompany.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("장원영 ", "011225-1234567");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		Korean k2 = new Korean("장원영 ", 45);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.age: " + k1.age);
		
		
	}

}
