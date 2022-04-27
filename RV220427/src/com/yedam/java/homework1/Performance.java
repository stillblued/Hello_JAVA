package com.yedam.java.homework1;

public class Performance extends Culture {

	private String genre;

	public Performance(String name, int direct, int act, String genre) {
		super(name, direct, act);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.printf("%s제목 : %s\n감독 : %d\n배우 : %d\n%s총점 : %d\n%s평점 : %s\n", this.genre, this.name, this.direct,
				this.act, this.genre, this.totalS, this.genre, this.getGrade());
	}

}
