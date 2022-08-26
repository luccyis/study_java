package com.mycompany.study.ch07.third;

public class Computer extends Calculator {

	//우클릭으로도 사용가능
//	@Override
//	public double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}

	@Override
	//첫째줄 똑같아야 됨!!
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r *r; 
	}
}
