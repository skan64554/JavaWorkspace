package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController(){
		
	}
	
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str , " ");
		String a = "";
		
		while(stn.hasMoreTokens()) { // stn에 토큰이 1개이상 있는 경우 true/false
			a += stn.nextToken();
		}
		
		return a;
	}
	
	public String firstCap(String input) {
		String first = input.substring(0,1).toUpperCase();
		String rest = input.substring(1).toLowerCase();
		return first + rest;
	}
	
	public int findChar(String input, char one) {

		char [] arr = input.toCharArray();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == one) count++;
		}
		return count;
	}
}
