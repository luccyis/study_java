package com.mycompany.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {

		//일반:1, 5% 할인적용 
		//브론즈 :2 , 10 % 할인적용 
		//실버 :3, 15% 할인적용 
		//골드 :4, 20% 할인적용 
		//플래티넘 :5, 2.7% 할인적용 
		
		//정가 : 할인가 

		int grade = 2;
		int cost = 12000;
		double salesCost = 0.0;
		
		switch(grade) {
		case 1:
			salesCost = cost * (1-0.05);
			System.out.println("정가가 "+ cost + "원 인 일반 등급의  할인가는 :"+ (int)salesCost + "원입니다.");
			break;
		case 2:
			salesCost =cost * (1-0.1);
			System.out.println("정가가 "+ cost + "원 인 브론즈 등급의  할인가는 :"+ (int)salesCost + "원입니다.");
			break;
		case 3 :
			salesCost =cost* (1-0.15);
			System.out.println("정가가 "+ cost  + "원 인 실버 등급의  할인가는 :"+ (int)salesCost + "원입니다.");
			break;
			
		case 4 :
			salesCost = cost * (1-0.2);
			System.out.println("정가가 "+ cost + "원 인 골드 등급의  할인가는 :"+ (int)salesCost + "원입니다.");
			break;
		case 5:
			salesCost = cost * (1-0.027);
			System.out.println("정가가 "+ cost + "원 인 플레티넘 일반등급의  할인가는 :"+ (int)salesCost + "원입니다.");
			break;
		default:
			System.out.println("1~5 까지의 grade 만 가능합니다. ");	
		}
		
	}

}
