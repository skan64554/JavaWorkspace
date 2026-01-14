package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {

	Scanner sc = new Scanner(System.in);
	
	public void method3() {
		int [] iArr = new int[5];
		
		//배열 값 초기화
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i;
		}
		
		// [0 , 1 , 2 , 3 , 4]
		System.out.println(iArr[4]);
		
	}
	
	public void method4() {
		int result = 0;
		String str = null;
		int[] arr = null;
		
		// null은 모든 참조자료형의 기본값
		// 단, 참조변수가 null을 저장한 상태에서 주소값이 있어야 수행할 수 있는 행위
		// 를 코드로 작성하면 실행시 에러가 발생한다
		
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
	}
	
	public void method5() {
		int [] arr = new int[5];
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 *  */
		int j = 2;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = j;
			j += 2;
		}
		
		for(int c = arr.length-1; c >= 0; c--) {
			System.out.print(arr[c] + " ");
		}
		
		//arr[5] = 12; 배열의 크기를 벗어난 인덱스 제시시 런타임 에러 발생
		// 배열은 한번 지정한 크기를 변경할 수 없다.
		// 배열의 범위를 넘어선 값 저장을 위해선 새로운 배열을 생성해야함
		
		arr = new int[6];
		arr[5] = 12; // arr[0]~[4]는 0으로 초기화 되어버림 -> 배열 복사
	}
	
	public void method6() {
		// 배열의 선언, 할당, 초기화를 한 번에 수행
		int [] arr1 = new int[] {1,2,3,4}; // [1,2,3,4]
		
		int [] arr2 = {1,2,3,4};
	}
	
	public void method7() {
		// 문자열을 문자배열로 만드는 방법
		String str = "merry";
		
		// 1. toCharArray() 사용
		char[] arr = str.toCharArray(); // ['m','e','r','r','y']
		
		// 2. for문으로 문자배열 생성하여 옮겨담기
		char [] arr2 = new char[str.length()];
		
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = str.charAt(i); 
		}
		//Arrays.toString(배열) -> 배열 내부의 값들을 문자열로 반환하는 메서드
		System.out.println(Arrays.toString(arr));
		System.out.println(arr2);
	}
}