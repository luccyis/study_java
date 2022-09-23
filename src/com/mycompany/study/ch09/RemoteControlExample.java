package com.mycompany.study.ch09;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.setmute(true);
		remoteControl.setmute(false);
		remoteControl.setVolume(-10);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
	}

}
