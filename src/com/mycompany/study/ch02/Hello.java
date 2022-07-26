package com.mycompany.study.ch02;

/**
 * @author ezen
 *
 */
public class Hello {

	public static void main(String[] args) {
		
		
//		  데이터타입 변수명 = 값;
//		 데이터타입 변수명
		 
		boolean abc = true;
		boolean xyz;
	
		
		String width = "고명지";
		
		String movieTitle = "탑건: 매버릭";
		String story = "한순간의 실수도 용납되지 않는 하늘 위, 가장 압도적인 비행이 시작된다!";
		int rank = 2;
		double audienceReview = 9.7;
		String showType = "2D, 2D ATMOS, 2D Dolby";
		String director = "조셉 코신스키";
		String cast ="톰 크루즈, 마일즈 텔러, 제니퍼 코넬리, 존 햄, 에드 해리스, 글렌 포웰, 제이 앨리스, 그렉 타잔 데이비스";
		String genres = "액션";
		int runningTime = 130;
		String age ="12+";
		int audienceNumber = 6573409;
		
		System.out.println("movieTitle 변수에 들어가 있는 값은: " + movieTitle);
		System.out.println("스토리 미리보기 " + story);
		System.out.println("예매율 : " +rank);
		System.out.println("감독 : " +director);
		System.out.println("상영타입 : " + showType);
		System.out.println("관람객 평점 :"+ audienceReview);
		System.out.println("출연진 : " + cast);
		System.out.println("러닝타임 : "+ runningTime +"분");
		System.out.println("장르 : " + genres);
		System.out.println("관람 등급 : "+ age);
		System.out.println("관객수 : "+ audienceNumber + "명");
	}

}
