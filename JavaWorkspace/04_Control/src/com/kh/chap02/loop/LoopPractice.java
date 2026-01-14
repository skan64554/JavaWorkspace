package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 한개의 값을 입력받아 1부터 값까지 숫자들을 모두 출력
		// 입력한 수는 1이상, 1미만은 "1 이상의 숫자를 입력해주세요" 출력하면서 다시 입력
		int input;

		while (true) {
			System.out.print("수 입력 : ");
			input = sc.nextInt();

			if (input < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				continue;
			} else {
				for (int i = 1; i <= input; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}
	}

	public void practice2() {
		// 1번의 출력의 거꾸로
		int input;
		while (true) {
			System.out.print("수 입력 : ");
			input = sc.nextInt();

			if (input < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
				continue;
			} else {
				for (int j = input; 1 <= j; j--) {
					System.out.print(j + " ");
				}
				break;
			}
		}
	}

	public void practice3() {
		// 1부터입력 받은 수까지의 정수의 합 출력
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int i = 1;
		int sum = 0;

		while (i <= input) {
			sum += i;
			if (i == input) {
				System.out.print(input + " ");
				break;
			}
			System.out.print(i++ + " + ");
		}
		System.out.print("= " + sum);
	}

	public void practice4() {
		// 두개의 값을 입력 받아 그 사이의 숫자 출력
		// 1미만 입력할시 다시

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
				System.out.println();
				practice4();
				return;
			}
			
			int min = num1 > num2 ? num2 : num1;
			int max = num1 > num2 ? num1 : num2;
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
			break;
		}
	}

	public void practice5() {
		// 입력 받은 숫자의 9단까지 출력
		// 9를 초과하는 숫자 입력시 "9 이하의 숫자를 입력해주세요" 출력
		while (true) {

			System.out.print("숫자 :");
			int dan = sc.nextInt();

			if (!(dan <= 9 && dan > 0)) {
				System.out.println("9 이하의 숫자를 입력해주세요");
				continue;
			} else {
				for (int i = dan; dan <= 9; dan++) {
					for (int j = 1; j <= 9; j++) {
						System.out.print(dan + " X " + j + " = " + dan * j + " ");
					}
					System.out.println();
				}
			}
		}
	}

	public void practice6() {
		// 시작 숫자와 공차를 입력 받아 일정한 값으로 커지거나 작아지는 프로그램 구현
		// 출력되는 숫자는 총 10개

		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();

		System.out.print("공차 : ");
		int d = sc.nextInt();

		if (d > 0) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(num + " ");
				num += d;
			}
		} else if (d < 0) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(num + " ");
				num += d;
			}
		} else
			System.out.println("공차가 0입니다");
	}

	public void practice7() {
		// 정수2개와 연산자 입력
		// 연산자에 따른 결과 출력
		// 연산자 입력에 exit가 들어오면 "프로그램을 종료합니다" 출력하고 종료
		// 연산자가 나누기며 두 번째 정수가 0으로 들어오면 "0으로 나눌 수 없습니다.다시 입력해주세요" 출력
		// 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해주세요" 출력하고 처음으로 돌아감

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String str = sc.next();

			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			if (str.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}

			if (!(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%"))) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}

			switch (str) {
			case "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/":
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case "%":
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;
			}
		}
	}

	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice10() {
		// 입력받은 하나의 값이 소수인지 판별하는 프로그램
		// 입력한 수가 2보다 작은 경우 잘못 입력하셨습니다 출력

		while (true) {
			int cnt = 0;
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num < 2) {
				System.out.println("잘못 입력하셨습니다");
				System.out.println();
				continue;
			}
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println("소수입니다.");
				break;
			} else {
				System.out.println("소수가 아닙니다");
				break;
			}
		}
	}

	public void practice11() {
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		while (true) {

			int cnt = 0;
			int i, j = 0;
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num < 2) {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}

			for (i = 2; i <= num; i++) {
				for (j = 2; j <= i; j++) {
					if (i % j == 0)
						break;
				}
				if (i == j) {
					System.out.print(i + " ");
					cnt++;
				}
			}
			System.out.println();
			System.out.println("2부터 " + num + "까지의 소수의 개수는 " + cnt + "개입니다.");
			break;
		}
	}

	public void practice12() {
		int i = 0;
		int cnt = 0;
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		while (++i <= num) {

			if (i % 6 == 0) {
				System.out.print(i + " ");
				cnt++;
			}
			if (i % 2 == 0 && !(i % 6 == 0)) {
				System.out.print(i + " ");
			}
			if (i % 3 == 0 && !(i % 6 == 0))
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("count : " + cnt);
	}

}
