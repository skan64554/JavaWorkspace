package com.kh.array;

public class A_array {
	// 배열 : 하나의 공간에 여러개의 값을 담기 (같은 자료형 기준)
	// ex) int[] a = new int[3];
	// 마지막 인덱스는 항상 n-1
	
	public void method1() {
		/*
		 * 선언
		 * 자료형 [] 배열명;
		 * 자료형 배열명 [];
		 */
		
		int a;
		int [] arr;
		int arr2 [];
		
		/*
		 * 
		 * 배열 할당
		 * - 이 배열에 몇 개의 값들을 보관할건지 그 배열의 크기를 지정해주는 과정
		 * 	 크기를 지정해주면, 지정한 갯수만큼의 저장공간을 가진 배열 생성
		 * 
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 */
		
		arr = new int[5];
		int [] arr3 = new int[5];
		
		System.out.println(arr3[0]);
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		for(int i=0; i<=2; i++)
		{
		System.out.println(arr3[i]);
		}
		System.out.println(arr3);
	}
	
	public void method2() {
		int num = 10;
		
		int [] iArr = new int[5]; // [0,0,0,0,0]
		
		System.out.println("iArr :" + iArr); // 저장한 값이 아닌 주소값이 나옴
		System.out.println("iArr의 HashCode : " + iArr.hashCode()); // 주소값을 10진수 형태로 변경
		
		int [] iArr2 = new int[5]; // [0,0,0,0,0]
		
		System.out.println("iArr2 :" + iArr2); // 저장한 값이 아닌 주소값이 나옴
		System.out.println("iArr2의 HashCode : " + iArr2.hashCode()); // 주소값을 10진수 형태로 변경
		
        int [] iArr3 = iArr2;
		
		System.out.println("iArr3 :" + iArr3); // 저장한 값이 아닌 주소값이 나옴
		System.out.println("iArr3의 HashCode : " + iArr3.hashCode()); // 주소값을 10진수 형태로 변경
		
		
     }
	
}
