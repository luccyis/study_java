package com.mycompany.study.ch06;

public class HyundaiCars {
	
//	선언 
	String name = "아반떼 ";
	int cc = 0;
	String color = "white";
	
	
//(오버로드) 함수의 이름은 똑같고 매개변수의 위치/개수 다름 
	
	HyundaiCars (String name){
		this.name = name;
	}
	
	HyundaiCars (String name, int cc){
		this.name = name;
		this.cc = cc;
	}
	
	HyundaiCars (String name, int cc, String color){
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
	//기본 생성자 
	HyundaiCars(){
		
	}
	
	HyundaiCars (int ccvalue){
		cc = ccvalue;
	}

}
