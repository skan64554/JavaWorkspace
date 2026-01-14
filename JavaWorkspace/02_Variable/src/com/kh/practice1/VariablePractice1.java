package com.kh.practice1;

import java.util.Scanner;// �Է�

public class VariablePractice1 {
	Scanner sc = new Scanner(System.in);
	public void practice2(){
		
		System.out.print("ù ��° ����");
		int a = sc.nextInt();
		
		System.out.print("�� ��° ����");
		int b = sc.nextInt();
		
		System.out.println("���ϱ� : 237");
		System.out.println("���� : 237");
		System.out.println("���ϱ� : 237");
		System.out.println("������ : 237");
	}
	
	public void practice3() {
		
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		
		System.out.print("���� : ");
		double height = sc.nextDouble();
		
		System.out.println("���� : " + (width*height));
		System.out.println("�ѷ� : " + (width+height)*2);
		
	}
	
	public void practice4() {
		
		System.out.print("���ڿ��� �Է� : ");
		String str = sc.next(); // apple
		
		System.out.println("ù ��° ���� :" + str.charAt(0));
		System.out.println("�� ��° ���� :" + str.charAt(1));
		System.out.println("�� ��° ���� :" + str.charAt(2));
		
		// ����ȯ �ǽ�����
			
	}
	
    public void practice5() {
		System.out.print("�� : ");
		double kor = sc.nextDouble();
		
		System.out.print("�� : ");
		double eng = sc.nextDouble();
		
		System.out.print("�� : ");
		double math = sc.nextDouble();
		
		int total = (int)(kor + eng + math);
		int avg = (int)((kor + eng + math)/3);
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
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
