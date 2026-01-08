package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		if(year%4==0 && !(year%10==0) || year%400==0)  return true;
		else return false;
	}
	
	public long leapDate(Calendar c) {
        long totalDays = 0;
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1; // 1~12
        int day = c.get(Calendar.DAY_OF_MONTH);

        // 1년부터 전년도까지
        for (int i = 1; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }

        // 현재 연도의 월별 일수
        int[] monthDays = {31, 28, 31, 30, 31, 30,
                           31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            monthDays[1] = 29;
        }

        for (int i = 0; i < month - 1; i++) {
            totalDays += monthDays[i];
        }

        totalDays += day;

        return totalDays;
    }
}
