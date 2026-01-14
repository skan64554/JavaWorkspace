package com.khpractice.student.view;

import com.khpractice.student.controller.StudentController;
import com.khpractice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();

	public StudentMenu() {

		System.out.println("========== 학생 정보 출력 ==========");
		Student[] a = ssm.printStudent();
		for (Student b : a) {
//			System.out.println("이름 : " + b.getName() +
//					" / " + "과목 : " + b.getSubject() + 
//					" / " + "점수 : " + b.getScore());
			System.out.println(b.inform());
		}

		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		System.out.println("========== 학생 성적 출력 ==========");
		double[] c = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int)c[0]);
		System.out.println("학생 점수 평균 : " + c[1]);
		System.out.println();

		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		System.out.println("========== 성적 결과 출력 ==========");
		for (Student i : a) {
			if (i.getScore() < ssm.CUT_LINE) {
				System.out.println(i.getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(i.getName() + "학생은 통과입니다.");
			}
		}
	}
}
