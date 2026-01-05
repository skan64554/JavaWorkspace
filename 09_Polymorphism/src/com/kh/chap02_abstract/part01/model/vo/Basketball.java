package com.kh.chap02_abstract.part01.model.vo;

// 추상클래스를 상속받게 되면, 추상클래스 내부의 미구현된 추상메서드를 반드시 구현해야함
public class Basketball extends Sports{
	
	@Override
	public void rule() {
		System.out.println("손으로 공을 넣어 링에 넣어야 한다.");
	}
}
