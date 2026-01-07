package com.kh.exception.controller;

import java.util.Scanner;

public class A_UncheckedException {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * UncheckedException
	 * - RuntimeException(실행시 발생되는 예외들이 대표적인 Unchecked예외들)
	 * - RuntimeException의 자식 클래스들
	 *   1. ArrayIndexOutofBoundsException : 배열의 지정 범위를 넘어설때
	 *   2. NegativeArraySizeException : 배열의 크기가 음수
	 *   3. ClassCastException : 허용할 수 없는 형변한이 진행될 경우
	 *   ex) p1이 child2객체로 생성된 참조변수일 때, (Child1) p1 등을 수행
	 *   4. NullPointerException : 참조변수가 null인 상황에서 특정 메서드 및 필드에 접근하려고 할 때
	 *   5. ArithmeticException : 0으로 나누기 
	 *   ...
	 * 
	 * => 이러한 RuntimeException과 관련된 예외는 충분히 예측가능한 상황이다
	 *    예외 처리가 애초에 발생이 안되게끔, 대부분 조건문으로 해결이 가능하므로
	 *    굳이 예외처리코드를 깔 필요가 없다
	 * 
	 */
	
	public void method1() {
		// ArithmeticException 
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		try {
			// ArithmeticExcepton이 발생할 수 있는 코드
			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다.");
			e.printStackTrace(); // 오류를 로그로 출력하는 기능
		}
		System.out.println("프로그램 종료");
		
		// 예외처리 방법 1) 조건문으로 애초에 예외 배제 if(num2 == 0 ) -> return
		
		// 예외처리 방법 2) try-catch문으로 해결하기
		/*
		 * try ~ catch문
		 * - 예외가 발생했을 경우를 대비해서 실행할 내용을 정의해 두는 문법
		 * [표현법]
		 * try{
		 * 	  // 예외가 발생할 수 있는 코드
		 * } catch(발생될 수 있는 예외 클래스){
		 * 	  // 해당 예이가 발생시 실행할 구문
		 * }finally{
		 * 
		 * }
		 */
		
		
	}
}
