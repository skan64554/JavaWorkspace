package com.kh.chap05.model.vo;

public class Lotto {
	private int[] lotto;
	{
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
	}
	
	public void information() {
		System.out.print("번호는 ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("입니다.");
	}
	
	public Lotto() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			System.out.print(lotto[i] + " ");
		}
	}
	
	
}
