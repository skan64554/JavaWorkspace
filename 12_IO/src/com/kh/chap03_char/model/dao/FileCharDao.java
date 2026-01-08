package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2byte단위로 출력하는 스트림
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt", true); // 파일이 없다면 생성, true : 이어쓰기
			
			fw.write("국도레시 - 그래 나 여초딩 좋아한다 ");
			fw.write("뭐 문제있냐\r\n");
			fw.write(' '); 
			
			char[] arr = {'뭐','가',' ','어','때','서'};
			fw.write(arr);
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}
	
	public void fileRead() {
		
		FileReader fr = null;
		
		    try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while( (value = fr.read()) != -1) {
				System.out.println(value);
			}
		
		    }catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
	}
}
