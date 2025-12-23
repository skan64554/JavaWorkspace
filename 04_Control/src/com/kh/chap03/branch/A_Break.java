package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	Scanner sc = new Scanner(System.in);
	// break : 현재 속해있는 가장 가까운 반복문 탈출
	
	public void method1() {
		// 매번 반복적으로 랜덤값(1~100) 출력
		// 랜덤값이 3의 배수인 경우 반복 종료
		
		while(true) {
			int random = (int)(Math.random()*100+1);
			System.out.println("랜덤값 : " + random );
			
			if(random%3==0) break;
		}
	}
	
	public void method2() {
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			
			System.out.println(str + "의 글자수 : "+str.length());
			if(str.equals("exit")){
				System.out.println("종료");
				break;
			}
		}
	}
	
	public void method3() {
		// 무한반복으로 사용자에게 양수를 입력 받아 1부터 사용자가 입력한 값까지 출력
		// 입력하고 프로그램 종료
		
		int i = 1;
		System.out.print("값을 입력 : ");
		int input = sc.nextInt();
		
		while(true) {	
			if(input > 0) {
				while( i <= input) {
					System.out.print(i++ + " ");
					break;
				}
			}	
		}		 
	}
	
	public void method4() {

		loop1: // 심볼
		for(int i = 0; i < 10; i++) {
			loop2:
			for(int j = 0; j < 10; j++) {
				System.out.println(i);
				if(i == 5) break loop1; // break 영역 지정
			}
		}
	}
	
}

