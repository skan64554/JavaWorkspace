package com.kh.chap02.loop;

public class B_While {
	
	public void method1() {
		// for문을 while문으로 변경
		
//		// 5회 반복하는 반복문
//		for (int i = 0; i < 5; i++) {
//			System.out.println("안녕하세요 " + i);
//		}
		
		int i = 0;
		while(i++ < 5) {
			System.out.println("안녕하세요");
		}
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 0;
		while(i++ < 5) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		// 1부터 랜덤값(1~10)까지의 총 합계를 while문으로 작성
		
		int i = 1;
		int random = (int)(Math.random() * 10 + 1);
		int sum = 0;
		
		while( i <= random ) {
			sum += i++;
		}
		System.out.println("1부터" + random + " 까지의 합계는 " + sum + "입니다.");
	}
	
	public void method4() {
		
		int i = 0;
		do{
			i++;
		}while(i < 0);
		System.out.println(i); // 최초 1회는 반드시 수행
	}
	
	public void method5() {
		// 생략
	}
	
	public void method6() {
		
	}
	
}