package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		int size = s.length();
		
		if(s.contains(" ")) // 공백이 있는 경우
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		
		for(int i = 0; i < size; i++) {
			char ch = s.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                count++;
            }
		}
		return count;
	}
}
