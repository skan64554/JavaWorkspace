package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	/*
	 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
	 * 사용자에게는 직접 가위바위보를 받으세요. 사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을
	 * 멈추고 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
	 */
	Scanner sc = new Scanner(System.in);

	public void rps() {
		int victory = 0;
		int fail = 0;
		int draw = 0;
		int match = 0;

		String[] com = { "가위", "바위", "보" };

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();

		while (true) {
			System.out.println("================");
			System.out.print("가위바위보 : ");
			String rps = sc.next();
			String com_rps = com[(int) (Math.random() * 3)];

			System.out.println("컴퓨터 : " + com_rps);
			System.out.println(name + " : " + rps);

			// 비기는 경우
			if (rps.equals(com_rps)) {
				System.out.println("비겼습니다");
				match++;
				draw++;
				continue;
			}

			// 내가 지는 경우
			if ((rps.equals("가위") && com_rps.equals("바위") || (rps.equals("바위") && com_rps.equals("보"))
					|| (rps.equals("보") && com_rps.equals("가위")))) {
				System.out.println("졌습니다 ㅠㅠ");
				match++;
				fail++;
				continue;
			}

			// 내가 이기는 경우
			if ((rps.equals("바위") && com_rps.equals("가위") || (rps.equals("보") && com_rps.equals("바위"))
					|| (rps.equals("가위") && com_rps.equals("보")))) {
				System.out.println("이겼습니다 !");
				match++;
				victory++;
				continue;
			}

			if (rps.equals("exit")) {
				System.out.println(match + "전 " + victory + "승 " + draw + "무 " + fail + "패");
				break;
			}

		}

	}
}
