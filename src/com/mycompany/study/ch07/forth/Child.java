package com.mycompany.study.ch07.forth;

public class Child  extends Parents{
//	자식클래스 :
//	부모클래스 상속받음
//	필드 : 합
//	메서드 (오버라이드) : 순서1* 순서2 + 순서3 + 10 : return 합
	
	@Override
	public int getSum(int array[]) {
		sum = (array[0] * array[1]) + array[2] +10;
		
		return sum;
	}
}
