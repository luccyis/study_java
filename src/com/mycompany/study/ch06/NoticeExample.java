package com.mycompany.study.ch06;

public class NoticeExample {

	public static void main(String[] args) {

//		게시판 실행 클래스
//		초기값 출력
//		각 생성자별 객체의 필드들 전체 출력
		
		Notice notice = new Notice();
		
		Notice notice1 = new Notice("루씨");
		
		Notice notice2 = new Notice("고명지", 3000);
		
		Notice notice3 = new Notice("tony", true);
		
		Notice notice4 = new Notice("wonyoung", 4000, true);

		
		notice.say();
		notice1.say();
		notice2.say();
		notice3.say();
		notice4.say();
	}

}
