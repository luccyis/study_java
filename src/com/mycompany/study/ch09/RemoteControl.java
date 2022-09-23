package com.mycompany.study.ch09;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	default void setmute(boolean mute) {
		if (mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교체를 교환합니다.");
	}
		
	
	
	
}
