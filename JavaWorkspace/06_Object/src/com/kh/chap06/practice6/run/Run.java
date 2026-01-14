package com.kh.chap06.practice6.run;
import com.kh.chap06.practice6.model.vo.Book;

public class Run {
public static void main(String[] args) {
	Book a1 = new Book("책","출판사","작가",5000,5.34);
	Book a2 = new Book("책","출판사","작가");
	Book a3 = new Book();
	a1.inform();
	a2.inform();
	a3.inform();
}
}
