package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.println();
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
		case 7:
			System.out.println("종료 메뉴입니다");
			break;
		default:
			System.out.println("잘못 입력했습니다");
			break;
		}
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num % 2 == 1 && num > 0 ) System.out.println("홀수다");
		else if (num % 2 == 0 && num > 0 )System.out.println("짝수다");
		else System.out.println("양수만 입력해주세요.");
	
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double avg = total/3.0;
		
		if(eng >= 40 && math >= 40 && eng >= 40 && avg >= 60)
			System.out.println("축하합니다, 합격입니다!");
		else System.out.println("불합격입니다.");
	}
	
	public void practice4() {
		System.out.println("1~12 사이의 정수 입력 : ");
		int A = sc.nextInt();
		
		switch(A) {
		case (1):
		case (2):
		case (3):
			System.out.println(A + "월은 봄입니다");
			break;
		case (4):
		case (5):
		case (6):
			System.out.println(A + "월은 여름입니다");
			break;
		case (7):
		case (8):
		case (9):
			System.out.println(A + "월은 가을입니다");
			break;
		case (10):
		case (11):
		case (12):
			System.out.println(A + "월은 겨울입니다");
			break;
		default:
			System.out.println("잘못 입력했습니다");
			break;
		}
	}
	
	public void practice5() {
		System.out.print("아이디 : ");
		String ID = sc.next();
		
		System.out.print("비밀번호 : ");
		String PW = sc.next();
		
		if (ID.equals("KMS") && PW.equals("3434"))
			System.out.println("로그인 성공");
		else if(!(ID.equals("KMS")))
			System.out.println("아이디가 틀렸습니다.");
		else if(!(PW.equals("3434")))
			System.out.println("비밀번호가 틀렸습니다.");
		else 
			System.out.println("잘못 입력했습니다.");
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.next();
		
		switch(grade) {
		case("관리자"):
			System.out.println("회원관리, 게시글 관리 게시글 작성"
					+ "댓글 작성 게시글 조회");
			break;
		case("회원"):
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case("비회원"):
			System.out.println("게시글 조회");
			break;
		}
	}
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
				
		double BMI = weight / ( height * height );
		System.out.print("BMI 지수 : " + BMI);
		System.out.println();
		
		if( BMI < 18.5 )
			System.out.println("저체중");
		else if ( 18.5 <= BMI && BMI < 23 )
			System.out.println("정상체중");
		else if ( 23 <= BMI && BMI < 25 )
			System.out.println("과체중");
		else if ( 25 <= BMI && BMI < 30 )
			System.out.println("비만");
		else
			System.out.println("고도비만");
	}
	
	public void practice8() {
		
		System.out.print("피연산자1 입력 : ");
		int a = sc.nextInt();
		
		
		System.out.print("피연산자2 입력 : ");
		int b = sc.nextInt();
		
		System.out.print("연산자를 입력 : ");
		String c = sc.next();
		
		if( a>0 && b>0) {
			switch(c) {
			case "+":
				System.out.println(a + " " + c + " " + "= " + a+b);
				break;
			case "-":
				System.out.println(a + " " + c + " " + "= " + (a-b));
				break;
			case "*":
				System.out.println(a + " " + c + " " + "= " + a*b);
				break;
			case "/":
				System.out.println(a + " " + c + " " + "= " + (double)a/(double)b);
				break;
			case "%":
				System.out.println(a + " " + c + " " + "= " + a%b);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
				break;	
			}		
		}
		else System.out.println("양수를 입력하시오");
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int g1 = sc.nextInt()/5;
		
		System.out.print("기말 고사 점수 : ");
		int g2 = sc.nextInt()/10*3;
		
		System.out.print("과제 점수 : ");
		int g3 = sc.nextInt()/10*3;
		
		System.out.print("출석 회수 : ");
		int g4 = sc.nextInt();
		
		int total = g1+g2+g3+g4;
		
		String result;
		if(total < 70 || g4 < 14)
			result = "Fail";
		else
			result = "PASS";
		
		System.out.println("===========결과===========");
		System.out.println("중간 고사 점수(20) : " + (float)g1);
		System.out.println("기말 고사 점수(30) : "+ (float)g2);
		System.out.println("과제 점수(30) : " + (float)g3);
		System.out.println("출석 점수(20) : " + (float)g4);
		System.out.println("총점 : " + (float)total);
		System.out.println(result);
		
	}
	
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("선택 : ");
		int a = sc.nextInt();
		ControlPractice a1 = new ControlPractice();
		switch(a) {
		case 1:
			a1.practice1();
			break;
		case 2:
			a1.practice2();
			break;
		case 3:
			a1.practice3();
			break;
		case 4:
			a1.practice4();
			break;
		case 5:
			a1.practice5();
			break;
		case 6:
			a1.practice6();
			break;
		case 7:
			a1.practice7();
			break;
		case 8:
			a1.practice8();
			break;
		case 9:
			a1.practice9();
			break;
		default:
			System.out.println("잘못 입력함");
			break;
		}
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		int a = sc.nextInt();
		int a1 = a / 1000;
		int a2 = a / 100 % 10;
		int a3 = a / 10;
		int a4 = a % 10;
		
		if ( !(1000 <= a && a <= 9999) )
			System.out.println("자리수 안맞음");
		else if( a1 == a2 || a2 == a3 || a3 == a4 || a2 == a4 || a1 == a4 
				|| a1 == a3 ) System.out.println("실패");
		else System.out.println("성공");
	}
}
