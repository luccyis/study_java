package com.mycompany.study.ch06;

public class Notice {

//	게시판 클래스
//	필드 : 모든 게시판은 초기값 필요
//	이름
//	조회수
//	사용여부(boolean 사용)
//	생성자1(이름)
//	생성자2 (이름, 조회수)
//	생성자3(이름, 사용여부)
//	생성자4(이름, 조회수, 사용여부)
	
	String name = "lucy";
	int view = 2000;
	boolean useNy = true;
	
	Notice(){
		
	}
	
	Notice(String name){
		this.name = name;
	}
	
	Notice(String name, int view){
		this.name = name;
		this.view = view;
	}
	
	Notice(String name, boolean useNy){
		this.name = name;
		this.useNy = useNy;
	}
	
	Notice(String name, int view, boolean useNy){
		this.name = name;
		this.view = view;
		this.useNy = useNy;
	}
	
	public void say() {
		System.out.println(" 이름: " +name+ " 조회수: " +view+ " 사용여부: " +useNy);
	}
	
	
}
