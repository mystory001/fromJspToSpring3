package com.mystroy001.domain;

import java.sql.Timestamp;

public class MemberDTO {
	
	//데이터 은닉과 캡슐화
	//멤버변수 변수를 아무나 접근 못하게 막아줌 => 데이터 은닉
	
	private String id;
	private String pw;
	private String name;
	private Timestamp date;
	
	//데이터 접근을 위한 public 메소드 정의(getter, setter)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}

}
