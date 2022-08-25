package com.mycompany.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		//명시적 생성자를 사용하여 객체를 생성하고
		//모든 필드를 출력하시오.
		
		Student student = new Student("장원영", "1112-3345");
		System.out.println(student.name);
		System.out.println(student.ssn);
		
		
		Student student2 = new Student("고명지", "3456-5536", 123);
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
		
		
		
		
		
		
		
		
	}

}
