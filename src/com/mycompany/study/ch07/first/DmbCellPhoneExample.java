package com.mycompany.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		//부모 객체를 생성하고 powerOn 메서드 실행

		CellPhone cellPhone = new CellPhone();
		cellPhone.powerOn();
		
		//자식 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		
		//자식 객체의 turnOffDmb 실행
		dmbCellPhone.turnOffDmb();
		
		//생성자를 이용하여 자식 객체 생성
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone("iphone14", "purple", 68);
		
		//dmbCellPhone2 객체를 사용하여 자식 클래스의 함수 전체 호출
		dmbCellPhone2.turnOnDmb();
		dmbCellPhone2.changeChannelDmb(45);
		dmbCellPhone2.turnOffDmb();
		
		//dmbCellPhone2 객체를 사용하여 부모 클래스의 함수 전체 호출
		dmbCellPhone2.powerOn();
		dmbCellPhone2.powerOff();
		dmbCellPhone2.receiveVoice("hi");
		dmbCellPhone2.sendVoice("hello");
		dmbCellPhone2.hangup();
		
		
	
	
		
		
		
		
		
	}

}
