package com.kh.practice.func;

import java.util.Iterator;
import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("인원 수 : ");
		int people = sc.nextInt();

		System.out.print("사탕 수 : ");
		int candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + people / candy);
		System.out.println("남는 사탕 개수 : " + candy % people);
	}

	public void practice2() {
		char c;
		String str;
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int 반 = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		System.out.print("성별(M/F) : ");
		String sx = sc.next();
		c = sx.charAt(0);

		str = (c == 'M' ? "남학생" : "여학생");

		System.out.print("성적 : ");
		double score = sc.nextDouble();

		System.out.print(grade + "학년 " + 반 + "반 " + number + "번 " + name + " " + str + "의 성적은 " + score + "이다.");

	}

	public void practice3() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String str;

		String result = age <= 13 ? "어린이" : ((13 < age && age <= 19) ? "청소년" : "성인");

		System.out.println(result);
	}

	public void practice4() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		float avg = total / (float) (3.0);

		System.out.println(" ");
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);

		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상-> 합격
		String str = (((kor >= 40) && (eng >= 40) && math >= 40)) && avg >= 60 ? "합격" : "불합격";
		System.out.print(str);
	}

	public void practice5() {
		String s;
		System.out.print("주민번호를 입력하시오 : ");
		String number = sc.next();

		boolean result = (number.charAt(7) % 2 == 0 ? true : false);
		s = (number.charAt(7) % 2 == 0 ? "여자" : "남자");
		System.out.println(s);

	}

	public void practice6() {
		int num1, num2, A;
		System.out.print("정수1 : ");
		num1 = sc.nextInt();

		System.out.print("정수2 : ");
		num2 = sc.nextInt();

		System.out.print("입력 : ");
		A = sc.nextInt();

		boolean result = (num2 < A || A <= num1);
		sc.nextLine();
		System.out.println(result);
	}

	public void practice7() {
		int num1, num2, num3;
		System.out.print("입력1 : ");
		num1 = sc.nextInt();

		System.out.print("입력2 : ");
		num2 = sc.nextInt();

		System.out.print("입력3 : ");
		num3 = sc.nextInt();

		boolean result = (num1 == num2 && num2 == num3);
		System.out.println(result);
	}

	public void practice8() {
		int num1, num2, num3;
		double incen1 = 1.4;
		double incen2 = 1.0;
		double incen3 = 1.15;
		System.out.print("A사원의 연봉 : ");
		num1 = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		num2 = sc.nextInt();

		System.out.print("C사원의 연봉 : ");
		num3 = sc.nextInt();

		double Anum = num1 * incen1;
		double Bnum = num1 * incen2;
		double Cnum = num3 * incen3;

		System.out.println("");
		System.out.println("A사원의 연봉/연봉+a : " + num1 + "/" + Anum);
		String str1 = Anum >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(str1);
		System.out.println("B사원의 연봉/연봉+a : " + num2 + "/" + Bnum);
		String str2 = Bnum >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(str2);
		System.out.println("C사원의 연봉/연봉+a : " + num3 + "/" + Cnum);
		String str3 = Cnum >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(str3);
	}
}