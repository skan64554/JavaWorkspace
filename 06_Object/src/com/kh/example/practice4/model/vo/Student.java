package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	static {
		grade = 1;
	}
	{
		classroom = 1;
		name = "이름";
		height = 150.0;
		gender = 'M';
	}
	public Student() {
		

	}

	public void information() {
		System.out.print(grade + ", " + classroom + ", " 
	+ name + ", " + height + ", " + gender);
	}
}
