package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 논리 연산자
	 *  - 논리 값 두개를 비교하는 연산자
	 * AND && : a && b -> a와 b가 모두 참일 경우 true 반환
	 * OR || : a || b -> a 혹은 b가 참일 경우 true 반환
	 */
	
	public void method1() {
		System.out.print("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		// num의 값이 0보다 크면서 짝수입니까?
		boolean result = ( (num > 0) && (num%2==0) );
		System.out.println(result);
	}
	
	public void method2() {
		// 입력한 값이 1 이상 100 이하의 숫자인지 확인.
		System.out.print("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean result = ((1<=num) && (num<=100));
		System.out.println(result);
	}
	
	public void method3() {
		// 사용자가 입력한 값이 'y'거나 'Y'인 경우
		System.out.print("문자를 하나 입력하세요 : ");
	    char str = sc.next().charAt(0);
	    
	    boolean result = ( str=='y' || str=='Y');
	    System.out.println(result);
	}
	
	public void method4() {
		int num1 = 10;
		boolean result1 = (num1 < 5) && (num1++ > 0);
		
		System.out.println("result1 : " + result1);
		
		int num2 = 10;
		boolean result2 = ((num2 < 20) || (++num2 > 0));
		System.out.println();
		System.out.println(num2);
	}
	
	

}
