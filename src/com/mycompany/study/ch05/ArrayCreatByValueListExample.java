package com.mycompany.study.ch05;

public class ArrayCreatByValueListExample {

	public static void main(String[] args) {

		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemisty = {88, 99, 45, 86, 34};
		
		String[] name = {"장원영", "장동건", "고소영"};
		
		System.out.println("누굴까: " + name[2]);
		
//		scoreChemisty 의 평균을 구해서 출력하시오.
		
		double avg = 0.0;
		double sum = 0.0;
		
//		for(int i=0; i<=4; i++)
		for(int i=0; i<scoreChemisty.length; i++) {
			sum += scoreChemisty[i];
		}
		avg += (sum/scoreChemisty.length);
//		avg += (sum/5);
		System.out.println("평균값: "+ avg);
	}

}
