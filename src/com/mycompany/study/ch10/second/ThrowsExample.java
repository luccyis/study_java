package com.mycompany.study.ch10.second;

public class ThrowsExample {
		//throws ClassNotFoundException
		public static void findClass() throws ClassNotFoundException  {
			Class clazz = Class.forName("java.lang.String2");
		}
		
		
		
		
		
		
		
		
		
		public static void main(String[] args) {
			try {
				findClass();
			} catch(ClassNotFoundException e) {
				System.out.println("클래스가 존재하지 않습니다.");
			}
		}
	}


