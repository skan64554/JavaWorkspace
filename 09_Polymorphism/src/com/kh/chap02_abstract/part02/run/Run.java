package com.kh.chap02_abstract.part02.run;

import com.kh.chap02_abstract.part02.model.vo.*;

public class Run {
	public static void main(String[] args) {
		//추상클래스 
		// - 객체 생성은 불가, 참조 변수로 사용 가능
		Person p1 = new Mother("어머니", 60,70,"출산");
		Person p2 = new Baby("애긩",3.5,70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		// 동적바인딩
		p1.eat();
		p2.eat();
		p1.sleep();
		p2.sleep();
		
		System.out.println("==== 다음날 ====");
		System.out.println(p1);
		System.out.println(p2);
		
		// 인터페이스
		// 인터페이스역시 추상메서드를 포함해 객체생성 불가능
		Basic b1 = new Mother("엄마",50,50,"출산");
		Basic b2 = new Baby("애긩",3.5,70);
		
		b1.eat(); // 동적바인딩
		b2.eat();
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
