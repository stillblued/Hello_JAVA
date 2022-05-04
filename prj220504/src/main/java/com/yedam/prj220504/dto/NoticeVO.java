package com.yedam.prj220504.dto;

import java.sql.Date;

public class NoticeVO {
	private int id; // 순번
	private String writer; // 작성자
	private String title; // 제목
	private String contents; // 내용
	private Date wdate; // 작성일자
	private int hit; // 조회수

	public NoticeVO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getWdate() {
		return wdate;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		System.out.print(id + " : ");
		System.out.print(writer + " : ");
		System.out.print(title + " : ");
		System.out.print(wdate + " : ");
		System.out.println(hit);
		return null;
	}
}
