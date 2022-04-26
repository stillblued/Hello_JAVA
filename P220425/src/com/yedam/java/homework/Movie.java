package com.yedam.java.homework;

public class Movie extends Culture {

	protected String genre;
	protected int audNo;
	protected int totalS;

	public Movie() {

	}

	public Movie(String name, int dirNo, int actNo, String genre) {
		super(name, dirNo, actNo);
		this.genre = genre;
	}

	@Override
	public void setTotalScore(int[] score) {
		for (int i = 0; i < score.length; i++) {
			this.totalS += score[i];
			this.audNo = score.length;
		}
	};

	@Override
	public String getGrade() {
		double result = (this.totalS / this.audNo);
		String star = null;
		if (result > 4) {
			star = "☆☆☆☆☆";
		} else if (result > 3) {
			star = "☆☆☆☆";
		} else if (result > 2) {
			star = "☆☆☆";
		} else if (result > 1) {
			star = "☆☆";
		} else {
			star = "☆";
		}
		return star;
	};

	@Override
	public void getInformation() {
		System.out.println(this.genre + "제목 : " + this.name);
		System.out.println("감독 : " + this.dirNo);
		System.out.println("배우 : " + this.actNo);
		System.out.println(this.genre + "총점 : " + this.totalS);
		System.out.println(this.genre + "평점 : " + this.getGrade());

	};

}