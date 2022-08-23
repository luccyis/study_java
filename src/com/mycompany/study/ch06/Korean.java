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
	
	
}
