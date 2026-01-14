package com.kh.chap01_thread.model.thread;

public class Thread_a implements Runnable {
	
	@Override
	public void run() {
	for(int i = 97; i <= 122; i++ ) {
		System.out.println("[소문자쓰레드 : " + (char)i + "]");
	}
	}
}
