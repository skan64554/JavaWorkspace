package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	Employee e = new Employee();
	
	public void add(int empNo,String name,char gender,String phone) {
		// 받아온 매개변수만큼 매개변수 있는 생성자를 통해 값 저장
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	
	}
	
	public void add(int empNo,String name,char gender, String phone, String dept
			,int salary, double bonus) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		// 객체 e에 null을 저장하여 객체 삭제
		Employee temp = e;
		e = null;
		return temp ;
	}
	
	public String inform() {
		return  e.getEmpNo() + " " + e.getName() + " " +
				e.getGender() + " " + e.getPhone() + " " +
				e.getDept() + " " + e.getSalary() + " " + e.getBonus();
	}
}
