package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("***** My Note *****\r\n"
					+ "1. 노트 새로 만들기 \r\n"
					+ "2. 노트 열기 \r\n"
					+ "3. 노트 열어서 수정하기\r\n"
					+ "9. 끝내기 ");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:	fileSave();	break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
		}
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		sc.nextLine();
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.\r\n"
					+ "ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String input = sc.nextLine();
			
			if(input.equals("ex끝it")) break;
			sb.append(input);
		}
		
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.nextLine();
			
			if(fc.checkName(fileName)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시곘습니까?(y/n): ");
				char ch = sc.next().charAt(0);
				
				if(ch == 'y' || ch == 'Y') {
					fc.fileSave(fileName, sb); // 덮어쓰기
					break;
				}
				
			}else {
				sc.nextLine();
				continue;
			}
		}
	}
	
	public void fileOpen() {
		sc.nextLine();
		System.out.print("열 파일명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			System.out.println(fc.fileOpen(fileName));
		}else {
			System.out.println("없는 파일입니다.");
		}
	}
	
    public void fileEdit() {
		sc.nextLine();
		System.out.print("수정할 파일명 : ");
	    String fileName = sc.nextLine();
	    
	    if(!fc.checkName(fileName)) {
	    	System.out.println("없는 파일입니다.");
	    	return;
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    while(true) {
	    	System.out.println("파일에 저장할 내용을 입력하세요.\r\n"
					+ "ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String input = sc.nextLine();
			
			if (input.equals("ex끝it")) break; // [cite: 65]
            sb.append(input).append("\r\n");
	    }
	    fc.fileEdit(fileName, sb);
	}
    
    
}
