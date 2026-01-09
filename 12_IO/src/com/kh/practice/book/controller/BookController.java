package com.kh.practice.book.controller;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.vo.Book;
import com.khpractice.book.model.dao.BookDAO;

public class BookController {
	
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		File f = new File("book.txt");
		if (!f.exists()) {
            try {
                f.createNewFile(); 
            }catch(EOFException e) {
            	System.out.println("EOF");
            	e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
	
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
