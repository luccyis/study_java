package com.mycompany.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {

//		int 타입의 변수를 2개 선언하고
//		두 정수가 주어졌을때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오.
		
		int x = 0;
		int y = -3;
		
		if (x > 0 && y >0) {
			System.out.println("(x,y)는 제 1사분면에 위치합니다. ");
		} else if (x < 0 && y > 0) {
			System.out.println("(x,y)는 제 2사분면에 위치합니다.");
		} else if (x < 0 && y < 0) {
			System.out.println("(x,y)는 제 3사분면에 위치합니다.");
		} else if (x > 0 && y < 0) {
			System.out.println("(x,y)는 제 4사분면에 위치합니다.");
		} else if (x == 0 && y != 0) {
			System.out.println("(x,y)는 x축 위에 있습니다 ");
		} else if (x != 0 && y == 0) {
			System.out.println("(x,y)는 y축 위에 있습니다 ");	
	    }else {
		   // a==0 && b==0
			System.out.println("(x,y)는 원점입니다. ");	
		}
	}

}
