package com.kh.operator;

public class F_Triple {
	
	//삼항 연산자
	// 조건식 ? 조건이 true인 경우 결과값 : 조건이 false인 경우 결과값
	public void method1() {
		int num = 50;
		
		// num의 값이 양수인지 아닌지 판단.
		boolean result = (num > 0 ? true : false);
		System.out.println(result ? "양수입니다" : "음수입니다");
		
	}
	
	public void method2() {
		int num = 0;
		
		// num의 값이 양수,음수,0중 무엇인지 판단
		String result = num > 0 ? "양수" :
			(num < 0 ? "음수" : "0입니다");
	}

	public void quiz() {
        int a = 5;
        int b = 10;
        int c = (++a) + b;
        int d = c / a;
        int e = c % a;
        int f = e++;
        int g = (--b) +(d--);
        int h = 2;
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);
        System.out.println("g : "+g);
        System.out.println("h : "+h);
        System.out.println("i : "+i);
    }
}
