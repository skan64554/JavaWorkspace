package com.kh.chap02_abstract.part01.run;

import com.kh.chap02_abstract.part01.model.vo.Basketball;
import com.kh.chap02_abstract.part01.model.vo.Football;
import com.kh.chap02_abstract.part01.model.vo.Sports;

public class Run {
	public static void main(String[] args) {
		// 추상클래스는 객체 생성이 불가능
		// 참조변수로는 사용이 가능
		Sports s1 = new Basketball(); 
		Sports s2 = new Football(); 
		
		Sports[] arr = new Sports[2];
		arr[0] = s1;
		arr[1] = new Football();
		
		for(Sports spo : arr) {
			spo.rule();
		}
		
		/*
		 * 추상클래스 정리
		 *  - 추상클래스란 미완성된 부분이 존재하는 클래스임을 의미
		 *  - 미완성된 클래스이므로 객체 생성을 불가능하나 참조변수로는 사용 가능
		 *  - 추상메서드가 포함된 경우, 클래스느 반드시 추상클래스로 정의해야 한다.
		 *  - 추상클래스는 "일반 필드", "일반 메서드", "생성자", "추상메서드"로 이루어져 있다.
		 *  - 추상클래스는 클래스의 상속이 주된 목적이며, 메서드 강제구현은 곁다리. 
		 *  
		 *  추상메서드 정리
		 *  - 미완성된 메서드를 의미하며, 메서드의 몸통부가 구현되어있지 않은 메서드
		 *  - 추상메서드는 자식클래스에서 "오버라이딩"을 통하여 완성되며, 자식클래스에서
		 *    상속받은 추상메서드를 재정의하지않는 경우 에러가 발생한다.
		 *  - 추상메서드를 통해 클래스간의 통일성을 확보할 수 있다.
		 */
	}
}	
