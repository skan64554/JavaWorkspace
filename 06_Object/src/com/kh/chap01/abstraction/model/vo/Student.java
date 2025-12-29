package com.kh.chap01.abstraction.model.vo;

public class Student {
	
	//학생관리 프로그램을 만든다고 가정
	//학생관 관련된 속성 : 이름,번호,나이,성별,전화번호,주소 등
	//이름, 나이, 키 3가지 정보만 관리

	public String name; // 필드, 클래스 바로 아래의 변수
	public int age;
	public double height;
	
	//학생 객체가 가지는 기능
	public void study() {
		System.out.println("공부중...");
	}
	
	
	
}
