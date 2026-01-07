package com.kh.practice.token.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열 \r\n"
					+ "2. 입력 문자열 \r\n"
					+ "3. 프로그램 끝내기\r\n");
					System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못입력하셨습니다 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String at = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + at);
		System.out.println("토큰 처리 후 개수 : " + at.length());
		System.out.println("모두 대문자로 변환 : " + at.toUpperCase());
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.next(); 
		tc.firstCap(input);
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char find = sc.next().charAt(0);
		int cnt = tc.findChar(input, find);
		
		System.out.println(find + " 문자가 들어간 개수 : " + cnt);
		
		
		
		
	}
}
