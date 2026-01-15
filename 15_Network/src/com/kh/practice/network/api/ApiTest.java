package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	
	public static void main(String[] args) {
		//0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
		 // serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
		 //1) URL 객체 생성
		 // 2)URLConnection 객체 생성
		 // 3)입력 스트림 생성
		 // 4)전달받은 데이터를 화면에 출
		
		try {
			String serviceKey = "1ae0d811604c018bf1b3237f53bc592f5ad9f7af60f8043a85b0cf8a36d6dcc7";
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
			
			serviceUrl += "?serviceKey=" + serviceKey;
			serviceUrl += "&sidoName=" + URLEncoder.encode("부산","UTF-8");
			
			System.out.println(serviceUrl);
			
			URL url = new URL(serviceUrl);
			URLConnection conn = url.openConnection();
			
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("환경오염.xml"));	
					){
				String line = null;
				while( (line = br.readLine()) != null ) {
					bw.write(line);
					bw.newLine();
				}
			} 
		}  catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
