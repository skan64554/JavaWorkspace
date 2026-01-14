package com.kh.chap01_poly.part01.model.vo;

public class Child2 extends Parent {
	
	public Child2() {
		super();
		System.out.print("C");
		// TODO Auto-generated constructor stub
	}

	public Child2(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void printChild2() {
		System.out.println("Child2 메서드");
	}
	
	@Override
	public void print() {
		System.out.println("오버라이딩한 자식 메서드2");
	}
}
