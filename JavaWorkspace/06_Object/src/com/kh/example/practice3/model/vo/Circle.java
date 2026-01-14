package com.kh.example.practice3.model.vo;

public class Circle {
	private final double PI = 3.14;
	private static int radius = 1;

	public Circle() {
		
	}
	
	public void incrementRadius() {
		this.radius++;
	}
	
	public void getAreaOfCricle() {
		System.out.println(radius * 2 * PI);
	}
	
	public void getSizeOfCircle(){
		System.out.println(radius*radius*PI);
	}
}
