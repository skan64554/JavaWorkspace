package com.kh.chap01_thread.model.thread;

public class Thread_b implements Runnable {

	@Override
	public void run() {
	for(int i = 65; i <= 90; i++ ) {
		System.out.println("[대문자쓰레드 : " + (char)i + "]");
	}
	}
}
