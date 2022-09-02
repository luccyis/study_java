package com.mycompany.study.ch07.test;

public class ComputerExample {

	public static void main(String[] args) {

		double r = 7;
		System.out.println("원의 반지름: " + r );
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.circle(r));
		
		System.out.println("");
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.circle(r));
		
		
	}

}
