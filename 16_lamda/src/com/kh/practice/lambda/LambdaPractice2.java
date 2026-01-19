package com.kh.practice.lambda;

public class LambdaPractice2 {
	public static void main(String[] args) {
		Calculator<Integer> adder = (x,y) -> x + y;
		
		Calculator<Integer> findMax = (x,y) -> Math.max(x, y);
		
		Calculator<String> combiner = (x,y) -> x + "-" + y; // Math::max
	}
	
	@FunctionalInterface
	interface Calculator <V>{
		V operate(V v1, V v2);
	}
}
