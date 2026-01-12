package com.kh.practice.list.music.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music> {
	
	private String title;
	private String singer;
	Music(){}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.title);
	}
	
	
	
	
}
