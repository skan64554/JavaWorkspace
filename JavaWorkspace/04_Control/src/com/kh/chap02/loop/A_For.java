package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	// <반복문> 실행할 코드를 반복적으로 수행하도록 도와주는 제어몬
	// 크게 for문 while문
	/*
	 * for(초기식; 조건식; 증감식) { 반복적으로 수행할 코드 } - 초기식 : 반복문이 시작될 떄 "초기에 단 한번만 실행되는 구문" -
	 * 조건식 : 반복문 수행 조건을 작성하는 구문 true일 때 수행하고, false일때 종료 - 증감식 : 반복문을 제어하는 변수값을
	 * "증감"시키는 구문
	 */
	Scanner sc = new Scanner(System.in);

	public void method1() {
		// 5회 반복하는 반복문
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요 " + i);
		}
	}

	public void method2() {
		// 1 2 3 4 5
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}

	public void method3() {
		// 1과 10사이의 정수 중 홀수만 출력
		System.out.print("출력결과 : ");
		for (int i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
	}

	public void method4() {
		// 1 ~ 10까지의 총 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method5() {
		// 1에서부터 매번 달라지는 "랜덤값"까지의 총 합계

		// java.lang.Math클래스의 random()을 호출하면 실수형의 랜덤값을 얻어올 수 있다
		// 0.0 <= 랜덤값 < 1.0
		// 코드 => 랜덤값 * 10 + 1
		int random = (int) (Math.random() * 10 + 1);
		int sum = 0;
		System.out.println("랜덤값 : " + random);
		System.out.println();
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
	}

	public void method6() {
		// 문자열의 문자를 반복
		// 문자열의 길이 .length()
		String str = "Slience"; // 문자열의 길이 : 7
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}

	public void method7() {
		// 중첩 반복문
		int i, j = 1;
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 8; j++) {
				System.out.print(" " + i + " x " + j + " = " + i * j);
			}
			System.out.println(" " + i + " x " + j + " = " + i * j);
			System.out.print(" ");
		}
	}

	public void method8() {
		// *****
		// *****
		// *****
		// *****

		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void method9() {
		// 1***
		// *2**
		// **3*
		// ***4
		
		for (int j = 1; j < 5; j++) {
			for (int i = 1; i < 5; i++) {
				if( i == j ) System.out.print(j);
				else System.out.print("*");		
			}
			System.out.println("");
		}
	}
	
	

}
