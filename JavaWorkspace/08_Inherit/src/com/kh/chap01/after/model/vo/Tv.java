package com.kh.chap01.after.model.vo;

public class Tv extends Product {
	
	private int inch;
	
	public Tv() {
		
	}
	
	public Tv(String brand, String pCode, String pNade, int price, int inch) {
		super(brand, pCode, pNade, price);
		this.inch = inch;
	}
	
	public String information() {
		return super.information() +", " + inch;
	}
}
