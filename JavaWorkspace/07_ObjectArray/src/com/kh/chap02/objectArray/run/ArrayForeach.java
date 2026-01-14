package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ArrayForeach {
	
	public static void main(String[] args) {
		
		int [] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// basic loop
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// advanced loop / foreach
		// for each문
		// 배열 또는 컬렉션과 함께 사용되는 반복문
		// 배열 또는 컬렉션의 0번 인덱스부터, 마지막 인데스까지 순차적 접근으로 사용
		// 단순히 시작부터 끝까지, 초기식 조건식 증감식 x
		// 반복횟수는 배열의 크기
		int[] arr2 = {11,22,33};
		for (int i : arr2) {
			System.out.println(i);
		}
		
		Phone[] phones = new Phone[3];// [null,null,null]
		
		phones[0] = new Phone("갤럭시","삼성","울트라25",1500000);
		phones[1] = new Phone("아이폰","애플","플러스23",750000);
		phones[2] = new Phone("V40Thinq","LG","V40",500000);
		
		// phone객체 배열에 저장된 핸드폰 가격들의 총합
		int total = 0;
		for(Phone a : phones) {
			total += a.getPrice();
		}
		System.out.println("총 가격의 합 :" + total);
	}
}
