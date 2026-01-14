package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증강연산자(단항연산자) ++ -- ++/-- : 변수에 담긴 값을 1 증가하거나 1 감소
	 * 
	 * ++/--변수(전위연산자) : 전위연산 -> 선증감 후처리 변수++/--(후위연산자) : 후위연산 -> 선처리 후증감
	 */

	public void method1() {
		int num = 10;
		System.out.println("전위연산 적용 전 num : " + num);
		System.out.println("1회 수행 : " + ++num);
		System.out.println("2회 수행 : " + ++num);
		System.out.println("3회 수행 : " + ++num);
		System.out.println("최종 num : " + num);

		int num2 = 10;
		System.out.println("후위연산 적용 전 num2 : " + num2);
		System.out.println("1회 수행 : " + num2++);
		System.out.println("2회 수행 : " + num2++);
		System.out.println("3회 수행 : " + num2++);
		System.out.println("최종 num : " + num2);
	}

	public void method2() {
		// 전위연산
		int a = 10;
		int b = ++a; // 11
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		// 후위연산
		int c = 10;
		int d = c++;
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
	
	public void method3() {
		int num1 = 20;
		int result1 = num1++ * 3; 
		
		System.out.println(num1);
		System.out.println(result1);
	}
	
	public void method4(){
        int a = 10;
        int b =20;
        int c = 30;
        //주석으로 어떻게 출력될거같은지 생각하기
        System.out.println(a++);// 10
        System.out.println((++a) + (b++)); // 32
        System.out.println((a++)+(--b)+(--c)); // 61
        System.out.printf("a: %d , b: %d, c: %d",a,b,c  ); //13,20,29
    }
	
}
