package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.movel.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();	
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
//		최대 등록 가능한 회원 수는 10명입니다.
//		현재 등록된 회원 수는 0명입니다.
//		// MemberController(mc)클래스 안에 있는 멤버필드를 이용하여
//		// 최대 등록 가능한 회원 수가 몇 명인지 출력
//		// 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로
//		// 몇 명이 등록되어 있는지 출력
//		// 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
//		// 현재 등록된 회원 수가 10명이 아닐 때
//		1. 새 회원 등록 ➔ insertMember()
//		2. 회원 검색 ➔ searchMember()
//		3. 회원 정보 수정 ➔ updateMemner()
//		4. 회원 삭제 ➔ deleteMember()
//		5. 모두 출력 ➔ printAll()
//		9. 끝내기
//		메뉴 번호 :
//		// 현재 등록된 회원 수가 10명일 때
		while(true) {
			int memberNum = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 "+memberNum+"명입니다.");
			
			if(memberNum != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
				
			}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				if(memberNum != MemberController.SIZE)
				// 굳이 객체변수 mc가 아닌 memberController쓰는 이유 : static 필드의 관례
				{
					insertMenu();
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
		}
		
		
		
	}
	public void insertMenu(){
		
	}
	
	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
				// 사용자에게 직접 입력 받되 아이디의 경우 기존 회원의 아이디와
				// 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함
				
				System.out.print("아이디 : ");
				String id = sc.next();
				
				// ID 중복 검사
				boolean isDup = mc.checkId(id);
				if(isDup) { // 중복인 경우
					System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
					insertMenu();
					return;
				}
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("비밀번호 : ");
				String password = sc.next();
				
				System.out.print("이메일 : ");
				String email = sc.next();
				
				char gender = '\u0000';
				while(true) {
					System.out.print("성별 : ");
					gender = sc.next().toUpperCase().charAt(0);
					
					if(gender == 'M' || gender == 'F') {
						break;
					}
					System.out.println("성별을 다시 입력하세요.");
				}
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
			
				// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를
				// 출력 후 다시 성별을 입력하도록 함
				
				mc.insertMember(id,name,password,email,gender,age);
				
				// 아이디부터 나이까지 모든 데이터를 받았으면
				// mc의 insertMember메소드의 매개변수로 넘김
				
				
	}
	
	public void searchMember() {
		
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 아이디로 검색하기");
			System.out.println("3. 아이디로 검색하기");
			System.out.println("9. 아이디로 검색하기");
			System.out.print("메뉴 번호 : ");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				updateMember();
				break;
			case 9:
				return;
			default:
				mainMenu();
				return;
			
		}
		
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String searchId = sc.next();
		
		String result = mc.searchId(searchId);
		
		if(result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		
		Member[] result = mc.searchName(searchName);
		if(result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for( Member m : result) {
				System.out.println(m);
			}
		}
	}
	public void updateMember() {
		// 수정할 회원 id와 비밀번호를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 updatePassword() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
		// mainMenu()로 돌아감
		
		System.out.print("수정할 회원 id : ");
		String id = sc.next();
		
		System.out.print("수정할 회원 비밀번호 : ");
		String password = sc.next();
		
		boolean result = mc.updatePassword(id, password);
		if(result) {
			System.out.println("비밀번호 변경 성공");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void updatePassword() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteMember() {
		System.out.print("번호 선택(1,2,9) : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			return;
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 회원 아이디 : ");
		String id = sc.next();
		
		System.out.print("정말 삭제하실겁니까? (y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다");
			return;
		}
		
		boolean result = mc.delete(id);
		if(result) {
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		// 삭제할 회원 id를 사용자에게 입력 받고 정말 삭제할 것인지 사용자에게
		// 물어본 뒤, Y나 y를 사용자가 입력할 경우 입력 받은 id를
		// mc의 delete() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “성공적으로 삭제하였습니다.” 출력 후
		// mainMenu()로 돌아감
		
	}
	
	public void deleteAll() {
		// 정말 삭제할 것인지 사용자에게 물어본 뒤, Y나 y를 사용자가 입력할 경우
		// mc의 delete() 메소드 호출, “성공적으로 삭제하였습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.print("정말 삭제하실겁니까? (y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다");
			return;
		}
		
		mc.delete();
		System.out.println("성공적으로 삭제하였습니다.");
	}
	
	public void printAll() {
		// mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력하는데
		// 저장된 회원의 수가 0명이면 “저장된 회원이 없습니다.” 출력,
		// 0명이 아니면 저장된 모든 회원의 정보 출력
		Member[] m = mc.printAll();
		int memberNum = mc.existMemberNum();
		
		if(memberNum == 0) {
			System.out.println("저장된 회원이 없습니다");
			return;
		}
		
		for (Member member : m) {
			if(member != null)
				System.out.println(member);
		}
	}
	
	
	
}
