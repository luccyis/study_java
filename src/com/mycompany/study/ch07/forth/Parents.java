package com.mycompany.study.ch07.forth;

public class Parents {
//	부모클래스 
//	필드 : 합
//	메서드 : 정수 3개를 오름차순 정렬 (직접 구현) void
//	메서드2 : 순서1*순서2 + 순서3 : return 합
	int sum = 0;
	int[] arr = new int[3];
	
	public void SortByAsc(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public int getSum(int arr[]) {
		sum = (arr[0] * arr[1]) + arr[2];
		return sum;
	}
	
	public void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println(" ");
	}
}
