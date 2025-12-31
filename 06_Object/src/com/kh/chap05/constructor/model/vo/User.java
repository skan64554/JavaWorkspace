package com.kh.chap05.constructor.model.vo;

public class User {
	//필드부
	private String userId;
	private int age;
	private char gender;
	
	/*
	 * 생성자 : 객체를 생성하는 기능을 담당
	 * public 클래스명 (매개변수){
	 * 생성자를 통해 객체 생성시 실행할 코드
	 * }
	 * 
	 * 생성자 작성 목적
	 * 1. 객체를 생성해주기 위함
	 * 2. 객체생성과 동시에 매개변수를 전달된 값을 통해 필드를 초기화할 목적으로도 사용
	 * 
	 * 생성자 작성 시 주의사항
	 * 1. 클래스명과 동일해야한다(대/소문자 포함)
	 * 2. 반환형이 존재하지 않는다
	 * 3. 여러개 생성이 가능하지만, 매개변수가 중복되면 안된다(오버로딩)
	 * 4. 매개변수 생성자를 명시적으로 작성하면, 기본생성자를 jvm이 만들지 않는다
	 */
	
	// 생성자부
	// 생성자 미 작성이 JVM이 자동으로 만들어주는 기본 생성자
	// 다른 생성자가 있으면 JVM이 기본생성자를 추가하지 않음
	public User() {
		System.out.println("기본 생성자 호출");
	}
	// 매개변수 있는 생성자
	// - 전달받은 매개변수를 통해 필드를 초기화활 목적으로 사용하는 생성자
	public User(String userId) {
		this.userId = userId;
	}
	
	public User(String userId, int age, char gender) {
		// 다른 생성자에서 동일한 필드값을 초기화 하고 있는 경우,
		// 현재 생성자에서 다른 생성자를 호출하는 방식으로 코드를 줄일 수 있다

		this(userId); // this생성자 호출
		//this.userId= userId;
		this.age = age;
		this.gender = gender;
	}
	// 메서드부
	// set/get 메서드 생성
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void jj() {
		
	}
}
