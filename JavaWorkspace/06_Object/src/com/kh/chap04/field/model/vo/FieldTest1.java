 package com.kh.chap04.field.model.vo;

public class FieldTest1 {
	/*
	 * 필드 == 인스턴스 변수 == 멤버 변수
	 * 
	 * 변수 구분
	 * 1. 전역변수 : 클래스영역 바로 아래에 선언하는 변수
	 *  -필드 == 인스턴스 변수 == 멤버 변수
	 *  생성시점 : 객체가 메모리에 할당되면서 생성
	 *  소멸시점 : 객체가 소멸할 때 함께 소멸
	 * 
	 *  -클래스변수 == static 변수
	 *   생성시점 : 프로그램 시작과 동시에 static 영역에 메모리 할당
	 *   소멸시점 : 프로그램 종료시
	 *
	 * 2. 지역변수
	 *  생성시점 : 특정영역이 실행될 때 저장공간이 할당(stack)
	 *  소멸시점 : 특정영역이 끝날 때
	 */
	
	private int global;// 전역변수 (필드)
	{
		// 초기화 블럭
		// 객체 생성시 최초 1회 실행
		global = 50; // 거의 안 쓰니까 잊어도 됨
	}
	
	public static int num;
	// static 초기화 블럭
	static {
		// static 변수를 초기화 하는데 사용
		num = 11;
	}
	
	public void test(int num){// 매개변수(지역변수) 
		int local = 0; // 지역변수
		
		if(true) {
			int a = 0;
		}
		// 전역변수의 저장위치는 heap 메모리영역임
		// 이 공간은 비어있을 수 없기 때문에 jvm 자료형의 기본값으로 초기화 시켜둠
		System.out.println(global);
		System.out.println(local);
		System.out.println(num);
		//System.out.println(a);
		
		FieldTest2 ft2 = new FieldTest2();
		System.out.println(ft2.pub);
		System.out.println(ft2.pro);
	}
}
