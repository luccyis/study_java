package com.mycompany.study.ch09;

public class Television implements RemoteControl {

	int volume = 0;
	
	@Override
	public void turnOn() {
	}

	@Override
	public void turnOff() {
	}

	@Override
	public void setVolume(int volume) {
		int volumeNow = 0;
		if (volume > MAX_VOLUME) {
			volumeNow += MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			volumeNow += MIN_VOLUME;
		} else {
			volumeNow += volume;
		}
		System.out.println("현재 TV 볼륨: " + volumeNow);
	}

	
	
}
