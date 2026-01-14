package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
// switch(조건식) case 값1 : ...; break; default : ...;
	
// switch문의 장점 
// case를 통해 내가 실행하길 원하는 코드로 프리패스 -> if ~ else 보다 빠름
// 자주 사용되지는 않지만, 정밀한 연산결과가 "동일한 속도"로 수행되어야 하는 경우 사용
// ex) 키보드 입력, 마우스 입력
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// 1~3 사이의 정수값을 입력받아 1-> 빨간불, 2->파란불, 3->초록불, 아닌 경우 잘못 입력했습니다 출력
		System.out.print("1~3 사이의 정수를 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("빨간불");
			break;
		case 2:
			System.out.println("파란불");
			break;
		case 3:
			System.out.println("초록불");
			break;
		default:
			System.out.println("잘못 입력했습니다");
			break;
		}
	}
	
	public void method2() {
		// 사용자에게 구매할 과일명을 입력받아
		// 각 과일마다의 가격을 출력
		// 사과(1000), 바나나(2000), 복숭아(3000), 망고(3000)
		
		System.out.print("구매하실 과일을 입력(사과, 바나나, 복숭아) : ");
		String fruit = sc.next();
		
		int price = 0;
		switch(fruit) {
		case "사과":
			price += 1000;
			break;
		case "바나나":
			price += 2000;
			break;
		case "망고" :
		case "복숭아":
			price += 3000;
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
		}
		
		System.out.println( fruit + "의 가격은 " + price + "입니다.");
	}
}
