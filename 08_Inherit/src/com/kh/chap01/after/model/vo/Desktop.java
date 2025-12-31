package com.kh.chap01.after.model.vo;

public class Desktop extends Product {

	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// 방법 3. 부모생성자 호출하기
		super(brand,pCode,pName,price);
		this.allInOne = allInOne;
		// this 자기 자신의 주소값, super는 부모의 주소값
		
		// super()
		// 상속 메모리 구조 보여주기
		// 방법 1. 자식클래스에서 부모클래스의 필드에 접근 가능하도록 접근제한자를 수정 -> 안씀
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
//		this.allInOne = allInOne;
//		
//		// 방법 2. 부모클래스에 있는 setter 메서드 사용 -> private여도 가능하지만 이것도 안씀
//		super.setBrand(brand);
//		setpCode(pCode);
//		setpName(pName);
//		setPrice(price);
	}
	// 객체의 정보를 문자열로 반환하는 메서드.
	// 오버라이딩 : 부모클래스와 자식클래스의 메서드명이 동일한 클래스
	public String information() {
		return super.information() + ", " + isAllInOne();
	}

	// boolean 자료형의 이름만 is가 붙는다
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
}
