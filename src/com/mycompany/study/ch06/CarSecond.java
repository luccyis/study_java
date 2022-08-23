package com.mycompany.study.ch06;

public class CarSecond {

	String name = "아반떼 ";
	int cc = 3000;
	String color = "blue";
	
	CarSecond(){
	}
	
	CarSecond(String name){
		this.name = name;
	}
	
	CarSecond(String name, int cc){
		this.name = name;
		this.cc = cc;
	}
	
	CarSecond(String name, int cc, String color){
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	

//	String color = "red";
//	int cc = 1500;
//	
//	//명시적 생성자 
//	CarSecond(String color){
//		this.color = color;
//		//이 클래스 안의 객체의 의미 
//	}
//	
//	CarSecond(String color, int cc){
//		this.color = color;
//		this.cc = cc;
//	}
//	
//	//기본 생성자 
//	CarSecond(){
//	}
	
}
