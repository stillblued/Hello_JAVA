package com.yedam.java.homework;

public abstract class Culture {

	protected String name;
	protected int dirNo;
	protected int actNo;
	protected int audNo;
	protected int totalS;

	public Culture() {

	}

	public Culture(String name, int dirNo, int actNo) {
		super();
		this.name = name;
		this.dirNo = dirNo;
		this.actNo = actNo;
	}

	// 총점
	public void setTotalScore(int score) {
		this.audNo++;
		this.totalS += score;
	}

	// 평점
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
	}

	// 정보 출력 추상 메소드
	public abstract void getInformation();

}