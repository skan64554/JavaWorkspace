package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.print("1. 성적 저장 ➔ saveScore()\r\n"
					+ "2. 성적 출력 ➔ readScore()\r\n"
					+ "9. 끝내기 ➔ “프로그램을 종료합니다.” 출력 후 종료\r\n"
					+ "메뉴 번호 : ");
			
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1: saveScore(); break;
			case 2:	readScore(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
    }
		
	
	public void saveScore() {
		int num = 0; // 학생 숫자 변수
		
		 while(true){
			 System.out.println(++num + "번째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math;
			double avg = sum/3.0;
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요. : ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'n' || ch == 'N') break;	
			else continue;
			
		}
	}

	public void readScore() {
		int count = 0; // 학생이 몇명인지
		int sumAll = 0; // 전체 합계 
		double avgAll = 0.0; // 전체 평균
		
		// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
		// 안에 들어가있는 데이터를 가지고 와서 출력
		// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
		// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력
		try (DataInputStream dis = scr.readScore()) { // 
            System.out.println("이름\t국어\t영어\t수학\t총점\t평균"); // 
            
            while (true) { // EOFException이 발생할 때까지 무한 반복 
                String name = dis.readUTF();
                int kor = dis.readInt();
                int eng = dis.readInt();
                int math = dis.readInt();
                int sum = dis.readInt();
                double avg = dis.readDouble();

                System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", name, kor, eng, math, sum, avg);
                
                count++; 
                sumAll += sum; 
                avgAll += avg;
            }
        }catch (FileNotFoundException e) {
            System.out.println("저장된 성적 파일이 없습니다."); 
        }catch (EOFException e) { 
            System.out.println("\n읽은 횟수\t전체 합계\t전체 평균");
            System.out.println(count + "\t" + sumAll + "\t" + avgAll/count); 
        } catch (IOException e) {
            e.printStackTrace();
        }
		
    }
}

