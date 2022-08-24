package com.mycompany.study.ch06;

public class Korean {

	String name = "";
	String ssn = "";
	int age = 20;
	
	//오버 로드 
	Korean(){
		
	}
	
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		
	}
	Korean(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	static String nationality = "대한민국";
	
	static int staticTest (int a) {
		return a + 10;
	}
	
	int staticTest2 (int a) {
		return a - 10;
	}

	int ttest() {
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.aaa(12);
		return 1;
	}
	
	public void ttest2() {
//		Arithmetic arithmetic = new Arithmetic();
//		arithmetic.staticTest();
		
		Arithmetic.staticTest();
	}
	
}
