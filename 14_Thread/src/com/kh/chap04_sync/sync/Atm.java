package com.kh.chap04_sync.sync;

import java.util.Random;

public class Atm implements Runnable {

	private Account acc;
	
	public Atm(Account acc) {
		this.acc = acc;
	}
	
	/*
	 * 출금메서드
	 * 
	 * 동기화 처리 방법
	 * 1. synchronized 메서드 만들기
	 *  - 메서드 전체에 대해 락을 걸고, 메서드 종료시 락이 풀린다.
	 * 2. synchronized blcok 사용하기 (권장)
	 *  - 동기화가 필요한 일부 내용에만 락을 건다.
	 *  - 동기화 블럭이 끝나는 순간 락이 풀린다.
	 *  - 임계영역이 아닌 지역까지는 모든스레드가 접근 가능하기 때문에, 
	 *    메서드 전체로 임게영역으로 지정하는것보다 효율이 좋다.
 	 */
	
	@Override
	public void run() {
		// 잔액이 0원보다 크면 무한반복
		while(acc.getBalance() > 0) {
			int money = (new Random().nextInt(3) + 1) * 300; // 300, 600, 900
			acc.withdraw(money);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "종료");
	}
	
}
