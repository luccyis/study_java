package com.mycompany.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

//		국어,영어,수학
//		1. 개인의 평균
//		2. 과목별 평균
		
		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
//		System.out.println("scores[1][1]: " + scores[1][1]);
//		
//		System.out.println("scores[2][0]: " + scores[2][0]);
		
		String[] name = {"장원영", "장동건", "고소영", "고명지", "최재원"};
		String[] subject = {"국어", "영어", "수학"};
		

		for(int i=0; i<scores.length; i++) {
			int sum =0;
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
				}
			System.out.println(name[i] + "평균 점수는: " + ((double)sum/3));
			}
		
		
		for(int j=0; j<3; j++) {
			int sum = 0;
			for(int i=0; i<scores.length; i++) {
				sum += scores[i][j];
			}
			System.out.println(subject[j] + "과목의 평균 점수는: " +  ((double)sum/5));
		}
		
		
		
		
	}

}
