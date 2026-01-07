package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;

public class Run {
	public static void main(String[] args) {
		
		/*
		 * 에러(오류) 종류
		 * - 시스템 에러 : 컴퓨터상의 오작동, 소스코드로 수정 불가능
		 * - 컴파일 에러 : 소스 코드 상의 문법적인 문제, 빨간줄
		 * - 런타임 에러
		 * - 논리 에러 : 프로그램의 의도와 다른 결과
		 * 
		 * 예외처리
		 *  - 위와같은 예외들이 발생했을 경우를 대비해 사전에 정의하는 "예외처리"
		 *  - 예외처리를 하지 않으면 프로그램 실행중 예외가 발생하는 경우 프로그램이 작동 중지 한다
		 */
		A_UncheckedException a = new A_UncheckedException();
		a.method1();
	}
}
