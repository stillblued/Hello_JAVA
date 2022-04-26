package com.yedam.java.homework;

public class PortableNotebook implements Notebook, Tablet {

	public int MODE;
	public String document;
	public String internet;
	public String video;
	public String app;

	public PortableNotebook(String document, String internet, String video, String app) {
		this.MODE = NOTEBOOK_MODE;
		System.out.println("※NOTEBOOK MODE※");
		this.document = document;
		this.internet = internet;
		this.video = video;
		this.app = app;
	}

	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청.");
	}

	@Override
	public void useApp() {
		if (MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println(app + "을 실행.");
		} else if (MODE == TABLET_MODE) {
			System.out.println(app + "을 실행.");
		} else {
			System.out.println("다시 입력하세요");
		}
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(document + "을 통해 문서를 작성.");
	}

	@Override
	public void searchInternet() {
		System.out.println(internet + "을 통해 인터넷을 검색.");
	}

	public void changeMode() {
		if (MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println("※TABLET MODE※");
		} else if (MODE == TABLET_MODE) {
			MODE = NOTEBOOK_MODE;
			System.out.println("※NOTEBOOK MODE※");
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

}
