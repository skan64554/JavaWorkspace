package com.kh.chap02.encapsulation.run;
import com.kh.chap02.encapsulation.model.vo.*;
public class Run {
	/*
	 * 캡슐화 : 외부에서 조작하지 못 하도록 막는 기능
	 * 추상화를 통해 정의된 속성과 기능들을 묶어서 관리하는 기법으로
	 * "데이터의 접근제한"을 원칙으로 둔다
	 * 
	 * 외부로 부터 "데이터의 접근"을 막는 역할을 수행
	 * 객체 내부의 데이터를 반드시 확이하거나 사용해야하는 경우
	 * 객체 내부의 값을 조작할 수 있는 메서드를 추가로 작성해줘야 한다
	 */
	public static void main(String[] args) {
		Student a1 = new Student("강민서",0,0.0);
		a1.setName("이공팔");
		a1.setAge(25);
		a1.setHeight(170.3);
		
		String name = a1.getName();
		System.out.println(name);
	}

}
