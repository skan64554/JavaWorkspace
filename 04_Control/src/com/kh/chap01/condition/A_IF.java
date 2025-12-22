package com.kh.chap01.condition;

import java.util.Scanner;

public class A_IF {
	/*
	 * 조건문 - 조건식을 통해 참/거짓을 판단해 값 출력 - 비교연산자, 논리연산자 사용하며 if, switch문을 주로 쓴다
	 */

	Scanner sc = new Scanner(System.in); // ctrl+shift+o 로 auto import

	public void method() {
		// 단독 if문 [표현법] if() { ... } else { ... }
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수입니다.");
		}

		if (num <= 0) {
			System.out.println("양수가 아니다.");
		}
	}

	public void method2() {

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0)
			System.out.println("양수입니다.");
		else
			System.out.println("양수가 아닙니다.");
	}	

	public void method3() {
		// 여러 개의 조건을 제시해야하는 경우 else if(조건식 2)
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if ( num > 0 ) System.out.println("양수입니다.");
		else if ( num < 0 ) System.out.println("음수입니다.");
		else System.out.println("0입니다.");
	}
	
	public void method4() {
		// 사용자가 입력한 나이르 가지고 어린이/청소년/성인인지 출력
		
		System.out.print("나이를 입력하세요 : ");
		int num = sc.nextInt();
		
		if ( 13 < num && num <= 19 ) System.out.println("청소년입니다.");
		else if ( 19 < num && num <= 60 ) System.out.println("성인입니다.");
		else if ( 60 < num ) System.out.println("어르신입니다.");
		else System.out.println("어린이입니다.");
	}
	
	public void method5() {
		// 성별과 이름을 입력받아, 이름과 성별을 출력
		// 성별은 M/F로 입력받고 출력시에는 남자,여자로 출력	
		System.out.print("이름을 입력하시오 : ");
		String name = sc.next();
		
		System.out.print("성별을 입력하시오 (M/F) : ");
		char a = sc.next().charAt(0);
		
		if ( a == 'M' || a == 'm' ) {
			System.out.println("성별은 남자이며 이름은 " + name + "입니다." );
		} else if ( a == 'F' || a == 'f' )
			System.out.println("성별은 여자이며 이름은 " + name + "입니다." );
		else System.out.println("중성");
	}
	
	public void method6() {
		// 사용자에게 이름을 입력받아 본인 이름과 일치하는지 비교
		System.out.print("이름을 입력하시오 : ");
		String name = sc.next();
		
		// 동등비교 연산자(==)는 문자열로 비교 불가 .equals 사용
		// 기본자료형(boolean,char,int ..)와 달리 참조자료형(String등)은 "==" 불가 
		// 기본자료형간 비교시 ==, != 사용가능
		// 참조자료형은 서로 값이 동일한지 비교할 때 .equals()를 사용
		if( name.equals("강민서") ) {
			System.out.println("강민서님 반갑습니다.");
		} else {
			System.out.println("이름이 일치하지 않습니다.");
		}
	}
	
}
