package com.kh.practice.list.music.view;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.print("1. 마지막 위치에 곡 추가 \r\n"
					+ "2. 첫 위치에 곡 추가 \r\n"
					+ "3. 전체 곡 목록 출력 \r\n"
					+ "4. 특정 곡 검색 \r\n"
					+ "5. 특정 곡 삭제 \r\n"
					+ "6. 특정 곡 정보 수정 \r\n"
					+ "7. 곡명 오름차순 정렬 \r\n"
					+ "8. 가수명 내림차순 정렬 \r\n"
					+ "9. 종료 \r\n"
					+ "메뉴 번호 선택 :");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 7: ascTitle(); break;
			case 8: descSinger(); break;
			case 9: System.out.println("종료"); return;
			default : System.out.println("재실행");
			}
		}
	}
	
	public void addList() {
		System.out.println("=== 마지막 위치에 곡 추가 ===");
		System.out.print("곡 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 : ");
		String singer = sc.nextLine();
		
		int result = mc.addList(new Music(title,singer));
		if(result == 1) System.out.println("추가성공");
		else System.out.println("추가실패");
		
	}
	
	public void addAtZero() {
		System.out.println("=== 마지막 위치에 곡 추가 ===");
		System.out.print("곡 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 : ");
		String singer = sc.nextLine();
		
		int result = mc.addAtZero(new Music(title,singer));
		if(result == 1) System.out.println("추가성공");
		else System.out.println("추가실패");
	}
	
	public void printAll() {
		System.out.println("=== 전체 곡 목록 ===");
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.print("검색할 곡명 : "); 
		String title = sc.nextLine();
        Music m = mc.searchMusic(title);
        
        if (m == null) System.out.println("검색한 곡이 없습니다."); 
        else System.out.println("검색한 곡은 " + m + " 입니다."); 
	}
	
	public void removeMusic() {
		System.out.println("=== 특정 곡 삭제 ===");
		System.out.print("삭제 할 곡 : ");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		
		if (m == null) System.out.println("삭제할 곡이 없습니다."); 
        else System.out.println(m.getTitle() + "을 삭제했습니다."); 
	}
	
	public void setMusic() {
		System.out.println("=== 특정 곡 정보 수정 ===");
		System.out.print("수정 할 곡 : ");
		String title = sc.nextLine();
		
		System.out.print("새 곡명 : "); 
		String newTitle = sc.nextLine();
		
        System.out.print("새 가수 명 : "); 
        String newSinger = sc.nextLine();
		
		Music m = mc.setMusic(title , new Music(newTitle, newSinger));
		if(m == null) System.out.println("수정할 곡이 없습니다.");
		else System.out.println(m.getTitle() + ", " + m.getSinger() + "의 값이 변경 되었습니다.");
	}
	
	public void ascTitle() {
		if (mc.ascTitle() == 1) System.out.println("정렬 성공");
		else System.out.println("정렬 실패");
	}
	
	public void descSinger() {
		if (mc.descSinger() == 1) System.out.println("정렬 성공"); 
		else System.out.println("정렬 실패");
	}
	
}
