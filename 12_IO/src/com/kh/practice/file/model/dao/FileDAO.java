package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	
	public void fileSave(String file, String s) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
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
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		FileInputStream fin = null;
        try { 
        	fin = new FileInputStream(file);
    
            int value = 0;
			while( (value = fin.read() )  != -1) {
				System.out.println(value);
			}
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
        return sb;
	}
	
	public void fileEdit(String file, String s) {
		FileWriter fw = null;
		try { fw = new FileWriter(file);
			fw.write(s);
		}catch(IOException e) {
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
}
