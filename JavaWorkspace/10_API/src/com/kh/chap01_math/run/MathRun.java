package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		//Math클래스의 유용한 메서드들
		//파이 (PI)
		
		System.out.println("파이 : " + Math.PI);
		
		//올림처리 메서드
		// 올림 => Math.ceil(double) : double
		double num1 = 4.349; // 4.4로 올림처리하려면? 10을 곱하고 10 나누기 Math.ceil(num1*10)/10
		System.out.println("올림 : " + Math.ceil(num1));
		
		// 반올림
		double num2 = 5.45;
		System.out.println("반올림 : " + Math.round(num2));
		
		// 버림
		double num3 = 5.85;
		System.out.println("반올림 : " + Math.floor(num3));
		
		// 절대값 Math.abs(int/double/long/float)
		int n1 = -5;
		System.out.println("절대값 : " + Math.abs(n1));
		
		// 최소값 
		// Math.min(int,int) : int
		System.out.println("최소값 : " + Math.min(5, 3));
		
		// 최대값 
		// Math.max(int,int) : int
		System.out.println("최대값 : " + Math.max(5, 3));
		
		// 제곱근
		// Math.sqrt(double) : double
		System.out.println("4의 제곱근 : " + Math.sqrt(4.0));
		
		// 제곱
		// Math.pow(double,double) : double
		System.out.println("2의 10제곱" + Math.pow(2, 10));
	}
	
}
