package com.kh.chap02_string.controller;

public class B_StringBufferAndBuilder {
	/*
	 * StringBuilder and StringBuffer
	 * - 문자열 기반 가변 클래스
	 * - 문자열의 메모리 부족 이슈 해결
	 * - 두 클래스의 사용방법은 동일함
	 * - 차이점은 "동기화"여부 
	 * 
	 * - StringBuilder는 동기화를 지원하기 않기 때문에 
	 * 	 "멀티쓰레드 환경"에서 좋은 성능을 보인다.
	 * - StringBuffer는 동기화를 지원하므로 
	 *   "멀티쓰레드 환경"에서 안전성은 보장하나 성능은 낮다
	 */
	
	public void method() {
		String str = "Hello";
		str += "World";
		
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("World");// 같은 저장공간에서 이어쓰기 가능
		sb1.append("!!!"); // 주소값 1개만 사용
		
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.append("World!"); 
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println("sb1 문자열의 길이 :" +sb1.length());
		System.out.println("문자열에서 o의 마지막 위치는 :" +sb1.lastIndexOf("o"));
		// 0번인덱스부터 문자를 삭제.
		// System.out.println("모든 글자 삭제 : " + sb1.delete(0, sb1.length() - 1 ));
		System.out.println("마지막 위치의 문자 삭제하기 : " + sb1.deleteCharAt(sb1.length() -1));
	}
}
