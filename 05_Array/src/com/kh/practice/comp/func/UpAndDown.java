package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	Scanner sc = new Scanner(System.in);
	public void method() {
		int random = (int)((Math.random()*100+1));
		System.out.println(random);
		int cnt = 0;
		
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 :");
			int a = sc.nextInt();
			
			if(a<=0 && a>=101) {
				System.out.println("1~100사이의 숫자를 입력해주세요.");
				continue;
			}
			
			if(random > a) {
				System.out.println("UP !");
				cnt++;
				continue; 
			}
			if(random < a) {
				System.out.println("DOWN !");
				cnt++;
				continue; 
			}
			if(random == a) {
				System.out.println("정답입니다");
				System.out.println(cnt + "회만에 맞추셨습니다");
				break;
			}
			

		}
	}
}
