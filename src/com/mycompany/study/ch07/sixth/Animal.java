package com.mycompany.study.ch07.sixth;

public abstract class Animal {

	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메서드는 내용없다. 무조건 실행해야되는 메서드
	public abstract void sound();
	public abstract void sound(String m);
}
