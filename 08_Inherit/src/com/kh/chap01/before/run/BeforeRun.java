package com.kh.chap01.before.run;
import com.kh.chap01.before.model.vo.*;

public class BeforeRun {
	public static void main(String[] args) {
		// 데스크탑 객체
		Desktop d = new Desktop("삼성","ISN-5100","데탑",200000,true);
		
		// 스마트폰 객체
		SmartPhone s = new SmartPhone("LG","LG-V40","스마트폰",20000,"SKT");
		
		System.out.println(d.information());
		System.out.println(s.information());
		
		/*
		 * 매 클래스마다 중복된 코드들을 일일히 기술해두게 되면 
		 * 수정과 유지보수에서 번거로움이 발생한다
		 * 
		 * 상속이라는 개념을 적용시켜서
		 * 매 클래스에 존재하는 중복된 필드 및 메서드를 하나의 클래스에 정의하고
		 * 이 클래스를 상속 시켜주는 방식으로 작업한다
		 */
	}
}
