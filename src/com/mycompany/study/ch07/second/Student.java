package com.mycompany.study.ch07.second;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	public Student() {
		super();
		//없어도 붙여줌 
	}
	
	

}
