package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	private HashMap<String , Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}
		return false;
	}
	
	public String login(String id, String password) {
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와
		// 사용자가 입력한 비밀번호가 같은지 비교.
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
		if(map.containsKey(id)) {
			Member m = map.get(id);
			if(m.getPassword().equals(password))
				return m.getName();
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			
			if(oldPw.equals(newPw)) {
				map.get(id).setPassword(newPw);
				return true;
			}
			
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		
            map.get(id).setName(newName); 
	}
	
	public TreeMap sameName(String name) {
		
	}
	
}
