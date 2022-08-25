package com.mycompany.study.ch07.first;

public class DmbCellPhone extends CellPhone {
//자식
	
	//필드
	int channel = 0;
	
	//생성자 (명시적 생성자)
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//기본생성자
	DmbCellPhone(){
		
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("전원을 켭니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널: " + channel + "번으로 바꿉니다" );
	}

	
	
}