package com.yedam.java.homework2;

public class PortableNotebook implements Notebook, Tablet {

	public int mode;
	public String document;
	public String internet;
	public String video;
	public String app;

	public PortableNotebook(String document, String internet, String video, String app) {
		super();
		this.mode = NOTEBOOK_MODE;
		System.out.println("NOTEBOOK MODE");
		this.document = document;
		this.internet = internet;
		this.video = video;
		this.app = app;
	}

	@Override
	public void watchVideo() {
		System.out.printf("%s를 시청.\n", this.video);
	}

	@Override
	public void useApp() {
		if (this.mode == Notebook.NOTEBOOK_MODE) {
			this.mode = Tablet.TABLET_MODE;
			System.out.printf("%s을 실행.\n", this.app);
		} else if (this.mode == Tablet.TABLET_MODE) {
			System.out.printf("%s을 실행.\n", this.app);
		}
		;
	}

	@Override
	public void writeDocumentaion() {
		System.out.printf("%s을 통해 문서를 작성.\n", this.document);
	}

	@Override
	public void searchInternet() {
		System.out.printf("%s을 통해 인터넷을 검색.\n", this.internet);
	}

	public void changeMode() {
		if (this.mode == Notebook.NOTEBOOK_MODE) {
			this.mode = Tablet.TABLET_MODE;
			System.out.println("TABLET MODE");
		} else if (this.mode == Tablet.TABLET_MODE) {
			this.mode = Notebook.NOTEBOOK_MODE;
			System.out.println("NOTEBOOK MODE");
		} else {
			System.out.println("모드 변경 : NOTEBOOK MODE(1) / TABLET MODE(2)");
		}
	}

}
