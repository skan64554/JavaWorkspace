package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.movel.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public final static int SIZE = 10;
	

	public int existMemberNum() {
		// 현재 존재하는 멤버 수 반환
		int count = 0;
		for (Member mem : m) {
			//객체가 초기화 된 경우
			if(mem != null) count++;
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		boolean isDup = false;
		for (Member mem : m) {
			// 객체배열에 저장된 Member객체의 id값과 사용자가 입력한 id값 비교
			// null 비교도 필수로 추가
			if(mem != null && inputId.equals(mem.getId())){
				isDup = true;
				break;
			}
		}
		return isDup;
	}
	
//	public void insertMember(String id, String name, String password) {
//		Member mem = new Member(id,name,password);
//	}
//	
   public void insertMember(String id, String name, String password,
		String email, char gender , int age ) {
		Member mem = new Member(id,name,password,email,gender,age);
		
		//생성한 객체를 객체배열상 비어있는 부분(null)에 저장
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = mem;
				break;
			}
		}
	}
	
	public String searchId(String id) {
		// Member객체 배열에서 id와 일치하는 회원의 정보를 찾은 후, 회원의 정보를 반환
		for (Member mem : m) {
			if(mem != null && mem.getId().equals(id)){
				return mem.toString(); // 회원정보 반환
			}
		}
		return null;
	}
	
	public Member[] searchName(String name) {
		Member[] m = new Member[SIZE];
		
		int i = 0;
		for( Member mem : this.m) {
			if(mem != null && mem.getName().equals(name)){
				m[i++] = mem;
			}
		}
		// 찾고자 하는 회원이 한 명도 없음
		if(i == 0) {
			return null;
		}else {
			// 내가 찾은 회원이 1명인 경우
			Member[] copy = Arrays.copyOf(m, i);
			return copy;
		}
	}
	
//	public Member[] searchEmail(String email) {
//		return
//	}
//	
	public boolean updatePassword(String id, String password) {
		for(int i = 0; i < m.length; i++) {
			Member mem = m[i];
			if(mem != null && mem.getId().equals(id)) {
				mem.setPassword(password);
				return true;
			}
		}
		return false;
	}
	
//	public boolean updateName(String id, String name) {
//		return
//	}
//	
//	public boolean updateEmail(String id, String email) {
//		return
//	}
//	
	public boolean delete(String id) {
		// 배열에 값을 대입할때는 베이직 for문을 써야함
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null & m[i].getId().equals(id)) {
				m[i] = null; //삭제처리
				return true; //삭제완료처리
			}
		}
		return false;
	
	}
	
	public void delete() {
		// 전체 회원 삭제
		m = new Member[SIZE];
	}
	
	public Member[] printAll() {
		return m;
	}
	
	
	                      
}
