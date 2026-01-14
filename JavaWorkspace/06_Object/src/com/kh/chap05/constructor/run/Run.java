package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		// 기본생성자로 객체 생성
		User a1 = new User();
		
		User a2 = new User("user01");
		
		User a3 = new User("user02",25,'M');
		System.out.println(a3.getUserId());
		System.out.println(a3.getAge());
		System.out.println(a3.getGender());
		
	}
}
