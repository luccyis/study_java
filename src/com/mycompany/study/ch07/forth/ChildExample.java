package com.mycompany.study.ch07.forth;

public class ChildExample {

	public static void main(String[] args) {
//		실행클래스
//		필드 : 적절히 생성
//		부모클래스 생성
//		부모클래스 메서드2 값 출력
//		자식클래스 생성
//		자식클래스 메서드 값 출력
//		부모클래스 메서드2 값과 자식클래스 메서드 값 차이 출력

		Parents sortFirst = new Parents();
		
		Child sortSecond = new Child();
		
		int[] arr = {24, 76, 8};
		
		System.out.println("정렬 전 --------------");
		sortFirst.printArr(arr);
		
		System.out.println("정렬 후 --------------");
		sortFirst.SortByAsc(arr);
		sortFirst.printArr(arr);
		
		System.out.println("부모 메서드 2 --------------");
		System.out.println(sortFirst.getSum(arr));
		
		System.out.println("자식 메서드 2 --------------");
		System.out.println(sortSecond.getSum(arr));
		
		System.out.println("값 차이 ---------------");
		System.out.println(sortFirst.getSum(arr) - sortSecond.getSum(arr));
		
	}

}
