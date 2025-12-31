package com.kh.chap01.oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 객체배열없이 코딩하기
		// 1. setter 초기화
		Book bk1 = new Book();
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("김영한");
		bk1.setPrice(30000);
		bk1.setPublisher("인프런");
		
		// 2. 매개변수 생성자로 객체 생성 및 초기화
		Book bk2 = new Book("스프링","김영한",25000,"인프런");
		
		// 3. 매개변수 생성자로 객체 생성 및 초기화
		Book bk3 = new Book("고일","기구",1000,"치지직");
		
		// 객체만 있는 상태에선 작업이 비효율적이므로, 배열에 넣어서 관리
		Book[] arr = new Book[3]; // [null,null,null]
		arr[0] = bk1;
		arr[1] = bk2;
		arr[2] = bk3;
		
		// 배열을 통해 도서 정보 출력 서비스 만들기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		//사용자에게 검색할 도서 제목을 입력받아 전체 도서목록들 중 일치하는 제목의 도서 찾기
		System.out.print("검색할 책의 제목 : ");
		String searchTitle = sc.nextLine();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				System.out.println(arr[i].information());
			}
		}
		
	}
}
