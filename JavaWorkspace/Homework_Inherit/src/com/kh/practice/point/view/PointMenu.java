package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원 "); //circleMenu();
		System.out.println("2. 사각형 "); //rectangleMenu();
		System.out.println("9. 끝내기 "); 
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			circleMenu();
			break;
		case 2:
			rectangleMenu();
			break;
		case 9:
			return;
		}
	}
	 public void circleMenu() {
	        System.out.println("===== 메뉴 =====");
			System.out.println("1. 원 둘레 "); //calcPerimeter()
			System.out.println("2. 원 넓이 "); //calcRectArea()
			System.out.println("3. 메인으로 "); 
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcArea();
				break;
			case 3:
				return;
			}
	        
	    }
	 
	private void calcCircum() {
		// TODO Auto-generated method stub
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum(x,y,radius));
	}
	private void calcArea() {
		// TODO Auto-generated method stub
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(x,y,radius));
	}
	public void rectangleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레 "); //calcPerimeter()
		System.out.println("2. 사각형 넓이 "); //calcRectArea()
		System.out.println("3. 메인으로 "); 
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 3:
			return;
		}
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcPerimemter(x,y,height,width));
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcArea(x,y,height,width));
	}
	
}
