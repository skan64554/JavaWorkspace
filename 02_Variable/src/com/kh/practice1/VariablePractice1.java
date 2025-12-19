package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	Scanner sc = new Scanner(System.in);
	public void practice2(){
		
		System.out.print("첫 번째 정수");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수");
		int b = sc.nextInt();
		
		System.out.println("더하기 : 237");
		System.out.println("빼기 : 237");
		System.out.println("곱하기 : 237");
		System.out.println("나누기 : 237");
	}
	
	public void practice3() {
		
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : " + (width*height));
		System.out.println("둘레 : " + (width+height)*2);
		
	}
	
	public void practice4() {
		
		System.out.print("문자열을 입력 : ");
		String str = sc.next(); // apple
		
		System.out.println("첫 번째 문자 :" + str.charAt(0));
		System.out.println("두 번째 문자 :" + str.charAt(1));
		System.out.println("세 번째 문자 :" + str.charAt(2));
		
		// 형변환 실습문제
			
	}
	
    public void practice5() {
		System.out.print("국 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수 : ");
		double math = sc.nextDouble();
		
		int total = (int)(kor + eng + math);
		int avg = (int)((kor + eng + math)/3);
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
	
    public void method() {
    	int iNum1 = 10;
    	int iNum2 = 4;
    	float fNum = 3.0f;
    	double dNum = 2.5;
    	char ch = 'A';
    	System.out.println((iNum1/iNum2)); // 2
    	System.out.println((int)(dNum)); // 2
    	System.out.println(iNum2*dNum); // 10.0
    	System.out.println((double)(iNum1)); // 10.0
    	System.out.println(((double)iNum1/iNum2)); // 2.5
    	System.out.println(dNum); // 2.5
    	System.out.println((int)(fNum)); // 3
    	System.out.println(iNum1/(int)fNum); // 3
    	System.out.println(iNum1/fNum);// 3.3333333
    	System.out.println(iNum1/(double)(fNum)); // 3.3333333333333335
    	System.out.println(ch); // 'A'
    	System.out.println((int)ch); // 65
    	System.out.println((int)(ch) + iNum1 ); // 75
    	System.out.println( (char)(ch + iNum1) ); // 'K'
    }
    
}
