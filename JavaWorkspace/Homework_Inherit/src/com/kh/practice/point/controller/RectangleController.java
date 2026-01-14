package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		return  x + "," + y + " " + height + " " +
					width + " " + "/ " + ((width*height));
	}
	
	public String calcPerimemter(int x, int y, int height, int width) {
		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
		return  x + "," + y + " " + height + " " +
				width + " " + "/ " + ((width+height)*2);
	}
}
