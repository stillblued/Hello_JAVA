package com.yedam.java.ch03_03;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(20);

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

	}

}
