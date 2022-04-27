package com.yedam.java.homework1;

public abstract class Culture {

	protected String name;
	protected int direct;
	protected int act;
	protected int audi;
	protected int totalS;

	public Culture(String name, int direct, int act) {
		super();
		this.name = name;
		this.direct = direct;
		this.act = act;
	}

	public void setTotalScore(int score) {
		this.totalS += score;
		this.audi++;
	}

	public String getGrade() {
		String star = null;
		int avgS = this.totalS / this.audi;
		if (avgS > 4) {
			star = "☆☆☆☆☆";
		} else if (avgS > 3) {
			star = "☆☆☆☆";
		} else if (avgS > 2) {
			star = "☆☆☆";
		} else if (avgS > 1) {
			star = "☆☆";
		} else {
			star = "☆";
		}
		;
		return star;

	}

	public abstract void getInformation();

}
