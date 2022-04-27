package com.yedam.java.homework;

public class Movie extends Culture {

	private String genre;

	public Movie() {

	}

	public Movie(String name, int dirNo, int actNo, String genre) {
		super(name, dirNo, actNo);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.println(this.genre + "제목 : " + this.name);
		System.out.println("감독 : " + this.dirNo);
		System.out.println("배우 : " + this.actNo);
		System.out.println(this.genre + "총점 : " + this.totalS);
		System.out.println(this.genre + "평점 : " + this.getGrade());

	};

}