package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
			int[] count = pc.personCount();
			
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
	        System.out.println("현재 저장된 학생은 " + count[0] + "명입니다.");
	        System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
	        System.out.println("현재 저장된 사원은 " + count[1] + "명입니다.");
	            
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
				mainMenu();
				return;
			}
		}
	}
	
	public void studentMenu() {
		int count = pc.personCount()[0];
	while (true) {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			if(pc.personCount()[0] == 3) {
				System.out.println("학생 수가 3명(MAX)이므로 공간이 꽉찼습니다");
				continue;
			}
			insertStudent();
			break;
		case 2:
			
			printStudent();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
			studentMenu();
			return;
		}
	}
		
	}
	
	public void employeeMenu() {
		int count = pc.personCount()[1];
	while(true) {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");   
	    System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
			
	switch(menuNum) {
		case 1:
			if (count == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 "
	           		+ "사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			continue;
			}
			insertEmployee();
			break;
		case 2:
			printEmployee();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
			studentMenu();
			return;
			}
		}
		
	}
	
	public void insertStudent() {
			
	while (pc.personCount()[0] < 3) {
		System.out.print("학생 이름 :");
		String name = sc.next();
		
		System.out.print("학생 나이 :");
		int age = sc.nextInt();
		
		System.out.print("학생 키 :");
		double height = sc.nextDouble();
		
		System.out.print("학생 몸무게 :");
		double weight = sc.nextDouble();
		
		System.out.print("학생 학년 :");
		int grade = sc.nextInt();
		
		System.out.print("학생 전공 :");
		String major = sc.next();
		
		pc.insertStudent(name, age, height, weight, grade, major);
		
		System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
        if (sc.next().toUpperCase().equalsIgnoreCase("N")) return;
	}
	}
	
	public void printStudent() {
		for (Student s : pc.printStudent()) {
            if (s != null) System.out.println(s);
        }
	}
	
	public void insertEmployee() {
	if(pc.personCount()[1] == 10) {
			System.out.println("사원 수가 10명(MAX)이므로 공간이 꽉찼습니다");
			return;
		}
	while(pc.personCount()[1] < 10) {
		System.out.print("사원 이름 :");
		String name = sc.next();
		
		System.out.print("사원 나이 :");
		int age = sc.nextInt();
		
		System.out.print("사원 키 :");
		double height = sc.nextDouble();
		
		System.out.print("사원 몸무게 :");
		double weight = sc.nextDouble();
		
		System.out.print("사원 급여 :");
		int salary = sc.nextInt();
		
		System.out.print("사원 부서 :");
		String dept = sc.next();
		
		pc.insertEmployee(name, age, height, weight, salary, dept);
		
		 System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
         if (sc.next().toUpperCase().equalsIgnoreCase("N")) return;
	}
		
	}
	
	public void printEmployee() {
		for (Employee e : pc.printEmployee()) {
            if (e != null) System.out.println(e);
        }
	}
	
	
}
