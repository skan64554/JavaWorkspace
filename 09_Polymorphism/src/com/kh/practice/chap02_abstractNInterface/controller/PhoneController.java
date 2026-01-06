package com.kh.practice.chap02_abstractNInterface.controller;
import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		
		
		GalaxyNote9 qn9 = new GalaxyNote9();
		V40 v4 = new V40();
	
		Phone[] pArr = {qn9,v4};
		
		for(int i = 0; i<pArr.length; i++) {
			if (pArr[i] instanceof GalaxyNote9) {
				result[i] = "갤럭시 노트9는 " + pArr[i].toString();
				System.out.println("갤럭시 노트9는 " + pArr[i].toString());
			}else if (pArr[i] instanceof V40) {
				result[i] = "V40은 " + pArr[i].toString();
				System.out.println("V40은 " + pArr[i].toString());
			}
			System.out.println();
		}
	
		
		return result;
	}
}
