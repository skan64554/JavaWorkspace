package com.kh.chap02.encapsulation.model.vo;


public class Student {
	// 속성 == 필드 == 멤버변수 == 인스턴스 변수 == 전역 변수
	
	private String name; // 필드, 클래스 바로 아래의 변수
	private int age;
	private double height; // 접근제어자를 private으로 바꿔 캡슐화 완료
	
	public Student() {
		
	}
	
	public Student(String name,int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	// 메서드 작성방법
	// [표현법]
	// 접근제한자 [예약어] 반환형 메서드명(매개변수) {  }
	
	// 캡슐화된 필드에 접근하여 값을 조작할 수 있는 메서드
	// setter/getter 메서드
	
	// name 필드에 값을 초기화하는 용도의 메서드
	// 초기화를 위해선 값을 얻어와야 하므로 매개변수가 존재한다
	// 초기화를 진행한 후 값을 반환할 필요가 없을 경우는 void
	public void setName(String name) {
		this.name = name;
		// name=name <- 필드명과 매개변수명이 동일한 경우
		// {}내에 선언한 변수의 우선순위가 높아 name은 항상 매개변수 name을 가리킴
		// 필드로써 name을 가리키고자 한다면 this.name을 사용
		
		// this
		// 모든 메서드에 묵시적으로 존재하는 변수로, 생성된 객체의 주소값이 담겨있음
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	// 데이터를 반환하기 위한 용도의 getter 메서드
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getHeight() {
		return this.height;
	}

}
