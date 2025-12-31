package com.kh.kw.shape.view;

import java.util.Scanner;

import com.kh.kw.shape.controller.SquareController;
import com.kh.kw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int type = sc.nextInt();
		
		if(type == 3) {
			triangleMenu();
		}else if (type == 4) {
			squareMenu();
		}else if (type == 9) {
			System.out.println("프로그램 종료");
			System.out.println();
			return;
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			inputMenu();
			return;
		}
	}

	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int menuNum = sc.nextInt();
		
		if(menuNum == 1) {
			inputSize(3,menuNum);
		}else if (menuNum == 2) {
			inputSize(3,menuNum);
		}else if (menuNum == 3) {
			printInformation(3);
		}else if (menuNum == 9){
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
			System.out.print("메뉴 번호 : ");
		}else {
			System.out.print("잘못된 번호입니다. 다시 입력해주세요.");
			triangleMenu();
			return;
		}
	}

	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum == 1) {
			inputSize(4,menuNum);
			
		}else if (menuNum == 2) {
	
			inputSize(4,menuNum);
		}else if (menuNum == 3) {
			inputSize(4,menuNum);
		}else if (menuNum == 4){
			printInformation(4);
		}else if (menuNum == 9){
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
			System.out.print("메뉴 번호 : ");
		}else {
			System.out.print("잘못된 번호입니다. 다시 입력해주세요.");
		    squareMenu();
			return;
		}
	}

	public void inputSize(int type, int menuNum) {
		// int type = 3(삼각형) , menuNum = 1
		// int type = 3(사각형) , menuNum = 2
		// int type = 4(사각형) , menuNum = 1 or 2
		// meanuNum = 1
		// meanuNum = 2
		// in type = 4 , menuNum = 3
		if(type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			double a = sc.nextDouble();
			
			System.out.print("너비 : ");
			double b = sc.nextDouble();
			
			System.out.println("삼각형 면적 : " + tc.calcArea(a,b));
			inputMenu(); 
		
		}else if(type == 3 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			String c = sc.next();
			tc.paintColor(c);
			System.out.println("색이 수정되었습니다");
			inputMenu(); 
		}else if (type == 4 && ( (menuNum == 2) || (menuNum == 1))) {
			System.out.print("높이 : ");
			double a = sc.nextDouble();
			
			System.out.print("너비 : ");
			double b = sc.nextDouble();
			if(menuNum == 1) {
				System.out.println("사각형 둘레 : " + scr.calcPerimeter(a, b));
				inputMenu(); 
			}else if(menuNum == 2) {
				System.out.println("사각형 면적 : " +scr.calcArea(a, b));
				inputMenu(); 
			}
		}else if(type == 4 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			String c = sc.next();
			scr.paintColor(c);
			System.out.println("색이 수정되었습니다");
			inputMenu(); 
		}else {
			System.out.println("잘못된 번호입니다 다시 입력해주세요");
			inputMenu();
			return;
		}
	}

	public void printInformation(int type) {
		if( type == 3 ) {
			System.out.println(tc.print());
			inputMenu(); 
		}else if ( type == 4 ){
			System.out.println(scr.print());
			inputMenu(); 
		}
	}
}
