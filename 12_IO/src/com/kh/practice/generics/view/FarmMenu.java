package com.kh.practice.generics.view;

import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;

public class FarmMenu {
	
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("========== KH 마트 ==========");
			System.out.print("******* 메인 메뉴 *******\r\n"
					+ "1. 직원메뉴 // adminMenu() 실행\r\n"
					+ "2. 손님 메뉴 // customerMenu()\r\n"
					+ "9. 종료 // “프로그램 종료.” 출력 후 main()으로 리턴\r\n"
					+ "메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: adminMenu();
			case 2: customerMenu();
			case 9: System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void adminMenu() {
		
		
		while(true) {
			System.out.print("******* 직원 메뉴 *******\r\n"
					+ "1. 새 농산물 추가 // addNewKind() 실행\r\n"
					+ "2. 종류 삭제 // removeKind()\r\n"
					+ "3. 수량 수정 // changeAmount()\r\n"
					+ "4. 농산물 목록 // printFarm()\r\n"
					+ "9. 메인으로 돌아가기 // mainMenu()로 리턴\r\n"
					+ "메뉴 번호 선택 :");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: addNewKind();
			case 2: removeKind();
			case 3: changeAmount();
			case 4: printFarm();
			case 9: 
				mainMenu();
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void customerMenu() {
		
		
		while(true) {
			System.out.print("******* 고객 메뉴 *******\r\n"
					+ "1. 농산물 사기 // buyFarm() 실행\r\n"
					+ "2. 농산물 빼기 // removeFarm()\r\n"
					+ "3. 구입한 농산물 보기 // printBuyFarm()\r\n"
					+ "9. 메인으로 돌아가기 // mainMenu()로 리턴\r\n"
					+ "메뉴 번호 선택 :");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: buyFarm();
			case 2: removeFarm();
			case 3: printBuyFarm();
			case 9: 
				mainMenu();
				return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void addNewKind() {
		
	}
	
	public void removeKind() {
		
	}
	
	public void changeAmount() {
		
	}
	
	public void printFarm() {
		
	}
	
	public void buyFarm() {
		
	}
	
	public void removeFarm() {
		
	}
	
	public void printBuyFarm() {
		
	}
}
