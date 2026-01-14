package com.kh.chap04_sync.sync;

// 공유자원으로 사용
// n개의 ATM(스레드)가 하나의 Account(공유자원)에서 출금메서드를 호출하는 상황을 만들 예정
public class Account {
	private int balance = 10000;
	
	public int getBalance() {
		return balance;
	}
	
	// 출금메서드
	public /* synchronized */ void withdraw(int money) {
		
		String name = Thread.currentThread().getName();
		
		synchronized(this) {
			System.out.println(" 현재 잔액 : " + balance);
			
			if(money <= balance) {
				balance -= money;
				System.out.printf("[%s] %d원 출금 >>> 잔액 : %d원\n",name,money,balance);
				System.out.println();
			}else {
				System.out.printf("[%s] %d원 출금시도하였으나 잔액이 부족합니다",name,money);
				System.out.println();
			}
		}
	}
	
}
