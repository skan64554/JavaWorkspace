package com.kh.practice.thread;


public class Data {

	private int value;
	private boolean isEmpty = true;
	
	public Data(){}
	
	public void setValue(int value) {
		synchronized(this){
			while(!isEmpty) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		this.value = value;
		this.isEmpty = false;
		System.out.println("값이 입력되었습니다.");
        System.out.println("put value : " + value);
        
        notify();
		}
	}

	public int getValue() throws EmptyException {
		synchronized(this) {
			if(isEmpty) {
				
				try {

					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오…");
			}
		
		int returnValue = value;
		this.isEmpty = true;
		System.out.println("get value : " + returnValue);
        System.out.println("값을 꺼냈습니다. value가 비었습니다.");
        
        notify();
		
		return returnValue;
		}
	}

	
	
	
	
	
	
	
}
