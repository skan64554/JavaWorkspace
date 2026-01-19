package com.kh.practice.lambda;

public class LambdaPractice1 {
	public static void main(String[] args) {
		String[] arr = {"java", "lambda", "hi", "functional", "wow"};
		printStrings(arr,(str) -> str.length() >= 3 );
		printStrings(arr,(str) -> str.contains("a"));
		printStrings(arr,(str) -> str.charAt(0) == 'w');
		printStrings(arr,(str) -> str.length() % 2 == 0 && str.contains("a") );	
	}
	
	public static void printStrings(String[] arr, StringChecker checker) {
		for(String str : arr) {
			if(checker.check(str)) System.out.println(str);
		}
	}
	
	@FunctionalInterface
	interface StringChecker{
		boolean check(String str);
	}
}
