package com.mycompany.study.ch04;

public class ForExample {

	public static void main(String[] args) {
		
//		***********
//		***********
//		***********
//		***********
//		***********
//		출력하는 프로그램을 만드시오
	
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j<=8; j++) {
			System.out.print("*");
			if(j == 8) {
				System.out.printf("%n");
				}
			}
		
		}

		System.out.println("-------------------");
//		for(int i = 1; i <=5; i++) {
//			
//			System.out.println("***********");
//		}
		
//		************
//		*          *
//		*          *
//		*          *
//		************
//		출력하는 프로그램을 만드시오
		
		

		for(int i =1; i <=5; i++) {
			if(i ==1 | i ==5) {
				for(int j=1; j <=10; j++) {
					System.out.print("*");
					if (j == 10) {
						System.out.printf("%n");
					} 
				}
			} else {
				for(int k =1; k <= 10; k++) {
					if(k == 1 | k == 10) {
						System.out.print("*");
						if (k == 10) {
							System.out.printf("%n");
						}
					} else {
						System.out.print(" ");
					}
				}
			}
		}	
		System.out.println("-------------------");	
			
			
		
		
//		for(int i = 1; i <=5; i++) {
//			if(i == 1 ^ i == 5) {
//				System.out.println("************");
//			} else {
//				System.out.println("*          *");
//			}
//		}

//		
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		1 3 5 7 90
//		출력하는 프로그램을 만드시오
		
	
		String sum = "";
		
		for(int i = 1; i <=10; i++) {
			sum += i;
			if(i == 10) {
				System.out.println("1 3 5 7 90");
			} else {
				System.out.println(sum);
			}
		}
		
//		do {
//			sum += i ;
//			System.out.println(sum );
//			i++;
//		} while (i <10);
//		
		

		
	}

}
