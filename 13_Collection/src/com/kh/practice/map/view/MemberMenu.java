package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;
import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		
		while(true) {
			System.out.print("******* 메인 메뉴 *******\r\n"
					+ "1. 회원가입 // joinMembership() 실행\r\n"
					+ "2. 로그인 // logIn() 실행 후 memberMenu() 실행\r\n"
					+ "3. 같은 이름 회원 찾기 // sameName()\r\n"
					+ "9. 종료 // “프로그램 종료.” 출력 후 main()으로 리턴\r\n"
					+ "메뉴 번호 선택 :");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: joinMembership(); break;
			case 2: login(); break;
			case 3: sameName(); break;
			case 9: System.out.println("프로그램 종료");return;
			default : System.out.println("재실행");
			}
		}
	}
	
	public void memberMenu() {
		while(true) {
			System.out.print("******* 회원 메뉴 *******\r\n"
					+ "1. 비밀번호 바꾸기\r\n"
					+ "2. 이름 바꾸기\r\n"
					+ "3. 로그아웃\r\n"
					+ "메뉴 번호 선택 :");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: changePassword(); break;
			case 2: changeName(); break;
			case 3: 
				System.out.println("로그아웃 되었습니다");
				mainMenu();
				return;
			default: System.out.println("잘못 입력하셨습니다");
			}	
		}
	}
	
	public void joinMembership() {
		System.out.print("ID : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		boolean result = mc.joinMembership(id, new Member(password,name));
		if(result) 	System.out.println("성공적으로 회원가입 완료하였습니다.");
		else System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
	}
	
	public void login() {
		System.out.print("ID : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		String str = mc.login(id, password);
		if(str != null) {
			System.out.println( str + "님 환영합니다"); memberMenu();
		}
		else System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요");
	}
	
	public void changePassword(){
		
		System.out.print("ID : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		System.out.print("비밀번호 : ");
		String newPassword = sc.next();
		
		boolean result = mc.changePassword(id,password,newPassword);
				
		if(result) {
			System.out.println("이름 변경에 성공하였습니다");
		}else {
			System.out.println("이름 변경에 실패했습니다");	
		}
	}
	
	public void changeName() {
		System.out.print("ID : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		String currentName = mc.login(id, password);
		        if (currentName != null) {
		            System.out.println("현재 설정된 이름 : " + currentName); 
		            System.out.print("변경할 이름 : "); String newName = sc.nextLine();
		            mc.changeName(id, newName); 
		            System.out.println("이름 변경에 성공하였습니다."); 
		        } else {
		            System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요"); 
		        }
	}
	
	public void sameName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		TreeMap<String, String> result = (TreeMap<String, String>) mc.sameName(name);
		
		Set<Entry<String , String>> entrySet = result.entrySet();
		for(Entry<String, String> entry : result.entrySet()) {
			System.out.println(entry.getValue() + "-" + entry.getKey());
		}
	}
}
