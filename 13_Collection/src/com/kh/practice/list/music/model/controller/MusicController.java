package com.kh.practice.list.music.model.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for (Music m : list) {
            if (m.getTitle().equals(title)) return m;
        }
        return null;
	}
	
	public Music removeMusic(String title) {
		for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(title)) {
                return list.remove(i); 
            }
        }
		
		/* 방법2
		 * object o = searchMusic(title);
		 * m = (Music) o;
		 * list.remove(o);
		 */
        return null;
	}
	
	public Music setMusic(String title, Music music) {
		for (int i = 0; i < list.size(); i++) {
            if (music.getTitle().equals(title)) {
                return list.set(i, music); 
            }
        }
        return null;
	}
	
	public int ascTitle() {
		Comparator<Music> comp = new AscTitle();
		Collections.sort(list, comp);
		
		return 1;
	}
	
	public int descSinger() {
		Comparator<Music> comp2 = Collections.reverseOrder();
		Collections.sort(list,comp2);
		return 1;
	}
}
