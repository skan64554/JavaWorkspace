package com.kh.practice.lambda;

public class LambdaPractice4 {
	public static void main(String[] args) {
		MyFunction2<String,Integer> printer =(str , x) -> {
			 
				if(x>=90) {
				System.out.println(str +"님의 점수는 A학점(" +x+")입니다");
				}else if(x>=80) {
					System.out.println(str +"님의 점수는 B학점(" +x+")입니다");
		     	}else if(x>=70) {
		     		System.out.println(str +"님의 점수는 C학점(" +x+")입니다");
		     	}else {
		     		System.out.println(str +"님의 점수는 D학점(" +x+")입니다");
		     	}
		};	
				printer.accept("홍길동",95);
				printer.accept("이순신",88);
	}
	
	@FunctionalInterface
	interface MyFunction2 <K,A>{
		void accept(K k, A a);
	}
}
