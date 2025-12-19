package com.kh.operator;

public class E_LogicalNegation {
	/*
	 * 논리부정연산자 !
	 * 
	 * !n (n>0) = false
	 * !0 = true
	 */

	public void method() {
		System.out.println("true의 부정 "+!true);
		
		boolean b = true;
		boolean b2 = !b;
		
		boolean b3 = !(5 > 3);
	}
}
