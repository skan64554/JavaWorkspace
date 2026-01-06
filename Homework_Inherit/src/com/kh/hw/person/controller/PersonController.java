package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int sc = 0 , ec = 0;
		
		for(Student st : s) if(st != null) sc++;
		for(Employee em : e) if(em != null) ec++;
		return new int[] {sc,ec};
	}
	
	public void insertStudent(String name, int age, double height,
			double weight, int grade, String major) {
		
	Student st = new Student(name, age, height, weight, grade, major);
		 for(int i = 0; i < s.length; i++){
	            if (s[i] == null) {
	                s[i] = st;
	                break;
	           }
		 }
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height,
			double weight, int salary, String dept) {
		 for (int i = 0; i < e.length; i++) {
	            if (e[i] == null) {
	                e[i] = new Employee(name, age, height, 
	                		weight, salary, dept);
	                break;
	            }
	        }
	}
	
	public Employee[] printEmployee() {
		return e;
	}
	
}
