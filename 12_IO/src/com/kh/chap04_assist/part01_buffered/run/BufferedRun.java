package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {
	
	public static void main(String[] args) {
		
		/*
		 * 보조 스트림 : 기반스트림의 기능을 추가
		 * - 단독 사용 불가
		 * 
		 * [표현법]
		 * 보조스트림 변수명 = new 보조스트림(기반스트림객체);
		 * 보조스트림1 변수명 = new 보조스트림1(new 보조스트림2(기반스트림객체));
		 * 
		 * BufferedXXX
		 * - 속도 성능 향상 목적의 보조 스트림
		 * - 내부적으로 버퍼공간을 제시항 데이터를 모아뒀다가 한번에 입출력 진행
		 */
		
		BufferedDao dao = new BufferedDao();
		dao.fileRead();
		 
	}
}
