package com.kh.practice.thread;

public class Customer implements Runnable {

	private Data data;
	
	public Customer(Data data){
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			try {
				data.getValue();
			} catch (EmptyException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
