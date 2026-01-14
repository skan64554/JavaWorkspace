package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone,TouchDisplay{
    private String maker; 
    
    SmartPhone(){}
    
    

	
	public abstract String toString();
		


	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
    
  
}
