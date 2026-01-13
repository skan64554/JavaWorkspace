package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result = false;
		result = lottery.remove(l); // 전달받은 l을 lottery에서 삭제 성공 -> true, 실패 -> false
		
		if(result && win != null)
			win.remove(l);
		
		return result;
	}
	
	public HashSet<Lottery> winObject() {
		// 추첨 대사장 중에서 랜떰으로 뽑아 당첨 목록에 넣는 메소드
		
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고
		List<Lottery> list = new ArrayList<>(lottery);
		Collections.shuffle(list); // 데이터 섞어주기
		
		if(list.size() < 4) return null;
		
		for(int i = 0; win.size() < 4; i++) {
			win.add(list.get(i));
		}
		
		return win;
		// 만일 당첨자 모골겡 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움	
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		winObject(); // 당첨자 목록 채우기
		
		TreeSet<Lottery> sortedWin = new TreeSet<>(new SortedLottery());
        sortedWin.addAll(win); 
        return sortedWin;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
