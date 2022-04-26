package com.yedam.java.ch03_03;

public interface RemoteControl {

	// 상수필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메서드
	public abstract void turnOn();

	void turnOff();

	public void setVolume(int volume);

}
