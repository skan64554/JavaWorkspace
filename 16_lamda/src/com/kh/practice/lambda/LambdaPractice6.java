package com.kh.practice.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaPractice6 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jin","Suga","RM","J-Hope","V");
		
		Comparator<String> comp = getComparator("length");
		names.sort(comp);
		System.out.println(names);
		
		comp = getComparator("reverse");
		names.sort(comp);
		System.out.println(names);
	}
	
	public static Comparator<String> getComparator(String mode){
		if ("length".equals(mode)) {
	        return (s1, s2) -> Integer.compare(s1.length(), s2.length());
	    } else if ("reverse".equals(mode)) {
	        return (s1, s2) -> s2.compareTo(s1);
	    }
	    return (s1, s2) -> 0;
	}
}
