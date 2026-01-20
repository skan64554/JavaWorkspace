package com.kh.chap02_enum.run;

import com.kh.chap02_enum.model._enum.CarColor;

public class Run {
	public static void main(String[] args) {
		System.out.println(CarColor.BLACK);
		System.out.println(CarColor.BLACK.getColor());
		System.out.println(CarColor.BLACK.getName());
		System.out.println(CarColor.valueOf("BLACK")); // 이름을 입력하는 원하는 Enum 객체 출력
		
		System.out.println(CarColor.valueOf(1));
		//System.out.println(CarColor.valueOf(10)); 예외호출
		CarColor.RED.printTest();
	}
}
