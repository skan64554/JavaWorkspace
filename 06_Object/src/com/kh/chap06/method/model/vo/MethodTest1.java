package com.kh.chap06.method.model.vo;

public class MethodTest1 {
	/*
	 * 메서드 [표현법] 접근제한자 예약어 자료형 메서드명([매개변수]){ // 수행할 코드
	 * 
	 * return 반환할 값 (생략가능) }
	 */
	String name;
	int num;

	// 1. 매개변수 x, 반환값 x
	public void method1() {
		System.out.println("매개변수 x , 반환값 x");
	}

	// 2. 매개변수 x, 반환값 o
	public int method2() {
		System.out.println("매개변수 x , 반환값 o");
		int random = (int) (Math.random() * 100 + 1);
		return random;
	}

	// 3. 매개변수 o, 반환값 x
	public void method3(int x, int y) {
		System.out.println("매개변수 o , 반환값 x");
		int min = 0;
		int max = 0;
		if (x > y) {
			min = y;
			max = x;
		} else {
			min = x;
			max = y;
		}
		System.out.println("최소값 : " + min + ", 최대값 : " + max);
	}

	// 4. 매개변수 o, 반환값 o
	public int add(int x, int y) {
		System.out.println("매개변수 o , 반환값 o");
		return x + y;
	}

}
