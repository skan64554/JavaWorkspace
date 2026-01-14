package com.kh.practice.leap.view;

import java.util.Calendar;


import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView(){
		LeapController lc = new LeapController();
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		
		if(lc.isLeapYear(year)) {
			System.out.println(year + "년은 윤년입니다.");
		}else{
			System.out.println(year + "년은 평년입니다.");
		}
		
		System.out.println("총 날짜 수 : " + lc.leapDate(today));
	}
}
