package com.bit.model;

import java.util.Date;

public class BoardDto {
	private int num;
	private String userId, sub, content;
	private Date nalja;
	
	public BoardDto() {
	}

	public BoardDto(int num, String userId, String sub, String content, Date nalja) {
		super();
		this.num = num;
		this.userId = userId;
		this.sub = sub;
		this.content = content;
		this.nalja = nalja;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	@Override
	public String toString() {
		return "BoardDto [num=" + num + ", userId=" + userId + ", sub=" + sub + ", content=" + content + ", nalja="
				+ nalja + "]";
	}
	
	
}
