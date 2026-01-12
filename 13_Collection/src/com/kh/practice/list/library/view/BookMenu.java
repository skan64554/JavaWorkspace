package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("***** 메인 메뉴 *****");
			
			System.out.print("1. 새 도서 추가 \r\n"
					+ "2. 도서 전체 조회 \r\n"
					+ "3. 도서 검색 조회 \r\n"
					+ "4. 도서 삭제 \r\n"
					+ "5. 도서 명 오름차순 정렬 \r\n"
					+ "9. 종료 \r\n"
					+ "메뉴 번호 선택 :");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 5: ascBook(); break;
			case 9: return;
			default : System.out.println("재실행");
		}
		}
	}
	
	public void insertBook() {
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르 명(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
		int catNum = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		String category = ""; 
        switch(catNum) {
            case 1: category = "인문"; break;
            case 2: category = "자연과학"; break;
            case 3: category = "의료"; break;
            case 4: category = "기타"; break;
        }
		Book b = new Book(title,author,category,price);
		bc.insertBook(b);
	}
	
	public void selectList() {
		BookController bc = new BookController();
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) System.out.println("존재하는 도서가 업습니다.");
		else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 도서명 : ");
		String title = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(title);
		
		if(searchList.isEmpty()) System.out.println("검색 결과가 없습니다.");
		else for(Book b : searchList) System.out.println(b);
		
	}
	
	public void deleteBook() {
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) System.out.println("성공적으로 삭제되었습니다.");
		else System.out.println("삭제할 도서를 찾지 못했습니다.");
	}
	
	public void ascBook() {
		if(bc.ascBook() == 1) System.out.println("정렬에 성공하였습니다.");
		else System.out.println("정렬에 실패했습니다.");
	}

}
